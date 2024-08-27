package com.example.foodorderapp.feature.auth.forgetPassword.screens


import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.auth.forgetPassword.screens.components.HeaderForgetPassword
import com.example.foodorderapp.feature.auth.forgetPassword.screens.components.ResetPasswordButton
import com.example.foodorderapp.feature.auth.forgetPassword.screens.components.TextAndButtonBelowHeader
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.EmailAddressTextWithInput

@Composable
fun ForgetPasswordStepOne(modifier: Modifier = Modifier, navController: NavHostController) {

    var emailAddress by remember { mutableStateOf("") }
    var checkIcon by remember { mutableStateOf(true) }
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
                    showIcon = checkIcon,
                    value = emailAddress,
                    onValueChange = { emailAddress = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )
                Spacer(modifier = Modifier.height(48.dp))
                ResetPasswordButton(onClick = { navController.navigate(Auth.ForgetPasswordSetTwo) })
            }
        }
    )
}