package com.example.foodorderapp.feature.auth.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.foodorderapp.feature.auth.signIn.ui.screens.screenByNumber.SingInByNumberScreen
import com.example.foodorderapp.feature.auth.signIn.ui.screens.screenOtp.OtpVerificationScreen
import com.example.foodorderapp.feature.auth.signIn.ui.screens.sreenSignin.SignInScreen
import com.example.foodorderapp.feature.auth.signUp.screens.SignUpScreen
import com.example.foodorderapp.feature.auth.forgetPassword.screens.ForgetPasswordStepOne
import com.example.foodorderapp.feature.auth.forgetPassword.screens.ForgetPasswordStepTwo
import kotlinx.serialization.Serializable

@Serializable
object Auth {
    @Serializable
    object SignIn
    @Serializable
    object SignUp
    @Serializable
    object ForgetPasswordSetOne
    @Serializable
    object ForgetPasswordSetTwo
    @Serializable
    object SignInByNumber
    @Serializable
    object OtpVerification
}

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation<Auth>(startDestination = Auth.SignIn) {
        composable<Auth.SignIn> {
            SignInScreen()
        }
        composable<Auth.SignUp> {
            SignUpScreen(navController = navController)
        }
        composable<Auth.ForgetPasswordSetOne> {
            ForgetPasswordStepOne(navController = navController)
        }
        composable<Auth.ForgetPasswordSetTwo> {
            ForgetPasswordStepTwo(navController = navController)
        }
        composable<Auth.SignInByNumber> {
            SingInByNumberScreen()
        }
        composable<Auth.OtpVerification> {
            OtpVerificationScreen()
        }
    }
}