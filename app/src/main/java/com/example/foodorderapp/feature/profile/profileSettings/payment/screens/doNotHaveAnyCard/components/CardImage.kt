package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.doNotHaveAnyCard.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.foodorderapp.R

@Composable
fun CardImage(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.card_icon),
        contentDescription = null
    )
}