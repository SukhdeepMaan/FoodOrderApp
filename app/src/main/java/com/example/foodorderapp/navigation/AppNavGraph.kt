package com.example.foodorderapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.foodorderapp.feature.auth.common.navigation.authNavGraph
import com.example.foodorderapp.feature.home.common.navigation.homeNavGraph
import com.example.foodorderapp.feature.onBoarding.ui.navigation.OnBoard
import com.example.foodorderapp.feature.onBoarding.ui.navigation.onBoardingNavGraph
import com.example.foodorderapp.feature.profile.common.navigation.profileNavGraph
import com.example.foodorderapp.feature.search.ui.navigation.searchNavGraph
import com.example.foodorderapp.utils.LocalNavigation

abstract class Route

@Composable
fun AppNavGraph() {

    NavHost(
        navController = LocalNavigation.current,
        startDestination = OnBoard.OnBoarding ,
    ) {

        onBoardingNavGraph()
        authNavGraph()
        homeNavGraph()
        searchNavGraph()
        profileNavGraph()
    }
}