package com.example.foodorderapp.feature.location.screen.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
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
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon

@Composable
fun AddressSearchField(
    modifier: Modifier = Modifier,
    value: String,
    onClear: () -> Unit,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        leadingIcon = { AppIcon(icon = R.drawable.location_pin) },
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
        placeholder = { EnterANewAddressText() },
        singleLine = true,
        maxLines = 1,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
            unfocusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
            focusedBorderColor = MaterialTheme.colorScheme.tertiaryContainer,
            unfocusedBorderColor = Color.LightGray
        )
    )
}