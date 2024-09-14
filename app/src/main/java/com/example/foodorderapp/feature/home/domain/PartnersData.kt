package com.example.foodorderapp.feature.home.domain

import com.example.foodorderapp.R

data class Partner(
    val id: Int,
    val name: String,
    val nearByLocation: String,
    val type: String,
    val foodType: String,
    val rating: Double,
    val numberOfRatings: Int,
    val preparationTime: Int,
    val price: Int,
    val image: List<Int>
)

val partnerSample = Partner(
    id = 1,
    name = "Tacos Nanchas",
    nearByLocation = "St Andrews, Sydney",
    type = "Mexican",
    foodType = "Deshi Food",
    rating = 4.5,
    numberOfRatings = 100,
    preparationTime = 30,
    price = 15,
    image = listOf(
        R.drawable.tacos_nanchas,
        R.drawable.tacos_nanchas,
        R.drawable.tacos_nanchas,
        R.drawable.tacos_nanchas
    )
)

val partnersList = listOf(
    Partner(
        id = 1,
        name = "Tacos Nanchas",
        nearByLocation = "St Andrews, Sydney",
        type = "Mexican",
        foodType = "Deshi Food",
        rating = 4.5,
        numberOfRatings = 200,
        preparationTime = 30,
        price = 15,
        image = listOf(
            R.drawable.tacos_nanchas,
            R.drawable.tacos_nanchas,
            R.drawable.tacos_nanchas,
            R.drawable.tacos_nanchas
        )
    ),
    Partner(
        id = 2,
        name = "Mc Donalds",
        nearByLocation = "St Andrews, Sydney",
        type = "American",
        foodType = "Deshi Food",
        rating = 4.0,
        numberOfRatings = 150,
        preparationTime = 20,
        price = 0,
        image = listOf(
            R.drawable.mc_donalds,
            R.drawable.mc_donalds,
            R.drawable.mc_donalds,
            R.drawable.mc_donalds
        )
    ),
    Partner(
        id = 3,
        name = "KFC",
        nearByLocation = "St Andrews, Sydney",
        type = "American",
        foodType = "Deshi Food",
        rating = 4.5,
        numberOfRatings = 100,
        preparationTime = 25,
        price = 0,
        image = listOf(R.drawable.kfc, R.drawable.kfc, R.drawable.kfc, R.drawable.kfc)
    ),
    Partner(
        id = 4,
        name = "Cafe MayField's",
        nearByLocation = "St Andrews, Sydney",
        type = "American",
        foodType = "Deshi Food",
        rating = 4.0,
        numberOfRatings = 50,
        preparationTime = 15,
        price = 0,
        image = listOf(
            R.drawable.cafe_my_fields,
            R.drawable.cafe_my_fields,
            R.drawable.cafe_my_fields,
            R.drawable.cafe_my_fields
        )
    ),
    Partner(
        id = 5,
        name = "Burger King",
        nearByLocation = "St Andrews, Sydney",
        type = "American",
        foodType = "Deshi Food",
        rating = 4.5,
        numberOfRatings = 120,
        preparationTime = 20,
        price = 0,
        image = listOf(
            R.drawable.burger_king,
            R.drawable.burger_king,
            R.drawable.burger_king,
            R.drawable.burger_king
        )
    ),
    Partner(
        id = 6,
        name = "Oliver Brown",
        nearByLocation = "St Andrews, Sydney",
        type = "Australian",
        foodType = "Deshi Food",
        rating = 4.0,
        numberOfRatings = 80,
        preparationTime = 25,
        price = 0,
        image = listOf(
            R.drawable.oliver_brown,
            R.drawable.oliver_brown,
            R.drawable.oliver_brown,
            R.drawable.oliver_brown
        )
    )
)