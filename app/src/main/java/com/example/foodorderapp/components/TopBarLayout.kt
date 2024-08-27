package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A composable function that provides a customizable top bar layout with optional leading and trailing icons,
 * as well as a centered title. The layout ensures that the icons and title are properly aligned and sized.
 *
 * @param modifier A [Modifier] to be applied to the top bar layout, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param title An optional [Composable] lambda that provides the content for the title, typically centered in the top bar.
 * If provided, the title is displayed in the center of the top bar.
 *
 * @param leadingIcon An optional [Composable] lambda that provides the content for the leading icon, typically aligned to the start of the top bar.
 * This could be used for navigation or other primary actions.
 *
 * @param trailingIcon An optional [Composable] lambda that provides the content for the trailing icon, typically aligned to the end of the top bar.
 * This could be used for secondary actions or additional options.
 */
@Composable
fun TopBarLayout(
    modifier: Modifier = Modifier,
    title: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (RowScope.() -> Unit)? = null,
    trailingIcon: @Composable (RowScope.() -> Unit)? = null,
) {
    Box(modifier = modifier
        .fillMaxWidth()
        .heightIn(56.dp, 100.dp)) {
        // leading icon
        Row(modifier = Modifier.align(Alignment.CenterStart)) {
            leadingIcon?.invoke(this)
        }
        // title
        title?.let { Box(modifier = Modifier.align(Alignment.Center)) { it() } }

        // trailing icon
        Row(modifier = Modifier.align(Alignment.CenterEnd)) {
            trailingIcon?.invoke(this)
        }
    }
}