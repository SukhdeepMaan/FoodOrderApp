package com.example.foodorderapp.feature.home.homeUi.screen.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeCommonLayout(
    modifier: Modifier = Modifier,
    advertisement: @Composable () -> Unit,
    featuredPartners: @Composable () -> Unit,
    offers: @Composable (() -> Unit)? = null,
    bestPicks: @Composable () -> Unit,
    allRestaurants: @Composable () -> Unit,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item {
            advertisement()
            featuredPartners()
            offers?.let { it() }
            bestPicks()
            allRestaurants()
        }
    }
}