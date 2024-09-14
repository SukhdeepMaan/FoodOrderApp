package com.example.foodorderapp.feature.auth.features.signUp.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.auth.features.signUp.ui.screen.SignUpScreen
import com.example.foodorderapp.utils.LocalNavigation

fun NavGraphBuilder.signUpNavGraph() {

    composable<Auth.SignUp> {
        val navController = LocalNavigation.current
        SignUpScreen(
            viewModel = hiltViewModel(),
            onNavigate = {
                navController.navigate(it)
            }
        )
    }
}