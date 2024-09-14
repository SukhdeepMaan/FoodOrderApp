package com.example.foodorderapp.feature.home.homeUi.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.feature.home.homeUi.screen.HomeScreen
import com.example.foodorderapp.utils.LocalNavigation

fun NavGraphBuilder.homePageNavGraph() {
    composable<Home.HomePage> {
        val navController = LocalNavigation.current
        HomeScreen(
            homeViewModel = hiltViewModel(),
            onNavigate = { route ->
                navController.navigate(route)
            }
        )
    }
}


