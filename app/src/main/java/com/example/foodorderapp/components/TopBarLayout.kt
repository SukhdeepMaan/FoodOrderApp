package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopBarLayout(
    modifier: Modifier = Modifier,
    title: @Composable (()-> Unit)? = null,
    leadingIcon: @Composable (RowScope.() -> Unit)? = null,
    trailingIcon: @Composable (RowScope.() -> Unit)? = null,
    ) {
    Box(modifier = modifier.fillMaxWidth().requiredHeight(56.dp)) {
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