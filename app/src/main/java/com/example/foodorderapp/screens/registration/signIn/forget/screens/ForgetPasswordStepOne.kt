package com.example.foodorderapp.screens.registration.signIn.forget.screens


import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.screens.registration.signIn.SignInLayout
import com.example.foodorderapp.screens.registration.signIn.components.EmailAddressTextWithInput
import com.example.foodorderapp.screens.registration.signIn.forget.components.ForgetTopBar
import com.example.foodorderapp.screens.registration.signIn.forget.components.HeaderForgetPassword
import com.example.foodorderapp.screens.registration.signIn.forget.components.ResetPasswordButton
import com.example.foodorderapp.screens.registration.signIn.forget.components.TextAndButtonBelowHeader

@Composable
fun ForgetPasswordStepOne(modifier: Modifier = Modifier) {

    var emailAddress by remember { mutableStateOf("") }
    var checkIcon by remember { mutableStateOf(true) }
    val emailFocusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current

    LaunchedEffect(key1 = Unit) {
        emailFocusRequester.requestFocus()
    }

    SignInLayout(
        modifier = modifier
            .padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
            .pointerInput(key1 = Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
        topBar = { ForgetTopBar() },
        content = {
            item {
                HeaderForgetPassword()
                TextAndButtonBelowHeader()
                Spacer(modifier = Modifier.height(24.dp))
                EmailAddressTextWithInput(
                    modifier = Modifier.focusRequester(emailFocusRequester),
                    value = emailAddress,
                    showIcon = checkIcon,
                    onValueChange = { emailAddress = it }
                )
                Spacer(modifier = Modifier.height(48.dp))
                ResetPasswordButton(onClick = {})
            }
        }
    )
}