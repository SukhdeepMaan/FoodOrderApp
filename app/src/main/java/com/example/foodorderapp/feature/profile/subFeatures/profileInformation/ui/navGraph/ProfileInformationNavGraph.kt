package com.example.foodorderapp.feature.profile.subFeatures.profileInformation.ui.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.profile.common.navigation.Profile
import com.example.foodorderapp.feature.profile.subFeatures.profileInformation.ui.screen.ProfileInformation

fun NavGraphBuilder.profileInformationNavGraph() {
    composable<Profile.ProfileInformation> {
        ProfileInformation()
    }
}