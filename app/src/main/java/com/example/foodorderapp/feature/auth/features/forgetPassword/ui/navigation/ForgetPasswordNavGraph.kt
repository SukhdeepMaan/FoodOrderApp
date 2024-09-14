package com.example.foodorderapp.feature.auth.features.forgetPassword.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen.ForgetPassStepOneScreen
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen.ForgetPassStepTwoScreen
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.viewModel.ForgetPasswordViewModel
import com.example.foodorderapp.utils.LocalNavigation


fun NavGraphBuilder.forgetPasswordNavGraph() {

    composable<Auth.ForgetPassword.ForgetPasswordStepOne> {

        val navController = LocalNavigation.current
        val fpPasswordViewModel = hiltViewModel<ForgetPasswordViewModel>()
        ForgetPassStepOneScreen(
            fpViewModel = fpPasswordViewModel,
            onNavigate = { navController.navigate(it) }
        )
    }
    composable<Auth.ForgetPassword.ForgetPasswordStepTwo> {
        ForgetPassStepTwoScreen()
    }
}