package com.example.foodorderapp.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.theme.outlineColor
import com.example.foodorderapp.theme.poppinsRegular
import com.example.foodorderapp.utils.onBooleanChange
import com.example.foodorderapp.utils.onValueChange

/**
 * A customizable input text field composable that supports password input, leading and trailing icons,
 * and various other configurations. It is suitable for both standard and password input fields.
 *
 * @param modifier A [Modifier] to be applied to the text field, allowing for customization of its size, layout, and other properties.
 * Default value is `Modifier`.
 *
 * @param value A [String] representing the current text value of the input field. This parameter is required.
 *
 * @param isPassword A [Boolean] indicating whether the text field is for password input. If `true`, the trailing icon will
 * trigger password visibility toggling. Default value is `false`.
 *
 * @param leadingIcon An optional [Composable] lambda that provides a leading icon to be displayed at the start of the text field. Default is `null`.
 *
 * @param trailingIcon An optional drawable resource ID for the trailing icon. This is typically used for actions like
 * toggling password visibility. Default is `null`.
 *
 * @param keyboardOptions A [KeyboardOptions] object that configures the software keyboard for the text field, such as input type and capitalization.
 * Default value is `KeyboardOptions.Default`.
 *
 * @param showInputValue A [Boolean] indicating whether the text value should be visible. If `false`, the text is obfuscated,
 * typically used for password fields. Default value is `true`.
 *
 * @param onPasswordChange A lambda function that is invoked when the trailing icon for password visibility is clicked.
 * This function receives the new visibility state. Default value is an empty lambda.
 *
 * @param onValueChange A lambda function that is triggered whenever the text value changes. It receives the updated text value as a parameter. This parameter is required.
 */

@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    value: String,
    isPassword: Boolean = false,
    leadingIcon: @Composable (() -> Unit)? = null,
    @DrawableRes trailingIcon: Int? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showInputValue: Boolean = true,
    onPasswordChange: onBooleanChange = {},
    onValueChange: onValueChange
) {
    BasicTextField(
        modifier = modifier.padding(top = 12.dp),
        singleLine = true,
        keyboardOptions = keyboardOptions,
        visualTransformation = if (showInputValue) VisualTransformation.None else PasswordVisualTransformation(),
        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = poppinsRegular,
            color = Color.Black
        ),
        value = value,
        onValueChange = onValueChange
    ) {
        Column {
            Row(
                modifier = Modifier.padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                leadingIcon?.let {
                    Box(Modifier.padding(horizontal = 8.dp)) {
                        it.invoke()
                    }
                }
                Box(modifier = Modifier.weight(1f)) {
                    it.invoke()
                }
                if (isPassword)
                    AppIcon(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .clickable {
                                onPasswordChange(!showInputValue)
                            },
                        icon = trailingIcon,
                    )
                else
                    AppIcon(
                        modifier = Modifier
                            .align(Alignment.Top),
                        icon = trailingIcon,
                    )
            }
            HorizontalDivider(color = outlineColor)
        }
    }
}


/**
 * A flexible input text field composable that supports leading and trailing icons, focus control,
 * and various other configurations. It is suitable for standard input fields and general text input.
 *
 * @param modifier A [Modifier] to be applied to the text field, allowing for customization of its size, layout, and other properties.
 * Default value is `Modifier`.
 *
 * @param enabled A [Boolean] indicating whether the text field is enabled. When `false`, the text field is not editable.
 * Default value is `true`.
 *
 * @param value A [String] representing the current text value of the input field. This parameter is required.
 *
 * @param leadingIcon An optional [Composable] lambda that provides a leading icon to be displayed at the start of the text field. Default is `null`.
 *
 * @param trailingIcon An optional [Composable] lambda that provides a trailing icon to be displayed at the end of the text field. Default is `null`.
 *
 * @param keyboardOptions A [KeyboardOptions] object that configures the software keyboard for the text field, such as input type and capitalization.
 * Default value is `KeyboardOptions.Default`.
 *
 * @param focusRequester A [FocusRequester] that allows you to control the focus state of the text field. Default value is `FocusRequester()`.
 *
 * @param showInputValue A [Boolean] indicating whether the text value should be visible. If `false`, the text is obfuscated,
 * typically used for password fields. Default value is `true`.
 *
 * @param onValueChange A lambda function that is triggered whenever the text value changes. It receives the updated text value as a parameter. This parameter is required.
 */

@Composable
fun InputTextField2(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    value: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    focusRequester: FocusRequester = FocusRequester(),
    showInputValue: Boolean = true,
    onValueChange: onValueChange
) {
    BasicTextField(
        modifier = modifier
            .focusRequester(focusRequester)
            .padding(top = 12.dp),
        singleLine = true,
        enabled = enabled,
        keyboardOptions = keyboardOptions,
        visualTransformation = if (showInputValue) VisualTransformation.None else PasswordVisualTransformation(),
        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = poppinsRegular,
            color = Color.Black
        ),
        value = value,
        onValueChange = onValueChange
    ) {
        Column {
            Row(
                modifier = Modifier.padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                leadingIcon?.let {
                    Box(Modifier.padding(horizontal = 8.dp)) {
                        it.invoke()
                    }
                }
                Box(modifier = Modifier.weight(1f)) {
                    it.invoke()
                }
                trailingIcon?.let {
                    Box(Modifier.padding(horizontal = 8.dp)) {
                        it.invoke()
                    }
                }
            }
            HorizontalDivider(
                thickness = 1.5.dp,
                color = outlineColor
            )
        }
    }
}

/**
 * A composable function that displays a customizable trailing icon. The icon can be either a drawable resource
 * or an [ImageVector], and can handle click actions through a lambda function.
 *
 * @param modifier A [Modifier] to be applied to the icon, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param tint A [Color] to tint the icon. If not specified, the icon will be displayed with its default color.
 * Default value is `Color.Unspecified`.
 *
 * @param icon An optional drawable resource ID to be used as the icon. If provided, this icon will be displayed. Default is `null`.
 *
 * @param vectorIcon An optional [ImageVector] to be used as the icon. If provided, this vector image will be displayed. Default is `null`.
 *
 * @param onClick A lambda function that will be invoked when the icon is clicked. Default value is an empty lambda.
 */

@Composable
fun CustomTrailingIcon(
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified,
    icon: Int? = null,
    vectorIcon: ImageVector? = null,
    onClick: () -> Unit = {}
) {
    icon?.let {
        Icon(
            painterResource(
                id = it
            ),
            contentDescription = "Done",
            tint = tint,
            modifier = modifier.clickable { onClick() }
        )
    }
    vectorIcon?.let {
        Icon(
            modifier = modifier.clickable { onClick() },
            imageVector = it,
            tint = tint,
            contentDescription = "Done"
        )
    }
}
