package com.example.foodorderapp.feature.auth.signIn.navGraph

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.auth.signIn.viewModel.SignInViewModel
import com.example.foodorderapp.feature.auth.signIn.ui.screens.sreenSignin.SignInScreen
import com.example.foodorderapp.typeSafeNavigation.Route
import com.example.foodorderapp.utils.LocalNavigation


fun NavGraphBuilder.signInNavGraph(){
     composable<Auth.SignIn> {
         val navController = LocalNavigation.current
         val signInVm : SignInViewModel = viewModel(
             factory = SignInViewModelFactory { route ->
                 when (route) {
                     is Route.Home -> { navController.navigate(route) }
                 }
             }
         )
         SignInScreen(
             state = signInVm.state.collectAsState().value,
             onEvent = signInVm::onEvent
         )
     }
}





class SignInViewModelFactory(
    private val onNavigation: (Route) -> Unit
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignInViewModel::class.java)) {
            return SignInViewModel(onNavigation) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
