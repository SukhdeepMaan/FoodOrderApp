package com.example.foodorderapp.utils.typeSafeNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.authNavGraph
import com.example.foodorderapp.feature.filters.screens.FilterScreen
import com.example.foodorderapp.feature.home.screens.featuredPartners.screens.FeaturedPartnersScreen
import com.example.foodorderapp.feature.home.screens.homeScreen.HomeScreen
import com.example.foodorderapp.feature.location.screen.FindRestaurantScreen
import com.example.foodorderapp.feature.onBoarding.screen.OnBoardingScreen
import com.example.foodorderapp.feature.profile.profileNavGraph
import com.example.foodorderapp.feature.profile.profileSettings.profileInformation.ProfileInformation
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun AppNavGraph(navController: NavHostController, windowInfo: WindowInfo) {
    NavHost(
        navController = navController,
        startDestination = OnBoarding,
    ) {
        composable<OnBoarding> {
            OnBoardingScreen(navController = navController)
        }
        authNavGraph(navController = navController)

        profileNavGraph(navController = navController, windowInfo = windowInfo)

        composable<Home> {
            HomeScreen(navController = navController)
        }
        composable<FeaturedPartner> {
            FeaturedPartnersScreen( navController = navController, windowInfo = windowInfo)
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