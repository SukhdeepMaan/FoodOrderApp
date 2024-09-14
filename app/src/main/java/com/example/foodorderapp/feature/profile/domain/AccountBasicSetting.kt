package com.example.foodorderapp.feature.profile.domain

import com.example.foodorderapp.R
import com.example.foodorderapp.feature.profile.common.navigation.Profile


data class AccountBasicSetting(
    val id: Int,
    val name: String,
    val icon: Int,
    val description: String,
    val route : Any
)

val accountBasicSettingList = listOf(
    AccountBasicSetting(1,
        "Profile Information",
        R.drawable.profile,
        "Change your profile information",
        Profile.ProfileInformation
    ),
    AccountBasicSetting(
        2, "Change Password",
        R.drawable.password,
        "Change your password",
        Profile.ChangePassword
    ),
    AccountBasicSetting(3,
        "Payment Method",
        R.drawable.payment_method,
        "Add your credit & debit card",
        Profile.PaymentMethod
    ),
    AccountBasicSetting(4,
        "Billing Address",
        R.drawable.payment_method,
        "Add your billing address",
        Profile.BillingAddress
    ),
    AccountBasicSetting(5,
        "Locations",
        R.drawable.location,
        "Add or remove your delivery locations",
        Profile.Locations
    ),
    AccountBasicSetting(6,
        "Add Social Account",
        R.drawable.social_accout,
        "Add Facebook, Twitter etc",
        Profile.AddSocialAccount
    ),
    AccountBasicSetting(7,
        "Refer to Friends",
        R.drawable.refer_icon,
        "get $10 off for referring friends",
        Profile.ReferToFriends
    ),
)

enum class SettingType(val naming : String) {
    BASICS(""),
    NOTIFICATION("NOTIFICATIONS"),
    MORE("MORE")
}

val settingList: List<Pair<String, List<Any>>> = listOf(
    SettingType.BASICS.naming to accountBasicSettingList,
    SettingType.NOTIFICATION.naming to notificationSettingList,
    SettingType.MORE.naming to moreSettingList
)

