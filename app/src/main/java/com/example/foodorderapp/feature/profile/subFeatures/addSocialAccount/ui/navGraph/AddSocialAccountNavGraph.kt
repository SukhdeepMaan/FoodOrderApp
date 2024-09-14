package com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.profile.common.navigation.Profile
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.screen.AddSocialAccountScreen

fun NavGraphBuilder.addSocialAccountNavGraph() {
    composable<Profile.AddSocialAccount> {
        AddSocialAccountScreen()
    }
}