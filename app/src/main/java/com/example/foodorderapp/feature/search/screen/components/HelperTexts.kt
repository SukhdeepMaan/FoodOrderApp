package com.example.foodorderapp.feature.search.screen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R

@Composable
fun SearchText(modifier: Modifier = Modifier) {
    Text(text = "Search", modifier = modifier.padding(vertical = 8.dp, horizontal = 16.dp),
        style = MaterialTheme.typography.titleLarge.copy(
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold
        )
    )
}

@Composable
fun HeaderText(modifier: Modifier = Modifier, header: String) {
    Text(text = header, modifier = modifier,
        style = MaterialTheme.typography.titleMedium.copy(
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold
        )
    )
}

@Composable
fun SearchByFoodOrRestaurantText(modifier: Modifier = Modifier) {
    Text(text = stringResource(R.string.search_by_food_or_restaurant), modifier = modifier)
}