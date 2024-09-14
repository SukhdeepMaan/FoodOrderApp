package com.example.foodorderapp.feature.profile.subFeatures.payment.ui.paymentMethodListScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components.CardData
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components.cardTypes

@Composable
fun PaymentMethodItem(
    modifier: Modifier = Modifier,
    cadData: CardData,
    iconSize: (Dp) -> Unit,
    onClick: (CardData) -> Unit
) {
    val localDensity = LocalDensity.current
    val iconPadding = 16.dp
    var iconWidth by remember { mutableIntStateOf(0) }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                onClick(cadData)
            }
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AppIcon(
            modifier = Modifier
                .size(56.dp)
                .padding(start = 4.dp)
                .padding(end = iconPadding)
                .onSizeChanged {
                    iconWidth = it.width
                },
            icon = cardTypes[cadData.cardType],
        )
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = cadData.cardType,
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold
                )
                )
            Text(text = if (cadData.isDefault) "Default" else "Not Default")
        }
        AppIcon(
            modifier = Modifier
                .padding(end = iconPadding)
                .rotate(180f),
            icon = R.drawable.back_arrow
        )
        // Convert the icon width from pixels to Dp and call the iconSize function
        val totalIconWidthDp = with(localDensity) {
            iconWidth.toDp() + iconPadding + 8.dp
        }
        iconSize(totalIconWidthDp)
    }
}