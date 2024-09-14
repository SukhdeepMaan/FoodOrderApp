package com.example.foodorderapp.feature.profile.common.ui.components

import com.example.foodorderapp.feature.profile.common.navigation.Profile

inline fun <reified T> getProfileRouteFromStringObject(route: String): T? {
    return when (route) {
        "ProfileInformation" -> Profile.ProfileInformation as? T
        "ProfileSetting" -> Profile.ProfileSetting as? T
        "ChangePassword" -> Profile.ChangePassword as? T
        else -> null
    }
}
