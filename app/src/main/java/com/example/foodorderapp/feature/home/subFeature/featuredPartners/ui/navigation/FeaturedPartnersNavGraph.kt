package com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.screen.FeaturedPartnersScreen

fun NavGraphBuilder.featuredPartnersNavGraph() {

    composable<Home.FeaturedPartners> {
        FeaturedPartnersScreen()
    }
}