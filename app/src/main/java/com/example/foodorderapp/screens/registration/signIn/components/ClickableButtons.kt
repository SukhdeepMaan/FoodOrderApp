package com.example.foodorderapp.screens.registration.signIn.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
        SignInButton(onClick = signIn)
        DoNotHaveAccountAndCreateAccount(
            doNotHaveAccount = doNotHaveAccount,
            createAccount = createAccount
        )
        OrText()
        SignInWithFacebook(onClick = signInWithFacebook)
        SignInWithGoogle(onClick = signInWithGoogle)
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
