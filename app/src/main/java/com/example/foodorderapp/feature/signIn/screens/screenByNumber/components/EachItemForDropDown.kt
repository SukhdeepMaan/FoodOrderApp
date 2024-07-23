package com.example.foodorderapp.feature.signIn.screens.screenByNumber.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.AppIcon

@Composable
fun EachDropItem(modifier: Modifier = Modifier, country: Country) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        AppIcon(
            modifier = Modifier.size(24.dp),
            icon = country.flag
        )
        Text(text = country.code)
    }
}