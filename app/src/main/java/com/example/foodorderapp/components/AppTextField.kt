package com.example.foodorderapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.utils.onClick
import com.example.foodorderapp.utils.onValueChange


@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    value: String,
    label: String,
    onTralingIconClick: onClick ={},
    trailingIcon: ImageVector,
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
            keyboardOptions = keyboardOptions,
            trailingIcon = {
                AppIcon(
                    imageVector = trailingIcon,
                    modifier = Modifier.clickable {
                        onTralingIconClick()
                    }
                )
            }
        )
    }
}