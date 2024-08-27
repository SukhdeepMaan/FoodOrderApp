package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.doNotHaveAnyCard.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * A composable function that represents a compact layout.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param topBar A composable lambda for the top bar content. Defaults to an empty composable.
 * @param content A composable lambda for the main content.
 */

@Composable
fun CompactLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        topBar()
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}

/**
 * A composable function that represents a layout for medium and expanded screen sizes.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param topBar A composable lambda for the top bar content. Defaults to an empty composable.
 * @param leftContent A composable lambda for the left content.
 * @param rightContent A composable lambda for the right content.
 */

@Composable
fun MediumAndExpendedLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    leftContent: @Composable () -> Unit,
    rightContent: @Composable () -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        topBar()
        Row(modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                leftContent()
            }
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                rightContent()
            }
        }
    }
}