package com.example.foodorderapp.utils.typeSafeNavigation

import kotlinx.serialization.Serializable

@Serializable
object OnBoarding


@Serializable
data class Home(
    val userId: Int = 1,
)

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

