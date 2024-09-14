package com.example.foodorderapp.navigation.topBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.feature.home.homeUi.screen.components.HomeTopBar
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

        Home.HomePage::class.qualifiedName -> {
            HomeTopBar()
        }

        else -> {}
    }
}
