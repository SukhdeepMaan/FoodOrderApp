package com.example.foodorderapp.feature.signIn.screens.sreenSignin

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.components.SignWithGoogleFacebook
import com.example.foodorderapp.feature.signIn.screens.components.ClickableButtons
import com.example.foodorderapp.feature.signIn.screens.components.DoNotHaveAccountAndCreateAccount
import com.example.foodorderapp.feature.signIn.screens.components.EmailAddressTextWithInput
import com.example.foodorderapp.feature.signIn.screens.components.ForgetPasswordButton
import com.example.foodorderapp.feature.signIn.screens.components.NamePassTextOrButtonBelowHeader
import com.example.foodorderapp.feature.signIn.screens.components.OrText
import com.example.foodorderapp.feature.signIn.screens.components.PasswordWithTextField
import com.example.foodorderapp.feature.signIn.screens.components.SignInButton
import com.example.foodorderapp.feature.signIn.screens.components.WelcomeText
import com.example.foodorderapp.ui.theme.googleColor

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

    SignInSection(
        modifier = modifier.pointerInput(key1 = Unit) {
            detectTapGestures(onTap = {
                focusManager.clearFocus()
            })
        },
        header = {
            AppHeader(
                title = stringResource(id = R.string.sign_in),
            ) {}
        },
        welcome = {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                WelcomeText()
                NamePassTextOrButtonBelowHeader()
            }
        },
        inputFields = {
            Column {
                Spacer(modifier = Modifier.heightIn(24.dp))
                EmailAddressTextWithInput(
                    modifier = Modifier.focusRequester(emailFocusRequester),
                    showIcon = checkIcon,
                    value = emailAddress,
                    onValueChange = { emailAddress = it },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone,
                        imeAction = ImeAction.Next
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                PasswordWithTextField(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .focusRequester(passwordFocusRequester),
                    value = password,
                    onValueChange = { password = it }
                )
            }
        },
        forgotPassword = {
            ForgetPasswordButton(onClick = {})
        },
        signInButton = {
            SignInButton(onClick = {}, modifier = Modifier.fillMaxWidth())
        },
        haveAccounts = {
            DoNotHaveAccountAndCreateAccount(
                doNotHaveAccount = {},
                createAccount = {}
            )
            OrText()
        },
        connects = {
            SignWithGoogleFacebook(onClick = {}, modifier = Modifier.padding(vertical = 16.dp))
            SignWithGoogleFacebook(
                onClick = {},
                isFacebook = false,
                text = stringResource(R.string.connect_with_google),
                bgColor = googleColor,
                icon = R.drawable.google_icon
            )
        }
    )
}

@Composable
private fun SignInSection(
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    welcome: (@Composable () -> Unit)? = null,
    inputFields: (@Composable () -> Unit)? = null,
    forgotPassword: (@Composable () -> Unit)? = null,
    signInButton: (@Composable () -> Unit)? = null,
    haveAccounts: (@Composable () -> Unit)? = null,
    connects: (@Composable () -> Unit)? = null
) {
    Column(
        modifier = modifier
    ) {
        header?.invoke()
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            item {
                welcome?.invoke()
                inputFields?.invoke()
                forgotPassword?.invoke()
                signInButton?.invoke()
                haveAccounts?.invoke()
                connects?.invoke()
            }
        }
    }
}

