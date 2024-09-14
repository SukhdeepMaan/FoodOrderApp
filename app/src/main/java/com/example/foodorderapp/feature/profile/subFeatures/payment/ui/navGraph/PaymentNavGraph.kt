package com.example.foodorderapp.feature.profile.subFeatures.payment.ui.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.navigation.Route
import kotlinx.serialization.Serializable


@Serializable
sealed class PaymentMethods : Route() {
    @Serializable
    object DoNotHaveAnyCard

    @Serializable
    object AddPaymentMethod

    @Serializable
    object PaymentMethodList
}


fun NavGraphBuilder.paymentNavGraph() {

        composable<PaymentMethods.DoNotHaveAnyCard> {

        }
        composable<PaymentMethods.AddPaymentMethod> {


        }
        composable<PaymentMethods.PaymentMethodList> {


        }

}

