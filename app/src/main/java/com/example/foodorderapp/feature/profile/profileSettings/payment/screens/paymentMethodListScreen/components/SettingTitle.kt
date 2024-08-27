package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.paymentMethodListScreen.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SettingTitle(
    modifier: Modifier = Modifier,
    title: String) {
    if (title.isNotEmpty()) {
        Text(
            text = title,
            modifier = modifier,
            style = MaterialTheme.typography.titleLarge
        )
    }
}