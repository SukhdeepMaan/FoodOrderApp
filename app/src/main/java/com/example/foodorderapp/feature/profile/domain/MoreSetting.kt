package com.example.foodorderapp.feature.profile.domain

import com.example.foodorderapp.R
import com.example.foodorderapp.feature.profile.common.navigation.Profile

data class MoreSetting(
    val id: Int,
    val name: String,
    val icon: Int,
    val description: String,
    val route: Any
)

val moreSettingList = listOf(
    MoreSetting(
        id = 1,
        name = "Rate Us",
        icon = R.drawable.rating_star,
        description = "Rate us on Play Store, App Store",
        route = Profile.RateUs
    ),
    MoreSetting(
        id = 2,
        name = "FAQ",
        icon = R.drawable.faq,
        description = "Frequently Asked Questions",
        route = Profile.FAQ
    ),
    MoreSetting(
        id = 3,
        name = "Logout",
        icon = R.drawable.logout,
        description = "",
        route = Profile.Logout
    )
)