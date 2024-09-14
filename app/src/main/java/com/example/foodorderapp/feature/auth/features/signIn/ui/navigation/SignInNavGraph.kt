package com.example.foodorderapp.feature.auth.features.signIn.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.signInEmail.SignInEmailScreen
import com.example.foodorderapp.utils.LocalNavigation


fun NavGraphBuilder.signInNavGraph(){
     composable<Auth.SignIn> {
         val navController = LocalNavigation.current
         SignInEmailScreen(
             viewModel = hiltViewModel(),
             onNavigate = { route ->
                 navController.navigate(route)
             }
         )
     }
}