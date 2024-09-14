package com.example.foodorderapp.feature.home.homeUi.viewModel

sealed class HomeEvent {
    data object FeaturedPartners : HomeEvent()
    data object BestPickerRestaurant : HomeEvent()
    data object AllRestaurants : HomeEvent()

}