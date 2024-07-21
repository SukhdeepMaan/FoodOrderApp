package com.example.foodorderapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    value: String,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showInputValue: Boolean = true,
    onValueChange: (String) -> Unit
    ) {
    TextField(
        modifier = modifier
            .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        trailingIcon = trailingIcon,
        singleLine = true,
        keyboardOptions = keyboardOptions,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
            focusedIndicatorColor = MaterialTheme.colorScheme.secondary
        ),
        visualTransformation = if (showInputValue) VisualTransformation.None else PasswordVisualTransformation()
        )
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
            modifier = modifier.clickable {onClick()}
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
