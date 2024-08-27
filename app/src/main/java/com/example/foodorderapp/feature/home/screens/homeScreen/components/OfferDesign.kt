package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun OfferDesign(modifier: Modifier = Modifier, image: Int) {
    Image(
        modifier = modifier.fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .padding(vertical = 12.dp, horizontal = 12.dp),
        painter = painterResource(id = image),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}