package com.example.foodorderapp.feature.home.screens.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.AppIcon
import com.example.foodorderapp.components.CustomCircle
import com.example.foodorderapp.ui.theme.accentColor

@Composable
fun RatingText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = MaterialTheme.typography.titleSmall.copy(
        color = MaterialTheme.colorScheme.onPrimary
    )
) {
    Text(text = text,
        modifier = modifier
            .drawBehind {
                drawRoundRect(
                    color = accentColor,
                    cornerRadius = CornerRadius(16f, 16f),
                )
            }
            .padding(horizontal = 12.dp, vertical = 6.dp),
        style = style
    )
}

@Composable
fun DeliveryTimeText(
    modifier: Modifier = Modifier,
    time: Int,
    style: TextStyle = MaterialTheme.typography.titleSmall.copy(
        color = Color.White
    )
) {
    Text(
        text = deliveryTimeCalculation(time),
        modifier = modifier,
        style = style
    )
}


private fun deliveryTimeCalculation(time: Int): String {
    val hours = time / 60
    val minutes = time % 60
    return if (hours == 0) "${minutes}min" else "${hours}h ${minutes}min"

}

@Composable
fun DeliveryPriceText(
    modifier: Modifier = Modifier,
    price: Int,
    style: TextStyle = MaterialTheme.typography.bodyMedium.copy(
        color = Color.White
    )
) {
    val priceText = if (price == 0) "Free" else "$price"
    Text(
        text = priceText,
        modifier = modifier,
        style = style
    )
}

@Composable
fun DeliveryPriceText2(
    modifier: Modifier = Modifier,
    price: Int,
    style: TextStyle = MaterialTheme.typography.titleSmall.copy(
        color = Color.White
    )
) {
    val priceText = if (price == 0) "Free Delivery" else " $$price"
    Text(
        text = priceText,
        modifier = modifier,
        style = style
    )
}


@Composable
fun DeliveryPriceWithCircle(
    modifier: Modifier = Modifier,
    price: Int
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        CustomCircle()
        DeliveryPriceText2(
            price = price,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.secondary,
            )
        )
    }
}

@Composable
fun TextWithCircle(
    modifier: Modifier = Modifier,
    text: String
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        CustomCircle()
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.secondary,
            )
        )
    }
}

@Composable
fun TextWithIcon(
    modifier: Modifier = Modifier,
    customIcon: @Composable (() -> Unit)? = null,
    @DrawableRes icon: Int? = null,
    imageVector: ImageVector? = null,
    tint: Color = Color.Unspecified,
    text: String
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        customIcon?.invoke()
        AppIcon(
            modifier = Modifier.size(24.dp),
            icon = icon,
            imageVector = imageVector,
            tint = tint
        )
        Text(text = text)
    }
}