package com.example.foodorderapp.feature.auth.features.signUp.ui.viewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor() : ViewModel() {
    private val _signUpState = MutableStateFlow(SignUpState())
    var signUpState : StateFlow<SignUpState> = _signUpState
        private set

    fun onEvent(event: SignUpEvent) {
        when(event) {
            is SignUpEvent.NameChanged -> {
                _signUpState.value = _signUpState.value.copy(name = event.name)
            }
            is SignUpEvent.EmailChanged -> {
                _signUpState.value = _signUpState.value.copy(emailAddress = event.email )
            }
            is SignUpEvent.PasswordChanged -> {
                _signUpState.value = _signUpState.value.copy(password = event.password)
            }
            is SignUpEvent.TogglePasswordVisibility -> {
                _signUpState.value = _signUpState.value.copy(isPasswordVisible = !_signUpState.value.isPasswordVisible)
            }
        }
    }
}