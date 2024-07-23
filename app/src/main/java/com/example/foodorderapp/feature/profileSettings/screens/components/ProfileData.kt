package com.example.foodorderapp.feature.profileSettings.screens.components

data class ProfileData(
    val name: String = "",
    val emailAddress: String = "",
    val phoneNumber: String = "",
    val password: String = ""
)

val sampleProfileData = ProfileData(
    name = "John Doe",
    emailAddress = "john.mclean@examplepetstore.com",
    phoneNumber = "123-456-7890",
    password = "password123"
)