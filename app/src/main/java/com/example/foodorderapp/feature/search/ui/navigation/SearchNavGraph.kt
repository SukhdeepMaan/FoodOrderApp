package com.example.foodorderapp.feature.search.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.foodorderapp.feature.search.ui.screen.SearchScreen
import com.example.foodorderapp.navigation.Route
import kotlinx.serialization.Serializable

@Serializable
data object Search : Route()

fun NavGraphBuilder.searchNavGraph(){

    composable<Search> {
        SearchScreen()
    }
}