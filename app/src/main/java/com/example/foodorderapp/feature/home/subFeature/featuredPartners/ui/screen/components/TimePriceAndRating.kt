package com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.home.common.uiComponent.DeliveryPriceText
import com.example.foodorderapp.feature.home.common.uiComponent.DeliveryTimeText
import com.example.foodorderapp.feature.home.common.uiComponent.RatingText

@Composable
fun TimePriceAndRating(
    modifier: Modifier = Modifier,
    deliveryTime: Int, price: Int,
    rating: Double
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom
    ) {
        DeliveryTimeAndPrice(
            modifier = Modifier.weight(1f),
            deliveryTime = deliveryTime,
            price = price
        )
        RatingText(text = rating.toString())
    }
}

@Composable
fun DeliveryTimeAndPrice(
    modifier: Modifier = Modifier,
    deliveryTime: Int,
    price: Int
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start
    ) {
        EachRow(
            icon = { /*TODO icon pending*/ },
            text = { DeliveryTimeText(time = deliveryTime) }
        )
        EachRow(
            icon = {/*TODO icon pending*/ },
            text = { DeliveryPriceText(price = price) }
        )
    }

}

@Composable
fun EachRow(
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit,
    text: @Composable () -> Unit
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon()
        text()
    }
}

@Composable
fun IconForRow(modifier: Modifier = Modifier, icon: Int) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = icon),
        contentDescription = null,
        tint = Color.White
    )

}