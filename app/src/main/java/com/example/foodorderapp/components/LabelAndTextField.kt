package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LabelAndTextField(
    modifier: Modifier = Modifier,
    text: String,
    value: String,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showInputValue: Boolean = true,
    onValueChange: (String) -> Unit
) {
    Column(modifier = modifier) {
        LabelText(text = text)
        InputTextField(
            value = value,
            placeholder = placeholder,
            trailingIcon = trailingIcon,
            keyboardOptions = keyboardOptions,
            showInputValue = showInputValue,
            onValueChange = onValueChange)
    }
}

@Composable
fun LabelText(modifier: Modifier = Modifier, text: String) {
    Text(
        modifier = modifier,
        text = text,
        color = MaterialTheme.colorScheme.secondary,)

}