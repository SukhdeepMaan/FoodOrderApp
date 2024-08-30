package com.example.foodorderapp.feature.auth.signIn.viewModel

data class SignInState(
    val emailAddress: String = "",
    val password: String = "",
    val isPasswordVisible: Boolean = true,
    val isLoading: Boolean = false,
    val error: String? = null
)