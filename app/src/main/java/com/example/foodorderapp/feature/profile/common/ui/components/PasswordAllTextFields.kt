package com.example.foodorderapp.feature.profile.common.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon
import com.example.foodorderapp.components.LabelAndTextField2
import com.example.foodorderapp.theme.bodyColor

@Composable
fun PasswordAllTextFields(modifier: Modifier = Modifier, hideAll: Boolean = false) {
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var newPassword by remember { mutableStateOf("") }
    var showNewPassword by remember { mutableStateOf(false) }
    var confirmPassword by remember { mutableStateOf("") }
    var showConfirmPassword by remember { mutableStateOf(false) }

    LaunchedEffect(hideAll) {
        showPassword = false
        showNewPassword = false
        showConfirmPassword = false
    }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(36.dp)
    ) {
        LabelAndTextField2(
            labelText = stringResource(id = R.string.password),
            showInputValue = showPassword,
            labelTrailingIcon = {
                IconButton(onClick = {
                    showPassword = !showPassword
                }) {
                    AppIcon(
                        imageVector = if (showPassword) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        tint = bodyColor
                    )
                }
            },
            value = password
        ) {
            password = it
        }
        LabelAndTextField2(
            labelText = stringResource(R.string.new_password),
            showInputValue = showNewPassword,
            labelTrailingIcon = {
                IconButton(onClick = {
                    showNewPassword = !showNewPassword
                }) {
                    AppIcon(
                        imageVector = if (showNewPassword) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        tint = bodyColor
                    )
                }
            },
            value = newPassword
        ) {
            newPassword = it
        }
        LabelAndTextField2(
            labelText = stringResource(R.string.confirm_password),
            showInputValue = showConfirmPassword,
            labelTrailingIcon = {
                IconButton(onClick = {
                    showConfirmPassword = !showConfirmPassword
                }) {
                    AppIcon(
                        imageVector = if (showConfirmPassword) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        tint = bodyColor
                    )
                }
            },
            value = confirmPassword
        ) {
            confirmPassword = it
        }
    }
}