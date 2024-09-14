package com.example.foodorderapp.feature.auth.features.signUp.ui.viewModel


sealed class SignUpEvent {

    data class NameChanged(val name: String) : SignUpEvent()
    data class EmailChanged(val email : String) : SignUpEvent()
    data class PasswordChanged(val password : String) : SignUpEvent()
    data object TogglePasswordVisibility : SignUpEvent()
}