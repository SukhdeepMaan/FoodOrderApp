package com.example.foodorderapp.feature.profile.subFeatures.changePassword.ui.screen

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.feature.profile.common.ui.components.ChangePasswordButtonText
import com.example.foodorderapp.feature.profile.common.ui.components.PasswordAllTextFields
import com.example.foodorderapp.feature.profile.common.ui.components.ProfileSettingsLayout

@Composable
fun ChangePasswordScreen(modifier: Modifier = Modifier) {
    var hideAll by remember { mutableStateOf(true) }
    val focusManager = LocalFocusManager.current
    ProfileSettingsLayout(
        modifier = modifier.pointerInput(key1 = Unit) {
            detectTapGestures {
                hideAll = !hideAll
                focusManager.clearFocus()
            }
        },
        content = {
            item {
                PasswordAllTextFields(hideAll = hideAll)
            }
        },
        bottomBar = {
            CustomButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
            ) {
                ChangePasswordButtonText()
            }
        }
    )
}