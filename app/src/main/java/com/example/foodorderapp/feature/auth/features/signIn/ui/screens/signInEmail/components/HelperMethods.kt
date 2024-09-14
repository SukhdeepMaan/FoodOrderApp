package com.example.foodorderapp.feature.auth.features.signIn.ui.screens.signInEmail.components

fun checkEmail(email : String) : Boolean {

    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$".toRegex()
    return email.matches(emailRegex)

}