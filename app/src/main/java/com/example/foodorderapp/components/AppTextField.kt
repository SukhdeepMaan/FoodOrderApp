package com.example.foodorderapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.foodorderapp.utils.onClick
import com.example.foodorderapp.utils.onValueChange

/**
 * A customizable composable function that provides a labeled text field with an optional trailing icon.
 * This text field can be used for various input types, including passwords, where the visibility of the input
 * can be toggled using the trailing icon.
 *
 * @param modifier A [Modifier] to be applied to both the label and the text field, allowing customization
 * of size, padding, and other properties. Default value is `Modifier`.
 *
 * @param value A [String] representing the current text value of the text field. This parameter is required.
 *
 * @param label A [String] that represents the label displayed above the text field.
 *
 * @param onTrailingIconClick A lambda function that will be invoked when the trailing icon is clicked.
 * This can be used to handle actions like toggling password visibility.
 * Default value is an empty lambda.
 *
 * @param trailingIcon An [ImageVector] used as the icon displayed at the end of the text field.
 * This is typically used for actions like showing or hiding the password.
 *
 * @param isShowPassword A [Boolean] that determines whether the text should be shown as plain text or obfuscated
 * (e.g., for passwords). If `true`, the text is shown as plain text. Default value is `true`.
 *
 * @param keyboardOptions A [KeyboardOptions] object that configures the software keyboard for the text field,
 * such as input type, capitalization, and more. Default value is `KeyboardOptions()`.
 *
 * @param onValueChange A lambda function that is triggered whenever the text value changes. It receives the updated
 * text value as a parameter and is required for handling text input changes.
 */

@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    value: String,
    label: String,
    onTrailingIconClick: onClick = {},
    trailingIcon: ImageVector?,
    isShowPassword: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    onValueChange: onValueChange
) {
    Column {
        Text(
            modifier = modifier,
            text = label,
            style = MaterialTheme.typography.bodySmall
        )
        TextField(
            modifier = modifier.fillMaxWidth(),
            value = value,
            visualTransformation = if (isShowPassword) VisualTransformation.None
            else PasswordVisualTransformation(),
            onValueChange = onValueChange,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            singleLine = true,
            keyboardOptions = keyboardOptions,
            trailingIcon = {
                AppIcon(
                    imageVector = trailingIcon,
                    modifier = Modifier.clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() }
                    ) {
                        onTrailingIconClick()
                    }
                )
            }
        )
    }
}