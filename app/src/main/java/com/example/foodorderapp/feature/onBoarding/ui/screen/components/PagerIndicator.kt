package com.example.foodorderapp.feature.onBoarding.ui.screen.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.theme.accentColor

@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier,
    pageCount: Int,
    currentPage: Int,
    onCurrentPageChanged: (Int) -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(pageCount) { counter ->
            // Animating width
            val width by animateDpAsState(
                targetValue = if (currentPage == counter) 36.dp else 12.dp,
                animationSpec = tween(durationMillis = 300), label = ""
            )
            // Animating height for a more dynamic effect
            val height by animateDpAsState(
                targetValue = if (currentPage == counter) 14.dp else 12.dp,
                animationSpec = tween(durationMillis = 300), label = ""
            )

            Canvas(
                modifier = Modifier
                    .height(height)
                    .width(width)
                    .clickable(
                        indication = null,
                        interactionSource = remember {
                            MutableInteractionSource()
                        }
                    ) {
                        onCurrentPageChanged(counter)
                    }
                    .padding(2.dp)
            ) {
                drawRoundRect(
                    color = if (currentPage == counter) accentColor else Color.LightGray,
                    size = size,
                    cornerRadius = CornerRadius(8.dp.toPx())
                )
            }
        }
    }
}


@Composable
fun PagerIndicator2(
    modifier: Modifier = Modifier,
    pageCount: Int,
    currentPage: Int,
    onCurrentPageChanged: (Int) -> Unit
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(pageCount) { counter ->
            // Animating width
            val width by animateDpAsState(
                targetValue = if (currentPage == counter) 16.dp else 12.dp,
                animationSpec = tween(durationMillis = 300), label = ""
            )

            Canvas(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .height(8.dp)
                    .width(width)
                    .clickable(
                        indication = null,
                        interactionSource = remember {
                            MutableInteractionSource()
                        }
                    ) {
                        onCurrentPageChanged(counter)
                    }
                    .padding(2.dp)
            ) {
                drawRoundRect(
                    color = if (currentPage == counter) Color.White else Color.LightGray,
                    size = size,
                    cornerRadius = CornerRadius(8.dp.toPx())
                )
            }
        }
    }
}