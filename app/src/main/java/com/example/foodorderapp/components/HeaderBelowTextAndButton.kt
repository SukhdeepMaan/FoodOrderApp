package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A composable function that displays a header with one or two lines of text and an optional button below.
 * The text and button can be aligned either to the center or the start of the column based on the `centered` parameter.
 * This is useful for creating a section header with an accompanying action button.
 *
 * @param modifier A [Modifier] to be applied to the root `Column`, allowing for customization of its size, layout, and other properties.
 * Default value is `Modifier`.
 *
 * @param centered A [Boolean] that determines the horizontal alignment of the text and button. If `true`, the content is centered;
 * otherwise, it is aligned to the start. Default value is `false`.
 *
 * @param line1Text A [String] representing the primary text content to be displayed at the top.
 *
 * @param line2Text An optional [String] representing the secondary text content to be displayed below the primary text. Default value is `null`.
 *
 * @param lineGap A [Dp] value that specifies the space between the first and second lines of text. Default value is `12.dp`.
 *
 * @param textButton An optional [Composable] lambda that defines a button or other interactive element to be displayed
 * next to the secondary text. If `null`, no button is displayed. Default value is `null`.
 */

@Composable
fun HeaderBelowTextAndButton(
    modifier: Modifier = Modifier,
    centered: Boolean = false,
    line1Text: String,
    line2Text: String? = null,
    lineGap: Dp = 12.dp,
    textButton: @Composable (() -> Unit)? = null,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = if (centered) Alignment.CenterHorizontally else Alignment.Start
    ) {
        Text(
            text = line1Text,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.secondary
            )
        )
        Row(
            modifier = Modifier.padding(top = lineGap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (line2Text != null) {
                Text(
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.secondary
                    ),
                    text = line2Text
                )
            }
            if (textButton != null) {
                Box(modifier = Modifier.weight(1f)) {
                    textButton()
                }
            }
        }
    }
}
