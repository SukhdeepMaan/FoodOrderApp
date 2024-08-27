package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HistoryToggleOff
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.home.data.Partner
import com.example.foodorderapp.feature.home.screens.components.PartnerName
import com.example.foodorderapp.feature.home.screens.components.TextWithCircle
import com.example.foodorderapp.feature.home.screens.components.TextWithIcon

@Composable
fun PartnerDesign(modifier: Modifier = Modifier, partner: Partner) {
    Column(modifier = modifier.padding(16.dp)) {
        PartnerName(partnerName = partner.name)
        Row(
            modifier = Modifier.padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "$$", style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.secondary,
                )
            )
            TextWithCircle(text = partner.type)
            TextWithCircle(text = partner.foodType)
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = partner.rating.toString(),
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.secondary,
                )
            )
            TextWithIcon(
                imageVector = Icons.Filled.Star,
                tint = MaterialTheme.colorScheme.primary,
                text = partner.numberOfRatings.toString()
            )
            TextWithIcon(
                imageVector = Icons.Filled.HistoryToggleOff,
                text = partner.numberOfRatings.toString()
            )
            TextWithIcon(
                customIcon = {
                    Text(

                        text = "$",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                        ),
                        modifier = Modifier
                            .padding(8.dp) // Add padding to make the circle larger
                            .drawBehind {
                                drawCircle(
                                    color = Color.LightGray,
                                    radius = (this.size.maxDimension/1.4f)
                                )
                            }
                    )
                },
                text = if (partner.price <= 0) "Free" else partner.price.toString()
            )

        }
    }
}