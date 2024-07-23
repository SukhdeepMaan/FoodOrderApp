package com.example.foodorderapp.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.text.TextStyle

@Composable
fun LabelAndTextField(
    modifier: Modifier = Modifier,
    text: String,
    value: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    @DrawableRes trailingIcon: Int? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showInputValue: Boolean = true,
    onValueChange: (String) -> Unit
) {
    Column(modifier = modifier) {
        LabelText(text = text)
        InputTextField(
            value = value,
            trailingIcon = trailingIcon,
            leadingIcon =  leadingIcon,
            keyboardOptions = keyboardOptions,
            showInputValue = showInputValue,
            onValueChange = onValueChange
        )
    }
}


@Composable
fun LabelAndTextField2(
    modifier: Modifier = Modifier,
    labelText: String,
    value: String,
    enabled: Boolean = true,
    labelTrailingIcon: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    focusRequester: FocusRequester = FocusRequester(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showInputValue: Boolean = true,
    onValueChange: (String) -> Unit
) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            LabelText(
                modifier = Modifier.weight(1f),
                text = labelText)
            labelTrailingIcon?.invoke()
        }
        InputTextField2(
            value = value,
            enabled = enabled,
            trailingIcon = trailingIcon,
            leadingIcon =  leadingIcon,
            keyboardOptions = keyboardOptions,
            focusRequester = focusRequester,
            showInputValue = showInputValue,
            onValueChange = onValueChange
        )
    }
}

@Composable
fun LabelText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = MaterialTheme.typography.bodySmall
) {
    Text(
        modifier = modifier,
        text = text,
        style = style
    )
}