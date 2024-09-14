package com.example.foodorderapp.feature.profile.common.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A composable function that provides a layout structure for screens that include
 * a top bar, a scrollable content area using `LazyColumn`, and a bottom bar.
 * This layout is ideal for profile or settings screens.
 *
 * @param modifier A [Modifier] to be applied to the root `Column` composable.
 * It allows customization of the layout's size, padding, and other behaviors.
 * Default value is `Modifier`.
 *
 * @param topBar An optional [Composable] slot for a top bar. This could be used
 * for adding a header, toolbar, or any other UI component that should appear at
 * the top of the screen. If not provided, no top bar will be displayed.
 *
 * @param content A lambda function that provides the content to be displayed in
 * the `LazyColumn`. This should include all the items or sections to be shown
 * in the scrollable area.
 *
 * @param bottomBar A [Composable] slot for a bottom bar. This is used to add a
 * fixed component at the bottom of the screen, such as a navigation bar or action
 * buttons. This parameter is mandatory.
 */
@Composable
fun ProfileSettingsLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit)? = null,
    content: LazyListScope.() -> Unit,
    bottomBar: @Composable () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        topBar.let { it?.invoke() }
        LazyColumn(
            Modifier.weight(1f),
            contentPadding = PaddingValues(16.dp)
        ) {
            content()
        }
        bottomBar()
    }
}