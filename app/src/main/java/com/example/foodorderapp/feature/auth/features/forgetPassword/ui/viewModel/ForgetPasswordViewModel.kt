package com.example.foodorderapp.feature.auth.features.forgetPassword.ui.viewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ForgetPasswordViewModel @Inject constructor() : ViewModel() {

    private var _emailAddress = MutableStateFlow("")
    var emailAddress = _emailAddress.asStateFlow()
        private set

    fun updateEmail(email : String) {
        _emailAddress.value = email
    }
}