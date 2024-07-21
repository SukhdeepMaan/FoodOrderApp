package com.example.foodorderapp.screens.registration.signIn.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.foodorderapp.R

@Composable
fun CupImage(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().background(Color.Gray), contentAlignment = Alignment.Center){
        Image(
            painter = painterResource(id = R.drawable.cup_image),
            contentDescription = null
        )
    }


}