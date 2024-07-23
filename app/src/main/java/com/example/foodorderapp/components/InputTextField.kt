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
import com.example.foodorderapp.ui.theme.outlineColor
import com.example.foodorderapp.ui.theme.poppinsRegular
import com.example.foodorderapp.utils.onValueChange

@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    value: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    @DrawableRes trailingIcon: Int? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showInputValue: Boolean = true,
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
                verticalAlignment = Alignment.CenterVertically)
            {
                leadingIcon?.let {
                    Box(Modifier.padding(horizontal = 8.dp)) {
                        it.invoke()
                    }
                }
                Box(modifier = Modifier.weight(1f)) {
                    it.invoke()
                }
                AppIcon(
                    modifier = Modifier.align(Alignment.Top),
                    icon = trailingIcon,
                )
            }
            HorizontalDivider(color = outlineColor)
        }
    }
}


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
                verticalAlignment = Alignment.CenterVertically)
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
                color = outlineColor)
        }
    }
}

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
