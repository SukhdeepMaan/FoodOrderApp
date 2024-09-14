package com.example.foodorderapp.feature.home.common.navigation

import androidx.navigation.NavGraphBuilder
import com.example.foodorderapp.feature.home.subFeature.filters.ui.navigation.filterNavGraph
import com.example.foodorderapp.feature.home.homeUi.navigation.homePageNavGraph
import com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.navigation.featuredPartnersNavGraph
import com.example.foodorderapp.navigation.Route
import kotlinx.serialization.Serializable

@Serializable
sealed class Home : Route() {

    @Serializable
    data object HomePage : Home()

    @Serializable
    data object Filter : Home()

    @Serializable
    data object FeaturedPartners : Home()

    @Serializable
    data object BestPickerRestaurant : Home()

    @Serializable
    data object AllRestaurants : Home()
}

fun NavGraphBuilder.homeNavGraph() {

    homePageNavGraph()
    filterNavGraph()
    featuredPartnersNavGraph()

}