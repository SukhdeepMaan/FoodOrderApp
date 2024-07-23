package com.example.foodorderapp.feature.onBoarding.screen.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NextPreOrGetStartedButtons(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: @Composable () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(16f)
    ) {
        text()
    }
}