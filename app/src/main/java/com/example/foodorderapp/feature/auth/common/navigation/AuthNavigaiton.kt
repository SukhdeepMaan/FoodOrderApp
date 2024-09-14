package com.example.foodorderapp.feature.auth.common.navigation

import androidx.navigation.NavGraphBuilder
import com.example.foodorderapp.feature.auth.features.forgetPassword.ui.navigation.forgetPasswordNavGraph
import com.example.foodorderapp.feature.auth.features.signIn.ui.navigation.signInNavGraph
import com.example.foodorderapp.feature.auth.features.signUp.ui.navigation.signUpNavGraph
import com.example.foodorderapp.navigation.Route
import kotlinx.serialization.Serializable

@Serializable
sealed class Auth : Route() {

    @Serializable
    data object SignIn : Auth()

    @Serializable
    data object SignUp : Auth()

    @Serializable
    sealed class ForgetPassword : Auth() {

        @Serializable
        data object ForgetPasswordStepOne : ForgetPassword()

        @Serializable
        data object ForgetPasswordStepTwo : ForgetPassword()
    }
}


fun NavGraphBuilder.authNavGraph() {

    signInNavGraph()
    signUpNavGraph()
    forgetPasswordNavGraph()

}