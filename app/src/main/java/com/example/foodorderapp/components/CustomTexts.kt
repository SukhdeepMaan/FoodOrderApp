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

@Preview(showBackground = true)
@Composable
private fun AnyTextView() {
    HeadLineText(text = "")
}

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
