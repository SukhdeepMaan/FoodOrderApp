package com.example.foodorderapp.feature.profile.subFeatures.changePassword.ui.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.profile.common.navigation.Profile
import com.example.foodorderapp.feature.profile.subFeatures.changePassword.ui.screen.ChangePasswordScreen

fun NavGraphBuilder.changePasswordNavGraph() {

    composable<Profile.ChangePassword> {
        ChangePasswordScreen()
    }
}