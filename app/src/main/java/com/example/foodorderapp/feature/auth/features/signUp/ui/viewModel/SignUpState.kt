package com.example.foodorderapp.feature.auth.features.signUp.ui.viewModel


data class SignUpState(
    var name : String = "",
    var emailAddress : String = "",
    var password : String = "",
    val isPasswordVisible: Boolean = false,
)
