package com.example.foodorderapp.feature.search.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.search.data.FoodItem

@Composable
fun EachFoodItem(
    modifier: Modifier = Modifier,
    foodItem: FoodItem,
) {
    Box(
        modifier = modifier
            .size(170.dp)
            .height(IntrinsicSize.Min)
            .width(IntrinsicSize.Min)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color.White)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = foodItem.image),
            contentDescription = foodItem.name)
        Box(modifier = modifier.fillMaxSize().background(color = Color.Black.copy(alpha = 0.4f)))
        Text(text = foodItem.name,
            modifier = Modifier.align(Alignment.Center),
            style = MaterialTheme.typography.bodySmall.copy(color = Color.White))
    }
}