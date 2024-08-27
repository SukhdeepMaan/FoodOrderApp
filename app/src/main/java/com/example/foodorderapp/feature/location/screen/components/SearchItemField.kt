package com.example.foodorderapp.feature.location.screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.AppIcon
import com.example.foodorderapp.feature.search.screen.components.SearchByFoodOrRestaurantText

@Composable
fun SearchItemField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    onClear: () -> Unit
) {
    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 4.dp, start = 12.dp, end = 12.dp),
        value = value,
        onValueChange = onValueChange,
        leadingIcon = { AppIcon(imageVector = Icons.Default.Search, tint = Color.Gray) },
        trailingIcon = {
            if (value.isNotEmpty()) {
                IconButton(onClick = onClear) {
                    Icon(
                        modifier = Modifier
                            .size(12.dp)
                            .drawBehind {
                                drawCircle(color = Color.LightGray, radius = 12.dp.toPx())
                            },
                        imageVector = Icons.Default.Close,
                        contentDescription = null
                    )
                }
            }
        },
        placeholder = { SearchByFoodOrRestaurantText() },
        singleLine = true,
        maxLines = 1,
        shape = RoundedCornerShape(12.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
            unfocusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
            focusedBorderColor = MaterialTheme.colorScheme.tertiaryContainer,
            unfocusedBorderColor = Color.LightGray
        )
    )

}