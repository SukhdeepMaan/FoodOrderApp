package com.example.foodorderapp.feature.auth.signIn.ui.screens.sreenSignin

import android.widget.Toast
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.PanoramaFishEye
import androidx.compose.material.icons.filled.RemoveRedEye
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppTextField
import com.example.foodorderapp.components.SignWithGoogleFacebook
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.DoNotHaveAccountAndCreateAccount
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.ForgetPasswordButton
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.NamePassTextOrButtonBelowHeader
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.OrText
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.SignInButton
import com.example.foodorderapp.feature.auth.signIn.ui.screens.components.WelcomeText
import com.example.foodorderapp.typeSafeNavigation.Home
import com.example.foodorderapp.ui.theme.googleColor
import com.example.foodorderapp.utils.LocalNavigation

@Composable
fun SignInScreen(modifier: Modifier = Modifier) {
    var emailAddress by remember { mutableStateOf("") }
    var checkIcon by remember { mutableStateOf(true) }
    var password by remember { mutableStateOf("") }
    val emailFocusRequester = remember { FocusRequester() }
    val passwordFocusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    var isPasswordShow by remember {
        mutableStateOf(true)
    }
    val navController = LocalNavigation.current

    val context = LocalContext.current
    val toast = Toast.makeText(context,
        stringResource(R.string.this_feature_is_currently_under_development), Toast.LENGTH_SHORT)

    LaunchedEffect(key1 = Unit) {
        emailFocusRequester.requestFocus()
    }

    SignInSection(
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
                    value = emailAddress,
                    label = stringResource(id = R.string.email_address),
                    trailingIcon = Icons.Default.Check,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    )
                ) {
                    emailAddress = it
                }
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(
                    value = password,
                    label = stringResource(id = R.string.password),
                    trailingIcon = if (isPasswordShow) Icons.Default.RemoveRedEye else Icons.Default.PanoramaFishEye,
                    isShowPassword = isPasswordShow,
                    onTrailingIconClick = {
                        isPasswordShow = !isPasswordShow
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    )
                ) {
                    password = it
                }

            }
        },
        forgotPassword = {
            ForgetPasswordButton(onClick = {
                navController.navigate(Auth.ForgetPasswordSetOne)
            })
        },
        signInButton = {
            SignInButton(modifier = Modifier.fillMaxWidth(), onClick = {
                navController.navigate(Home(1))
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
            SignWithGoogleFacebook(onClick = {  toast.show() }, modifier = Modifier.padding(vertical = 16.dp))
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

