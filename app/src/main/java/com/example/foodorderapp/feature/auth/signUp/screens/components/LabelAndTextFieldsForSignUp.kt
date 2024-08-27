package com.example.foodorderapp.feature.auth.signUp.screens.components

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.components.LabelAndTextField


@Composable
fun EmailOrNameTextWithInput(
    modifier: Modifier = Modifier,
    showIcon: Boolean = true,
    @StringRes label: Int = R.string.email_address,
    value: String,
    onValueChange: (String) -> Unit
) {
    LabelAndTextField(
        modifier = modifier,
        text = stringResource(label),
        trailingIcon = if (showIcon) R.drawable.check else null,
        value = value,
        onValueChange = onValueChange
    )
}
