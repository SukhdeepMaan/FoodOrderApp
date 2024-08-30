package com.example.foodorderapp.typeSafeNavigation.topBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.home.screens.homeScreen.components.HomeTopBar
import com.example.foodorderapp.feature.profile.Profile
import com.example.foodorderapp.feature.profile.profileSettings.payment.PaymentMethod
import com.example.foodorderapp.typeSafeNavigation.Filter
import com.example.foodorderapp.typeSafeNavigation.Home
import com.example.foodorderapp.utils.LocalNavigation

@Composable
fun TopBarManager(modifier: Modifier = Modifier) {
    val navController = LocalNavigation.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    when (val currentRoute = navBackStackEntry?.destination?.route?.substringBefore('?')) {
        in commonTopBarScreen -> {
            AppHeader(
                modifier = modifier,
                title = getTitle(currentRoute),
            ) { navController.popBackStack() }
        }

        Home::class.qualifiedName -> {
            HomeTopBar()
        }

        else -> {}
    }
}
