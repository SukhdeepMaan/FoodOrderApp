package com.example.foodorderapp.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * A customizable button composable that provides a flexible way to create buttons with custom content, color, and shape.
 * The button has a default height and rounded corners, and allows for content customization through a composable lambda.
 *
 * @param modifier A [Modifier] to be applied to the button, allowing for customization of its size, layout, padding, etc.
 * Default value is `Modifier`.
 *
 * @param color A [Color] used for the button's background. By default, it uses the primary color from the current theme.
 * Default value is `MaterialTheme.colorScheme.primary`.
 *
 * @param onClick A lambda function that will be invoked when the button is clicked. This handles the button's click event.
 * Default value is an empty lambda.
 *
 * @param content A composable lambda that allows you to define the content of the button, such as text or icons.
 * The content is placed inside a [RowScope], enabling flexible arrangement of the composables within the button.
 */

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit = {},
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier.heightIn(48.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        ),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        onClick = onClick
    ) {
        content()
    }
}