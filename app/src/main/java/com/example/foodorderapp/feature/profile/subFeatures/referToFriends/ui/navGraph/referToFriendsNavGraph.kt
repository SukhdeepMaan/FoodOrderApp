package com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.profile.common.navigation.Profile
import com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.screen.ReferToFriendScreen

fun NavGraphBuilder.referToFriendsNavGraph() {
    composable<Profile.ReferToFriends> {
        ReferToFriendScreen()
    }
}