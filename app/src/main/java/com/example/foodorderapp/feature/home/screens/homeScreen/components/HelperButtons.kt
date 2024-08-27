package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SeeAllButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    TextButton(
        modifier = modifier,
        onClick = onClick,
    ) {
        SeeAllText()
    }
}