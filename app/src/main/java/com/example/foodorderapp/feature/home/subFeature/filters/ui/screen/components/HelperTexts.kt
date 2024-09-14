package com.example.foodorderapp.feature.home.subFeature.filters.ui.screen.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.theme.gothicSemiBold

@Composable
fun ApplyFilterButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.apply_filters),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

@Composable
fun PriceText(modifier: Modifier = Modifier, text: String, isSelected: Boolean) {
    Text(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.bodyLarge.copy(
            color = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onBackground
        )
    )
}