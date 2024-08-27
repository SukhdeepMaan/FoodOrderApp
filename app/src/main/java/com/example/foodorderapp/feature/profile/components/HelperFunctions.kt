package com.example.foodorderapp.feature.profile.components

import com.example.foodorderapp.feature.profile.Profile

inline fun <reified T> getProfileRouteFromStringObject(route: String): T? {
    return when (route) {
        "ProfileInformation" -> Profile.ProfileInformation as? T
        "ProfileSetting" -> Profile.ProfileSetting as? T
        "ChangePassword" -> Profile.ChangePassword as? T
        else -> null
    }
}
