package com.example.foodorderapp.feature.home.subFeature.filters.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.home.subFeature.filters.ui.screen.FilterScreen
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.utils.LocalNavigation

fun NavGraphBuilder.filterNavGraph() {

    composable<Home.Filter> {
        val navController = LocalNavigation.current
        FilterScreen(navController = navController)
    }
}
