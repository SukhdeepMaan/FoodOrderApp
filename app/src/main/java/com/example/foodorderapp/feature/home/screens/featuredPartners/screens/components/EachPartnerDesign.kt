package com.example.foodorderapp.feature.home.screens.featuredPartners.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.CustomCircle
import com.example.foodorderapp.feature.home.data.Partner
import com.example.foodorderapp.feature.home.screens.components.FoodTypeText
import com.example.foodorderapp.feature.home.screens.components.PartnerName

@Composable
fun EachPartnerDesign(
    modifier: Modifier = Modifier,
    partner: Partner
) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.fillMaxSize()
                    .aspectRatio(.75f),
                painter = painterResource(id = partner.image[0]),
                contentDescription = partner.name,
                contentScale = ContentScale.Crop
            )
            // modify this box
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(0.75f)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(color = Color.Red.copy(alpha = 0.2f))
            )
            TimePriceAndRating(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(12.dp),
                deliveryTime = partner.preparationTime,
                price = partner.price,
                rating = partner.rating
            )
        }
        PartnerName(
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp),
            partnerName = partner.name
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FoodTypeText(foodType = partner.type)
            CustomCircle()
            FoodTypeText(foodType = partner.type)
        }
    }
}

