package com.example.foodorderapp.feature.auth.signIn.ui.screens.screenOtp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CustomOtpTextField(
    modifier: Modifier = Modifier,
    value: String,
    focusRequester: FocusRequester,
    onKeyEvent: (KeyEvent)-> Boolean,
    onValueChange: (String) -> Unit
) {
    BasicTextField(
        modifier = modifier
            .background(Color(0xFFFAFAFA))
            .width(48.dp)
            .focusRequester(focusRequester)
            .onPreviewKeyEvent(onKeyEvent),
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        maxLines = 1,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        textStyle = MaterialTheme.typography.titleLarge.copy(
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    ) {
    Column{
            Box(
                modifier = Modifier
                    .size(36.dp),
                contentAlignment = Alignment.Center
            ) {
                it()
            }
            HorizontalDivider(
                modifier = Modifier.wrapContentSize(),
                color = Color.Black
            )
        }
    }
}
