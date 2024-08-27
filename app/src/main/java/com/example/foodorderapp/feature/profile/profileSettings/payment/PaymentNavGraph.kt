package com.example.foodorderapp.feature.profile.profileSettings.payment

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.foodorderapp.feature.profile.Profile
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.AddPaymentMethodScreen
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.doNotHaveAnyCard.DoNotHaveAnyCardScreen
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.paymentMethodListScreen.PaymentMethodListScreen
import com.example.foodorderapp.utils.WindowInfo
import kotlinx.serialization.Serializable


@Serializable
object PaymentMethod {
    @Serializable
    object DoNotHaveAnyCard

    @Serializable
    object AddPaymentMethod

    @Serializable
    object PaymentMethodList
}


fun NavGraphBuilder.paymentNavGraph(navController: NavHostController, windowInfo: WindowInfo) {
    navigation<Profile.PaymentMethod>(startDestination = PaymentMethod.DoNotHaveAnyCard) {
        composable<PaymentMethod.DoNotHaveAnyCard> {
            DoNotHaveAnyCardScreen(navController = navController, windowInfo = windowInfo)
        }
        composable<PaymentMethod.AddPaymentMethod> {
            AddPaymentMethodScreen(navController = navController, windowInfo = windowInfo)

        }
        composable<PaymentMethod.PaymentMethodList> {
            PaymentMethodListScreen(navController = navController, windowInfo = windowInfo, )

        }
    }
}

