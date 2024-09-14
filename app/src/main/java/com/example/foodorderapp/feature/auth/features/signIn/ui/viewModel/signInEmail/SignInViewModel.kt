package com.example.foodorderapp.feature.auth.features.signIn.ui.viewModel.signInEmail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class SignInViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(SignInState())
    var state = _state.asStateFlow()
        private set


    fun onEvent(event: SignInEvent) {
        when(event) {
            is SignInEvent.EmailChanged -> {
                _state.value = _state.value.copy(emailAddress = event.email)
            }

            is SignInEvent.PasswordChanged -> {
                _state.value = _state.value.copy(password = event.password)
            }

            is SignInEvent.TogglePasswordVisibility -> {
                _state.value = state.value.copy(isPasswordVisible = !state.value.isPasswordVisible)
            }

            is SignInEvent.SignInClicked -> {
                // handle sign in logic

            }

            is SignInEvent.ForgotPasswordClicked -> {
                // handle forget logic

            }
        }
    }
}