package com.example.foodorderapp.feature.profileSettings.screens.screenProfileSetting

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
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.feature.profileSettings.screens.components.AllTextFields
import com.example.foodorderapp.feature.profileSettings.screens.components.ChangeSettingsText
import com.example.foodorderapp.feature.profileSettings.screens.components.ProfileSettingsLayout
import com.example.foodorderapp.feature.profileSettings.screens.components.sampleProfileData

@Composable
fun ProfileSettingsScreen(modifier: Modifier = Modifier) {

    var profileData by remember { mutableStateOf(sampleProfileData) }
    val focusManager = LocalFocusManager.current

    ProfileSettingsLayout(
        modifier = modifier
            .pointerInput(key1 = Unit) {
                detectTapGestures {
                    focusManager.clearFocus()
                }
            },
        topBar = {
            AppHeader(title = stringResource(R.string.profile_settings)) {
            }
        },
        content = {
            item {
                AllTextFields(profileData = profileData) {
                    profileData = it
                }
            }
        },
        bottomBar = {
            CustomButton(
                modifier.padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
            ) {
                ChangeSettingsText()
            }
        }
    )
}