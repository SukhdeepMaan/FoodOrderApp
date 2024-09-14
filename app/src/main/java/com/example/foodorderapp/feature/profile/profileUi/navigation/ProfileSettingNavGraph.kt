package com.example.foodorderapp.feature.profile.profileUi.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.profile.common.navigation.Profile
import com.example.foodorderapp.feature.profile.profileUi.screen.ProfileSettingScreen
import com.example.foodorderapp.utils.LocalNavigation

fun NavGraphBuilder.profileSettingNavGraph() {
    composable<Profile.ProfileSetting> {
        val navController = LocalNavigation.current
        ProfileSettingScreen(
            viewModel = hiltViewModel(),
            onNavigate = {
                navController.navigate(it)
            }
        )
    }
}