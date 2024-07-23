package com.example.foodorderapp.feature.signIn.screens.sreenSignin

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.signIn.screens.components.ClickableButtons
import com.example.foodorderapp.feature.signIn.screens.components.EmailAddressTextWithInput
import com.example.foodorderapp.feature.signIn.screens.components.NamePassTextOrButtonBelowHeader
import com.example.foodorderapp.feature.signIn.screens.components.PasswordWithTextField
import com.example.foodorderapp.feature.signIn.screens.components.WelcomeText

@Composable
fun SignInScreen(modifier: Modifier = Modifier) {
    var emailAddress by remember { mutableStateOf("") }
    var checkIcon by remember { mutableStateOf(true) }
    var password by remember { mutableStateOf("") }
    val emailFocusRequester = remember { FocusRequester() }
    val passwordFocusRequester = remember { FocusRequester() }
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
        topBar = {
            AppHeader(
                title = stringResource(id = R.string.sign_in),
            ) {}
        },
        content = {
            item {
                WelcomeText()
                NamePassTextOrButtonBelowHeader()
                Spacer(modifier = Modifier.height(24.dp))
                EmailAddressTextWithInput(
                    modifier = Modifier.focusRequester(emailFocusRequester),
                    showIcon = checkIcon,
                    value = emailAddress,
                    onValueChange = { emailAddress = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )
                Spacer(modifier = Modifier.height(16.dp))
                PasswordWithTextField(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .focusRequester(passwordFocusRequester),
                    value = password,
                    onValueChange = { password = it }
                )
                ClickableButtons(
                    forgetPassword = {},
                    signIn = {},
                    createAccount = {},
                    doNotHaveAccount = {},
                    signInWithFacebook = {},
                    signInWithGoogle = {}
                )
            }
        }
    )
}
