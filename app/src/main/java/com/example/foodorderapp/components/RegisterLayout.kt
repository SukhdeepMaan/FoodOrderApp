package com.example.foodorderapp.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp

/**
 * A composable function that provides a layout for a registration screen or form. The layout includes an optional top bar,
 * a scrollable content area using `LazyColumn`, and an optional spacing arrangement between the content items. The layout
 * also handles focus management, allowing the keyboard to dismiss when tapping outside input fields.
 *
 * @param modifier A [Modifier] to be applied to the root `Column`, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param topBar An optional [Composable] lambda that provides the content for the top bar. If provided, the top bar is displayed at the top of the screen.
 *
 * @param content A [LazyListScope] lambda that provides the scrollable content to be displayed in the `LazyColumn`. This parameter is required.
 *
 * @param isSpaceBetween A [Boolean] that determines the vertical arrangement of the items in the `LazyColumn`.
 * If `true`, the items are spaced evenly using `Arrangement.SpaceBetween`. If `false`, the items are arranged from the top using `Arrangement.Top`.
 * Default value is `false`.
 */

@Composable
fun RegisterLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit)? = null,
    content: LazyListScope.() -> Unit,
    isSpaceBetween: Boolean = false
) {
    val focusManager = LocalFocusManager.current
    Column(
        modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
    ) {
        topBar?.let { it() }
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
            verticalArrangement = if (isSpaceBetween) Arrangement.SpaceBetween else Arrangement.Top
        ) {
            content.invoke(this)
        }
    }
}