package com.example.foodorderapp.screens.registration.signIn.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.components.CustomTrailingIcon
import com.example.foodorderapp.components.LabelAndTextField

@Composable
fun EmailAddressTextWithInput(
    modifier: Modifier = Modifier,
    showIcon: Boolean = true,
    value: String,
    onValueChange: (String) -> Unit
) {
    LabelAndTextField(
        modifier = modifier,
        text = stringResource(R.string.email_address),
        trailingIcon = {
            if (showIcon) {
                CustomTrailingIcon(
                    icon = R.drawable.check,
                )
            }
        },
        value = value,
        onValueChange = onValueChange
    )
}

@Composable
fun PasswordWithTextField(
    modifier: Modifier = Modifier,
    showIcon: Boolean = true,
    value: String,
    onValueChange: (String) -> Unit
) {
    LabelAndTextField(
        modifier = modifier,
        text = stringResource(R.string.password),
        trailingIcon = {
            if (showIcon) {
                CustomTrailingIcon(
                    icon = R.drawable.check,
                )
            }
        },
        value = value,
        onValueChange = onValueChange
    )
}

