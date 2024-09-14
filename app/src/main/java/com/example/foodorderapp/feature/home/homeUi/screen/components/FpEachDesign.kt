package com.example.foodorderapp.feature.home.homeUi.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.home.common.uiComponent.DeliveryPriceWithCircle
import com.example.foodorderapp.feature.home.common.uiComponent.DeliveryTimeText
import com.example.foodorderapp.feature.home.common.uiComponent.PartnerName
import com.example.foodorderapp.feature.home.common.uiComponent.PartnerNearByLocation
import com.example.foodorderapp.feature.home.common.uiComponent.RatingText
import com.example.foodorderapp.feature.home.domain.Partner

@Composable
fun FpEachDesign(
    modifier: Modifier = Modifier,
    partner: Partner
) {
    Column(modifier = modifier) {
        PartnerImage(image = partner.image[0])
        PartnerName(
            modifier = Modifier.padding(top = 12.dp),
            partnerName = partner.name
        )
        PartnerNearByLocation(
            modifier = Modifier.padding(top = 8.dp),
            location = partner.nearByLocation,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.Bold
            )
        )
        Row(
            modifier = Modifier.padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            RatingText(text = partner.rating.toString())
            DeliveryTimeText(
                time = partner.preparationTime,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.secondary,
                )
            )
            DeliveryPriceWithCircle(price = partner.price)
        }
    }
}
