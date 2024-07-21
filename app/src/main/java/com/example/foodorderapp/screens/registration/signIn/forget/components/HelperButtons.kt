package com.example.foodorderapp.screens.registration.signIn.forget.components

import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.components.CustomButton

@Composable
fun ResetPasswordButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(modifier = modifier, onClick = onClick) {
        ResetPasswordText()
    }
}

@Composable
fun SendAgain(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(modifier = modifier, onClick = onClick) {
        SendAgainText()
    }
}

@Composable
fun HavingProblemButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        HavingProblemText()
    }
    
}


