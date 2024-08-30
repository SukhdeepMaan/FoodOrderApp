package com.example.foodorderapp.typeSafeNavigation

import kotlinx.serialization.Serializable


@Serializable
sealed class Route {

    @Serializable
    data object OnBoarding : Route()

    @Serializable
    data object Auth : Route() {

        @Serializable
        object SignIn

        @Serializable
        object SignUp

        @Serializable
        object ForgetPassword

    }

    @Serializable
    data object DashBoard : Route() {

        @Serializable
        object Home

        @Serializable
        object Search

        @Serializable
        object Order

        @Serializable
        object Profile

    }
}

@Serializable
data class Home(val userId: Int = 1) : Route()


@Serializable
object OnBoarding


@Serializable
object ProfileSetting

@Serializable
object FeaturedPartner

@Serializable
object BestPickRestaurant

@Serializable
object AllRestaurant

@Serializable
object Filter

@Serializable
object FindRestaurant

