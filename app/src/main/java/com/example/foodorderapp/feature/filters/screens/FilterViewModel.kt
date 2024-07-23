package com.example.foodorderapp.feature.filters.screens

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.feature.filters.data.SelectedParameters
import com.example.foodorderapp.feature.filters.data.sampleSelectedParameters
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FilterViewModel : ViewModel() {
    private val _selectedParameters = MutableStateFlow<SelectedParameters>(sampleSelectedParameters)
    val selectedParametersState = _selectedParameters.asStateFlow()

    fun updateSelectedParameters(newSelectedParameters: SelectedParameters) {
        _selectedParameters.value = newSelectedParameters
    }

    fun clear(parameters: String) {
        _selectedParameters.value = when (parameters) {
            "CATEGORIES" -> _selectedParameters.value.copy(category = "")
            "DIETARY" -> _selectedParameters.value.copy(dietary = "")
            "PRICE RANGE" -> _selectedParameters.value.copy(priceRange = "")
            else -> _selectedParameters.value
        }
    }
}