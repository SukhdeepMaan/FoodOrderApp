package com.example.foodorderapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * A composable function that displays a headline text with customizable style and padding.
 * This is typically used for section headers or prominent text in a UI.
 *
 * @param modifier A [Modifier] to be applied to the text, allowing for customization of its size, padding, and other properties.
 * Default value is `Modifier`.
 *
 * @param text A [String] representing the text content to be displayed.
 *
 * @param style A [TextStyle] that defines the appearance of the text. The default style is set to
 * `MaterialTheme.typography.headlineLarge` with a thin font weight.
 */

@Composable
fun HeadLineText(
    modifier: Modifier = Modifier, text: String,
    style: TextStyle = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Thin)
) {
    Text(
        modifier = modifier.padding(top = 8.dp, bottom = 16.dp),
        text = text, style = style
    )
}
