package com.example.foodorderapp.feature.onBoarding.ui.screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun OnBoardingLayout(
    modifier: Modifier = Modifier,
    pagerContent: (@Composable (modifier: Modifier) -> Unit)? = null,
    indicators: (@Composable () -> Unit)? = null,
    buttons: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier
    ) {
        pagerContent?.invoke(Modifier.weight(1f))
        indicators?.invoke()
        buttons?.invoke()
    }
}