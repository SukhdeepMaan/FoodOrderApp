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

/**
 * A composable function that displays a label followed by an input text field.
 * The input field supports optional leading and trailing icons, keyboard options, and configurable input visibility.
 *
 * @param modifier A [Modifier] to be applied to the root `Column`, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param text A [String] representing the label text displayed above the input field.
 *
 * @param value A [String] representing the current text value of the input field. This parameter is required.
 *
 * @param leadingIcon An optional [Composable] lambda that provides a leading icon to be displayed at the start of the text field. Default is `null`.
 *
 * @param trailingIcon An optional drawable resource ID for the trailing icon. This is typically used for actions like toggling password visibility. Default is `null`.
 *
 * @param keyboardOptions A [KeyboardOptions] object that configures the software keyboard for the text field, such as input type and capitalization. Default value is `KeyboardOptions.Default`.
 *
 * @param showInputValue A [Boolean] indicating whether the text value should be visible. If `false`, the text is obfuscated, typically used for password fields. Default value is `true`.
 *
 * @param onValueChange A lambda function that is triggered whenever the text value changes. It receives the updated text value as a parameter. This parameter is required.
 */

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
            leadingIcon = leadingIcon,
            keyboardOptions = keyboardOptions,
            showInputValue = showInputValue,
            onValueChange = onValueChange
        )
    }
}

/**
 * A composable function that displays a label with an optional trailing icon, followed by an input text field.
 * The input field supports optional leading and trailing icons, keyboard options, focus control, and configurable input visibility.
 *
 * @param modifier A [Modifier] to be applied to the root `Column`, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param labelText A [String] representing the label text displayed above the input field.
 *
 * @param value A [String] representing the current text value of the input field. This parameter is required.
 *
 * @param enabled A [Boolean] indicating whether the text field is enabled. When `false`, the text field is not editable. Default value is `true`.
 *
 * @param labelTrailingIcon An optional [Composable] lambda that provides a trailing icon to be displayed next to the label. Default is `null`.
 *
 * @param leadingIcon An optional [Composable] lambda that provides a leading icon to be displayed at the start of the text field. Default is `null`.
 *
 * @param trailingIcon An optional [Composable] lambda that provides a trailing icon to be displayed at the end of the text field. Default is `null`.
 *
 * @param focusRequester A [FocusRequester] that allows you to control the focus state of the text field. Default value is `FocusRequester()`.
 *
 * @param keyboardOptions A [KeyboardOptions] object that configures the software keyboard for the text field, such as input type and capitalization. Default value is `KeyboardOptions.Default`.
 *
 * @param showInputValue A [Boolean] indicating whether the text value should be visible. If `false`, the text is obfuscated, typically used for password fields. Default value is `true`.
 *
 * @param onValueChange A lambda function that is triggered whenever the text value changes. It receives the updated text value as a parameter. This parameter is required.
 */

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
                text = labelText
            )
            labelTrailingIcon?.invoke()
        }
        InputTextField2(
            value = value,
            enabled = enabled,
            trailingIcon = trailingIcon,
            leadingIcon = leadingIcon,
            keyboardOptions = keyboardOptions,
            focusRequester = focusRequester,
            showInputValue = showInputValue,
            onValueChange = onValueChange
        )
    }
}

/**
 * A simple composable function that displays a text label with customizable style.
 * This is typically used for labeling input fields or other UI components.
 *
 * @param modifier A [Modifier] to be applied to the text, allowing for customization of its size, layout, and other properties. Default value is `Modifier`.
 *
 * @param text A [String] representing the text content of the label.
 *
 * @param style A [TextStyle] that defines the appearance of the label text. Default value is `MaterialTheme.typography.bodySmall`.
 */

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