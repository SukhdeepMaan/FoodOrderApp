package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PartnerImage(modifier: Modifier = Modifier, image : Int) {
    Image(
        modifier = modifier
            .width(240.dp)
            .aspectRatio(1.6f)
            .clip(RoundedCornerShape(10.dp)),
        painter = painterResource(id = image),
        contentDescription = null,
        contentScale = ContentScale.FillWidth

    )

}