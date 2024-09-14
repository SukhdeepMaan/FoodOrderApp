package com.example.foodorderapp.feature.onBoarding.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.onBoarding.ui.screen.OnBoardingScreen
import com.example.foodorderapp.navigation.Route
import com.example.foodorderapp.utils.LocalNavigation
import kotlinx.serialization.Serializable

sealed class OnBoard : Route() {
    @Serializable
    object OnBoarding
}

fun NavGraphBuilder.onBoardingNavGraph() {
    composable<OnBoard.OnBoarding> {
        val navController = LocalNavigation.current
        OnBoardingScreen(
            viewModel = hiltViewModel(),
            onNavigate = {
                navController.navigate(it) {
                    popUpTo(OnBoard.OnBoarding) { inclusive = true }
                }
            }
        )
    }
}