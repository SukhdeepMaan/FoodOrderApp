package com.example.foodorderapp.feature.auth.signIn.viewModel

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.typeSafeNavigation.Route
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class SignInViewModel(private val onNavigation : (Route) -> Unit) : ViewModel() {

    private val _state = MutableStateFlow(SignInState())
    var state = _state.asStateFlow()
        private set

    fun onEvent(even: SignInEvent) {
        when(even) {
            is SignInEvent.EmailChanged -> {
                _state.value = _state.value.copy(emailAddress = even.email)
            }

            is SignInEvent.PasswordChanged -> {
                _state.value = _state.value.copy(password = even.password)
            }

            is SignInEvent.TogglePasswordVisibility -> {
                _state.value = state.value.copy(isPasswordVisible = even.isVisible)
            }

            is SignInEvent.SignInClicked -> {
                // handle sign in logic
                onNavigation(Route.Home(1))

            }

            is SignInEvent.ForgotPasswordClicked -> {
                // handle forget logic
            }
        }
    }
}