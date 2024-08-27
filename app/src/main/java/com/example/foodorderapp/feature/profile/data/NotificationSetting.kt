package com.example.foodorderapp.feature.profile.data

import com.example.foodorderapp.R

data class NotificationSetting(
    val id : Int,
    val name: String,
    val icon: Int,
    val description: String,
    var isEnabled: Boolean
)

val notificationSettingList = listOf(
    NotificationSetting(
        id = 1,
        name = "Push Notifications",
        icon = R.drawable.notify,
        description = "For daily update you will get it",
        isEnabled = true
    ),
    NotificationSetting(
        id = 2,
        name = "SMS Notifications",
        icon = R.drawable.notify,
        description = "For daily update you will get it",
        isEnabled = false
    ),
    NotificationSetting(
        id = 3,
        name = "Promotional Notifications",
        icon = R.drawable.notify,
        description = "For daily update you will get it",
        isEnabled = true
    )
)