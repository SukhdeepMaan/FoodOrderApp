package com.example.foodorderapp.feature.auth.features.signIn.ui.viewModel.signInEmail

data class SignInState(
    val emailAddress: String = "",
    val password: String = "",
    val isPasswordVisible: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null
)