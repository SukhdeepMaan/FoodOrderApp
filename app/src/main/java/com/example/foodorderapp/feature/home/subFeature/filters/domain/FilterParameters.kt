package com.example.foodorderapp.feature.home.subFeature.filters.domain

fun getCategories(): List<String> {
    return listOf(
        "ALL", "BRUNCH", "BURGERS", "CHINESE", "PIZZA", "SALADS", "SOUPS", "BREAKFAST"
    )
}

fun getDietaries(): List<String> {
    return listOf(
        "ALL", "VEGETARIAN", "NON-VEGETARIAN", "VEGAN", "GLUTEN-FREE"
    )
}

fun getPriceRanges(): List<String> {
    return listOf(
        "$10", "$20", "$30", "$40", "$50", "$60", "$70", "$80", "$90", "$100"
    )
}

val mainList = listOf("CATEGORIES" to getCategories(), "DIETARY" to getDietaries(), "PRICE RANGE" to getPriceRanges())