package com.example.foodorderapp.feature.onBoarding.screen.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.ui.theme.accentColor

@Preview(showBackground = true)
@Composable
private fun CustomCirclePreview() {
    Box(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        CustomCircle()
    }
}

@Composable
fun CustomCircle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val width = size.width
        drawCircle(
            color = accentColor,
            radius = width/1.5f,
            center = Offset(x = 250f, y = 450f),
            alpha = 0.1f
        )
    }

}