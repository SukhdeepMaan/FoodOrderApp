package com.example.foodorderapp.feature.home.screens.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodorderapp.R
import com.example.foodorderapp.ui.theme.gothicLight

@Composable
fun PartnerName(
    modifier: Modifier = Modifier,
    partnerName: String,
    style: TextStyle = MaterialTheme.typography.bodyLarge
) {
    Text(
        text = partnerName,
        modifier = modifier,
        style = style
    )
}

@Composable
fun PartnerNearByLocation(
    modifier: Modifier = Modifier,
    location: String,
    style: TextStyle = MaterialTheme.typography.bodyMedium
) {
    Text(
        text = location,
        modifier = modifier,
        style = style
    )
}

@Composable
fun FilterButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.filter),
        style = MaterialTheme.typography.bodyLarge.copy(
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun DeliveryToText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.delivery_to),
        style = MaterialTheme.typography.bodyLarge.copy(
            color = MaterialTheme.colorScheme.primary,
            fontFamily = gothicLight,
            fontWeight = FontWeight.ExtraLight
        )
    )
}

@Composable
fun LocationText(modifier: Modifier = Modifier, location: String) {
    Text(
        modifier = modifier,
        text = location,
        style = MaterialTheme.typography.titleMedium.copy(
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 20.sp,
        )
    )
}

@Composable
fun FoodTypeText(modifier: Modifier = Modifier, foodType: String) {
    Text(
        modifier = modifier,
        text = foodType,
        style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.secondary,
            fontWeight = FontWeight.Bold
        )
    )
}