package com.example.foodorderapp.feature.search.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.search.data.FoodItem

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SearchCompactLayout(
    modifier: Modifier = Modifier,
    list: List<Pair<String, List<FoodItem>>>,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            list.forEach { (category, list) ->
                item {
                    HeaderText(header = category, modifier = Modifier.padding(16.dp))
                }
                item {
                    FlowRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        maxItemsInEachRow = 2,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        list.forEach { foodItem ->
                            EachFoodItem(foodItem = foodItem)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SearchMediumLayoutAndExpanded(
    modifier: Modifier = Modifier,
    list: List<Pair<String, List<FoodItem>>>
) {
    Column(modifier = modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            list.forEach { (category, list) ->
                item {
                    HeaderText(header = category, modifier = Modifier.padding(16.dp))
                }
                item {
                    LazyRow(
                        modifier = Modifier.padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        item {}
                        items(list) { foodItem ->
                            EachFoodItem(foodItem = foodItem)
                        }
                    }
                }
            }
        }
    }
}