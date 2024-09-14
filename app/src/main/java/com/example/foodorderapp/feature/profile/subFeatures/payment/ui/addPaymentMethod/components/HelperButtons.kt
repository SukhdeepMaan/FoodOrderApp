package com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.components.CustomButton

@Composable
fun AddCardFilledButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(
        modifier,
        onClick = onClick
    ) {
        AddCardFilledButtonText()
    }
}

@Composable
fun ScanCardButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    OutlinedButton(
        modifier = modifier.height(56.dp),
        onClick = onClick,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        ScanCardButtonText()
    }
}