package com.example.foodorderapp.feature.home.subFeature.filters.ui.screen.components

import com.example.foodorderapp.feature.home.subFeature.filters.domain.SelectedParameters


fun isSelectedItem(
    parameter: String,
    item: String,
    uiState: SelectedParameters
): Boolean {
    return when (parameter) {
        "CATEGORIES" -> item == uiState.category
        "DIETARY" -> item == uiState.dietary
        else -> false
    }
}

fun updated(
    parameter: String,
    item: String,
    uiState: SelectedParameters
): SelectedParameters {
    return when (parameter) {
        "CATEGORIES" -> uiState.copy(category = item)
        "DIETARY" -> uiState.copy(dietary = item)
        else -> uiState
    }
}
