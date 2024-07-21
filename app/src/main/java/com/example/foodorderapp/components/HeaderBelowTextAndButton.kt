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
import androidx.compose.ui.unit.sp

@Composable
fun HeaderBelowTextAndButton(
    modifier: Modifier = Modifier,
    line1Text: String,
    line2Text: String? = null,
    lineGap: Dp = 12.dp,
    textButton: @Composable (() -> Unit)? = null,
) {
    Column(modifier = modifier) {
        Text(text = line1Text,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.secondary
            )
        )
        Row(
            modifier = Modifier.padding(top = lineGap),
            verticalAlignment = Alignment.CenterVertically) {
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