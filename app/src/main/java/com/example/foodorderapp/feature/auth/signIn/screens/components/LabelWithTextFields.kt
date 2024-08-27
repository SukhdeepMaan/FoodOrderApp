package com.example.foodorderapp.feature.auth.signIn.screens.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.components.LabelAndTextField

@Composable
fun EmailAddressTextWithInput(
    modifier: Modifier = Modifier,
    showIcon: Boolean = true,
    leadingIcon: @Composable() (() -> Unit)? = null,
    value: String,
    label: String = stringResource(R.string.email_address),
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions()
) {
    LabelAndTextField(
        modifier = modifier,
        text = label,
        leadingIcon = leadingIcon,
        trailingIcon = if (showIcon) R.drawable.check else null,
        value = value,
        keyboardOptions = keyboardOptions,
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
        trailingIcon = if (showIcon) R.drawable.check else null,
        value = value,
        onValueChange = onValueChange
    )
}

