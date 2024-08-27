package com.example.foodorderapp.feature.auth.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.signIn.ui.screens.sreenSignin.SignInScreen
import kotlinx.serialization.Serializable


@Serializable
data object SignInRoute


fun NavGraphBuilder.sigInNavigation(){
     composable<SignInRoute> {
         SignInScreen()
     }
}