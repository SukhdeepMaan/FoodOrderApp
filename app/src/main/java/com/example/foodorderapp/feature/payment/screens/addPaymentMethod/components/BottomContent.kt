package com.example.foodorderapp.feature.payment.screens.addPaymentMethod.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CompactBottomContent(
    modifier: Modifier = Modifier,
    addCardOnClick: () -> Unit,
    scanCardOnClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        AddCardFilledButton(onClick = addCardOnClick)
        ScanCardButton(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = scanCardOnClick
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun MediumAndExpandedBottomContent(
    modifier: Modifier = Modifier,
    addCardOnClick: () -> Unit,
    scanCardOnClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AddCardFilledButton(modifier = Modifier.weight(1f), onClick = addCardOnClick)
        ScanCardButton(
            modifier = Modifier
                .weight(1f),
            onClick = scanCardOnClick
        )
    }
}