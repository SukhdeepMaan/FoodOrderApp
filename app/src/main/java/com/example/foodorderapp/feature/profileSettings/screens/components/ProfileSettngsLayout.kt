package com.example.foodorderapp.feature.profileSettings.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A layout for profile settings that includes a top bar, content, and a bottom bar.
 *
 * This composable function arranges the given top bar, content, and bottom bar in a column,
 * filling the entire available size. The content is displayed in a scrollable lazy column
 * with padding.
 *
 * @param modifier The modifier to be applied to the column.
 * @param topBar A composable function that defines the top bar of the layout.
 * @param content A lambda function that defines the content of the lazy column.
 * @param bottomBar A composable function that defines the bottom bar of the layout.
 */

@Composable
fun ProfileSettingsLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit,
    content: LazyListScope.() -> Unit,
    bottomBar: @Composable () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        topBar()
        LazyColumn(
            Modifier.weight(1f),
            contentPadding = PaddingValues(24.dp)
        ) {
            content()
        }
        bottomBar()
    }
}