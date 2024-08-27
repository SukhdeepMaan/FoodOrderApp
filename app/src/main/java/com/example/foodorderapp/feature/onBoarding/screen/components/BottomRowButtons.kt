package com.example.foodorderapp.feature.onBoarding.screen.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.CustomButton

@Composable
fun BottomRowButtons(
    modifier: Modifier = Modifier,
    previewOnClick: () -> Unit = {},
    nextOnClick: () -> Unit = {},
    shouldShowPreviewButton: Boolean = true,
    isNextButton: Boolean = true
) {
    Row(
        modifier = modifier
            .padding(24.dp),
    ) {
        AnimatedVisibility(visible = shouldShowPreviewButton) {
            CustomButton(
                onClick = previewOnClick
            ) {
                PreviewButtonText()
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        CustomButton(onClick = nextOnClick) {
            AnimatedContent(targetState = isNextButton, label = "") { targetState ->
                if (targetState) NextButtonText() else GetStartedButtonText()
            }
        }
    }
}