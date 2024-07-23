package com.example.foodorderapp.feature.location.screen.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.components.AppIcon
import com.example.foodorderapp.components.TopBarLayout

@Composable
fun TopBarForLocationScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit
) {
    TopBarLayout(
        modifier = modifier,
        leadingIcon = {
            IconButton(onClick = onBack) {
                AppIcon(
                    imageVector = Icons.Default.Close,
                )
            }
        }
    )
}