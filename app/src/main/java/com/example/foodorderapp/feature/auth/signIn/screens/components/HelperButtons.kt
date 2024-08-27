package com.example.foodorderapp.feature.auth.signIn.screens.components

import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.components.CustomButton


@Composable
fun SignInButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(modifier = modifier, onClick = onClick) {
        SingInTextForButton()
    }
}


@Composable
fun DoNotHaveAccountButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        DoNotHaveAccountText()
    }
}

@Composable
fun CreateNewAccountButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        CreateNewAccountText()
    }
}

@Composable
fun ForgetPasswordButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        ForgetPasswordText()
    }
}