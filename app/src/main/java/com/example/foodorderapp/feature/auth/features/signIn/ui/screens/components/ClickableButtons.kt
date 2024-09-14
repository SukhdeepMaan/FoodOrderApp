package com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.SignWithGoogleFacebook
import com.example.foodorderapp.theme.googleColor

@Composable
fun ClickableButtons(
    modifier: Modifier = Modifier,
    forgetPassword: () -> Unit,
    signIn: () -> Unit,
    createAccount: () -> Unit,
    doNotHaveAccount: () -> Unit,
    signInWithFacebook: () -> Unit,
    signInWithGoogle: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ForgetPasswordButton(onClick = forgetPassword)
        SignInButton(onClick = signIn, modifier = Modifier.fillMaxWidth())
        DoNotHaveAccountAndCreateAccount(
            doNotHaveAccount = doNotHaveAccount,
            createAccount = createAccount
        )
        OrText()
        SignWithGoogleFacebook(onClick = signInWithFacebook)
        SignWithGoogleFacebook(
            onClick = signInWithGoogle,
            isFacebook = false,
            text = stringResource(R.string.connect_with_google),
            bgColor = googleColor,
            icon = R.drawable.google_icon
        )
    }
}

@Composable
fun DoNotHaveAccountAndCreateAccount(
    modifier: Modifier = Modifier,
    doNotHaveAccount: () -> Unit,
    createAccount: () -> Unit
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        DoNotHaveAccountButton(onClick = doNotHaveAccount)
        CreateNewAccountButton(onClick = createAccount)
    }
}
