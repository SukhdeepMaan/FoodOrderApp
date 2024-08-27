package com.example.foodorderapp.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A composable function that creates a custom circular shape using a `HorizontalDivider`.
 * The circle's size and appearance can be customized through the provided parameters.
 *
 * @param modifier A [Modifier] to be applied to the circle, allowing for customization of its size, layout, and other properties.
 * Default value is `Modifier`.
 *
 * @param size A [Dp] value that defines the diameter of the circle. The same value is used for both the width and height
 * of the circle. Default value is `6.dp`.
 */

@Composable
fun CustomCircle(
    modifier: Modifier = Modifier,
    size: Dp = 6.dp
) {
    HorizontalDivider(
        modifier = modifier
            .size(size)
            .clip(RoundedCornerShape(100)),
        thickness = size,
        color = MaterialTheme.colorScheme.secondary
    )
}