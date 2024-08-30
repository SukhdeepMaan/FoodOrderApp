package com.example.foodorderapp.feature.auth.signIn.viewModel

sealed class SignInEvent {
    data class EmailChanged(val email: String) : SignInEvent()
    data class PasswordChanged(val password: String) : SignInEvent()
    data class TogglePasswordVisibility(val isVisible : Boolean) : SignInEvent()
    data object SignInClicked : SignInEvent()
    data object ForgotPasswordClicked : SignInEvent()
}