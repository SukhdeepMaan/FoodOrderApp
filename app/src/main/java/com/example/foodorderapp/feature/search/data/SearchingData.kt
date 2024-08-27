package com.example.foodorderapp.feature.search.data

import com.example.foodorderapp.R

data class FoodItem(
    val name: String,
    val image: Int
)

val sampleFoodItem = FoodItem(
    name = "Fast Food",
    image = R.drawable.fast_food
)

val topCategories = listOf(
    FoodItem(
        name = "Fast Food",
        image = R.drawable.fast_food
    ),
    FoodItem(
        name = "Breakfast & \nBrunch",
        image = R.drawable.breakfast
    ),
    FoodItem(
        name = "Mexican",
        image = R.drawable.maxican
    ),
    FoodItem(
        name = "Bakery",
        image = R.drawable.bakery
    ),
    FoodItem(
        name = "Desert",
        image = R.drawable.deserts
    ),
    FoodItem(
        name = "Burgers",
        image = R.drawable.burgers
    ),
    FoodItem(
        name = "Fast Food",
        image = R.drawable.fast_food
    ),
    FoodItem(
        name = "Fast Food",
        image = R.drawable.fast_food
    ),
    FoodItem(
        name = "Fast Food",
        image = R.drawable.fast_food
    ),
    FoodItem(
        name = "Fast Food",
        image = R.drawable.fast_food
    ),
    FoodItem(
        name = "Fast Food",
        image = R.drawable.fast_food
    ),

)

val searchingTypes = listOf("Top Categories" to topCategories, "Top Restaurants" to topCategories)