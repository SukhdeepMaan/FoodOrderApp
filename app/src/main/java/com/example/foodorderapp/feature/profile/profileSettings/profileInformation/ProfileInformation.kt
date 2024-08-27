package com.example.foodorderapp.feature.profile.profileSettings.profileInformation

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
import androidx.navigation.NavHostController
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.feature.profile.components.AllTextFields
import com.example.foodorderapp.feature.profile.components.ChangeSettingsText
import com.example.foodorderapp.feature.profile.components.ProfileSettingsLayout
import com.example.foodorderapp.feature.profile.components.sampleProfileData

@Composable
fun ProfileInformation(modifier: Modifier = Modifier, navController: NavHostController) {

    var profileData by remember { mutableStateOf(sampleProfileData) }
    val focusManager = LocalFocusManager.current

    ProfileSettingsLayout(
        modifier = modifier
            .pointerInput(key1 = Unit) {
                detectTapGestures {
                    focusManager.clearFocus()
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
                modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
            ) {
                ChangeSettingsText()
            }
        }
    )
}