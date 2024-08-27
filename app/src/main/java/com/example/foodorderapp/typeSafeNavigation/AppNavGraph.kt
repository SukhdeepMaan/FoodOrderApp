package com.example.foodorderapp.typeSafeNavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.navigation.authNavGraph
import com.example.foodorderapp.feature.filters.screens.FilterScreen
import com.example.foodorderapp.feature.home.screens.featuredPartners.screens.FeaturedPartnersScreen
import com.example.foodorderapp.feature.home.screens.homeScreen.HomeScreen
import com.example.foodorderapp.feature.location.screen.FindRestaurantScreen
import com.example.foodorderapp.feature.onBoarding.screen.OnBoardingScreen
import com.example.foodorderapp.feature.profile.profileNavGraph
import com.example.foodorderapp.utils.LocalNavigation
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun AppNavGraph(navController: NavHostController, windowInfo: WindowInfo) {


    CompositionLocalProvider(
        LocalNavigation provides navController,

    ) {
        NavHost(
            navController = navController,
            startDestination = OnBoarding,
        ) {
            composable<OnBoarding> {
                OnBoardingScreen()
            }
            authNavGraph(navController = navController)

            profileNavGraph(navController = navController, windowInfo = windowInfo)

            composable<Home> {
                HomeScreen(navController = navController)
            }
            composable<FeaturedPartner> {
                FeaturedPartnersScreen(navController = navController, windowInfo = windowInfo)
            }
            composable<BestPickRestaurant> {
                FeaturedPartnersScreen(navController = navController, windowInfo = windowInfo)
            }
            composable<AllRestaurant> {
                FeaturedPartnersScreen(navController = navController, windowInfo = windowInfo)
            }
            composable<Filter> {
                FilterScreen(navController = navController)
            }
            composable<FindRestaurant> {
                FindRestaurantScreen(navController = navController)
            }
        }
    }

}