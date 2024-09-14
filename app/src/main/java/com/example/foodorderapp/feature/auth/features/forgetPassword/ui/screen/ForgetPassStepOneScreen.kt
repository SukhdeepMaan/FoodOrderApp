package com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen


import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen.components.HeaderForgetPassword
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen.components.ResetPasswordButton
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen.components.TextAndButtonBelowHeader
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.viewModel.ForgetPasswordViewModel
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.EmailAddressTextWithInput
import com.example.foodorderapp.navigation.Route

@Composable
fun ForgetPassStepOneScreen(
    modifier: Modifier = Modifier,
    fpViewModel: ForgetPasswordViewModel,
    onNavigate: (Route)-> Unit
) {
    val email = fpViewModel.emailAddress.collectAsState().value
    val emailFocusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current

    LaunchedEffect(key1 = Unit) {
        emailFocusRequester.requestFocus()
    }

    RegisterLayout(
        modifier = modifier
            .pointerInput(key1 = Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
        content = {
            item {
                HeaderForgetPassword()
                TextAndButtonBelowHeader()
                Spacer(modifier = Modifier.height(24.dp))
                EmailAddressTextWithInput(
                    modifier = Modifier.focusRequester(emailFocusRequester),
                    showIcon = com.example.foodorderapp.feature.auth.features.signIn.ui.screens.signInEmail.components.checkEmail(
                        email
                    ),
                    value = email,
                    onValueChange = { fpViewModel.updateEmail(it) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )
                Spacer(modifier = Modifier.height(48.dp))
                ResetPasswordButton(onClick = { onNavigate(Auth.ForgetPassword.ForgetPasswordStepTwo) })
            }
        }
    )
}