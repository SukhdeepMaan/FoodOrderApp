package com.example.foodorderapp.feature.auth.features.signIn.ui.screens.signInEmail

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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.DoNotHaveAccountAndCreateAccount
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.ForgetPasswordButton
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.NamePassTextOrButtonBelowHeader
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.OrText
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.SignInButton
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.SignInLayout
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.WelcomeText
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.signInEmail.components.checkEmail
import com.example.foodorderapp.feature.auth.features.signIn.ui.viewModel.signInEmail.SignInEvent
import com.example.foodorderapp.feature.auth.features.signIn.ui.viewModel.signInEmail.SignInViewModel
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.navigation.Route
import com.example.foodorderapp.theme.googleColor

@Composable
fun SignInEmailScreen(
    modifier: Modifier = Modifier,
    onNavigate: (Route) -> Unit,
    viewModel: SignInViewModel,
) {

    val state by viewModel.state.collectAsState()
    val emailFocusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current

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
                    onValueChange = { viewModel.onEvent(SignInEvent.EmailChanged(it)) },
                    label = stringResource(id = R.string.email_address),
                    trailingIcon = if (checkEmail(state.emailAddress)
                    ) Icons.Default.Check else null,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(
                    value = state.password,
                    onValueChange = { viewModel.onEvent(SignInEvent.PasswordChanged(it)) },
                    label = stringResource(id = R.string.password),
                    trailingIcon = if (state.isPasswordVisible) Icons.Default.RemoveRedEye else Icons.Default.PanoramaFishEye,
                    isShowPassword = state.isPasswordVisible,
                    onTrailingIconClick = { viewModel.onEvent(SignInEvent.TogglePasswordVisibility) },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    )
                )
            }
        },
        forgotPassword = {
            ForgetPasswordButton(onClick = { onNavigate(Auth.ForgetPassword.ForgetPasswordStepOne) })
        },
        signInButton = {
            SignInButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = { onNavigate(Home.HomePage) }
            )
        },
        haveAccounts = {
            DoNotHaveAccountAndCreateAccount(
                doNotHaveAccount = { onNavigate(Auth.SignUp) },
                createAccount = { onNavigate(Auth.SignUp) }
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
