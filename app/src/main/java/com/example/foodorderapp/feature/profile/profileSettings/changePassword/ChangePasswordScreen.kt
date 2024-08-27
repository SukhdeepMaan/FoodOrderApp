package com.example.foodorderapp.feature.profile.profileSettings.changePassword

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.feature.profile.components.ChangePasswordButtonText
import com.example.foodorderapp.feature.profile.components.PasswordAllTextFields
import com.example.foodorderapp.feature.profile.components.ProfileSettingsLayout

@Composable
fun ChangePasswordScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    var hideAll by remember { mutableStateOf(true) }
    val focusManager = LocalFocusManager.current
    ProfileSettingsLayout(
        modifier = modifier.pointerInput(key1 = Unit){
            detectTapGestures {
                hideAll = !hideAll
                focusManager.clearFocus()
            }
        },
        content = {
            item {
                PasswordAllTextFields( hideAll = hideAll)
            }
        },
        bottomBar = {
            CustomButton(
                modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
            ) {
                ChangePasswordButtonText()
            }
        }
    )
}