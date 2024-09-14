package com.example.foodorderapp.feature.auth.features.signIn.ui.screens.SignInPhone.components

import androidx.annotation.DrawableRes
import com.example.foodorderapp.R

data class Country(
    val name: String,
    val code: String,
    @DrawableRes val flag: Int
)

val listOfCountries = listOf(
    Country("India", "+91", R.drawable.india),
    Country("Australia", "+61", R.drawable.au),
    Country("New Zealand", "+64", R.drawable.nz),
    Country("Canada", "+1", R.drawable.ca)
)


