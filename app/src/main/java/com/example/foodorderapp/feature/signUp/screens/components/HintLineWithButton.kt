package com.example.foodorderapp.feature.signUp.screens.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.HeaderBelowTextAndButton

@Composable
fun HintLineWithButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    HeaderBelowTextAndButton(
        modifier = modifier,
        line1Text = "Enter your Name, Email and Password",
        line2Text = "for sign up.",
        lineGap = 2.dp,
        textButton = {
            AlreadyHaveAnAccountButton(onClick = onClick)
        }
    )
}