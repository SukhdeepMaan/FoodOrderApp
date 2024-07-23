package com.example.foodorderapp.feature.filters.data

data class SelectedParameters(
    val category: String,
    val dietary: String,
    val priceRange: String,
)

val sampleSelectedParameters = SelectedParameters(
    category = "Burgers",
    dietary = "Vegetarian",
    priceRange = "$20",
)