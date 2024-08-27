package com.example.foodorderapp.feature.home.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _userId: MutableStateFlow<Int?> = MutableStateFlow(null)
    val userId: StateFlow<Int?> = _userId

    fun setUserId(id: Int) {
        _userId.value = id
    }

    private val _selectedLocation = MutableStateFlow<String?>("abc")
    val selectedLocation: StateFlow<String?> = _selectedLocation

    fun setSelectedLocation(location: String) {
        _selectedLocation.value = location
    }
}