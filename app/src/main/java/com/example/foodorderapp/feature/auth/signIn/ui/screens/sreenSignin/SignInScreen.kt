package com.example.foodorderapp.feature.auth.signIn.ui.screens.sreenSignin

import android.widget.Toast
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.PanoramaFishEye
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppTextField
import com.example.foodorderapp.components.SignWithGoogleFacebook
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.DoNotHaveAccountAndCreateAccount
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.ForgetPasswordButton
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.NamePassTextOrButtonBelowHeader
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.OrText
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.SignInButton
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.SignInLayout
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.WelcomeText
import com.example.foodorderapp.feature.auth.signIn.viewModel.SignInEvent
import com.example.foodorderapp.feature.auth.signIn.viewModel.SignInState
import com.example.foodorderapp.ui.theme.googleColor
import com.example.foodorderapp.utils.LocalNavigation

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    state: SignInState,
    onEvent: (SignInEvent) -> Unit
) {

    val emailFocusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    val navController = LocalNavigation.current

    val context = LocalContext.current
    val toast = Toast.makeText(
        context,
        stringResource(R.string.this_feature_is_currently_under_development),
        Toast.LENGTH_SHORT
    )

    LaunchedEffect(key1 = Unit) { emailFocusRequester.requestFocus() }

    SignInLayout(
        modifier = modifier.pointerInput(key1 = Unit) {
            detectTapGestures(onTap = {
                focusManager.clearFocus()
            })
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
                AppTextField(
                    modifier = Modifier.focusRequester(emailFocusRequester),
                    value = state.emailAddress,
                    onValueChange = { onEvent(SignInEvent.EmailChanged(it)) },
                    label = stringResource(id = R.string.email_address),
                    trailingIcon = Icons.Default.Check,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(
                    value = state.password,
                    onValueChange = { onEvent(SignInEvent.PasswordChanged(it)) },
                    label = stringResource(id = R.string.password),
                    trailingIcon = if (state.isPasswordVisible) Icons.Default.RemoveRedEye else Icons.Default.PanoramaFishEye,
                    isShowPassword = state.isPasswordVisible,
                    onTrailingIconClick = {
                        //isPasswordShow = !isPasswordShow
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    )
                )
            }
        },
        forgotPassword = {
            ForgetPasswordButton(onClick = { })
        },
        signInButton = {
            SignInButton(modifier = Modifier.fillMaxWidth(), onClick = {
                onEvent(SignInEvent.SignInClicked)
            })
        },
        haveAccounts = {
            DoNotHaveAccountAndCreateAccount(
                doNotHaveAccount = {
                    navController.navigate(Auth.SignUp)
                },
                createAccount = {
                    navController.navigate(Auth.SignUp)
                }
            )
            OrText()
        },
        connects = {
            SignWithGoogleFacebook(
                onClick = { toast.show() },
                modifier = Modifier.padding(vertical = 16.dp)
            )
            SignWithGoogleFacebook(
                onClick = { toast.show() },
                isFacebook = false,
                text = stringResource(R.string.connect_with_google),
                bgColor = googleColor,
                icon = R.drawable.google_icon
            )
        }
    )
}
