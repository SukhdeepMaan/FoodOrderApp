package com.example.foodorderapp.feature.onBoarding.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MainImage(modifier: Modifier = Modifier, image: Int) {
    Image(
        modifier = modifier
            .size(300.dp)
        ,
        painter = painterResource(id = image), contentDescription = null)

}