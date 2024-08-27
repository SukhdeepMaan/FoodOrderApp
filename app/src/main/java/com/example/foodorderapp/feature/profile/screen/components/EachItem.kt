package com.example.foodorderapp.feature.profile.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.AppIcon

@Composable
fun EachItem(
    modifier: Modifier = Modifier,
    startIcon: Int,
    name: String,
    description: String,
    onIconSizeCalculated: (Dp) -> Unit,
    endIcon: @Composable (Modifier) -> Unit,
) {
    val density = LocalDensity.current
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppIcon(
                modifier = Modifier
                    .onSizeChanged {
                        with(density) {
                            onIconSizeCalculated(it.width.toDp())
                        }
                    }
                    .padding(horizontal = 16.dp),
                icon = startIcon
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(text = name)
                if (description.isNotEmpty()) {
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface.copy(
                                alpha = 0.6f
                            )
                        )
                    )
                }
            }
        }
        endIcon(Modifier.padding(end = 16.dp))
    }
}