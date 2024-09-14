package com.example.foodorderapp.feature.auth.features.signIn.ui.viewModel.signInEmail

sealed class SignInEvent {
    data class EmailChanged(val email: String) : SignInEvent()
    data class PasswordChanged(val password: String) : SignInEvent()
    data object TogglePasswordVisibility : SignInEvent()
    data object SignInClicked : SignInEvent()
    data object ForgotPasswordClicked : SignInEvent()
}