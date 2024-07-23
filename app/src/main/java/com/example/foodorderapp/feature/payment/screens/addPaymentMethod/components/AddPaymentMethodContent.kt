package com.example.foodorderapp.feature.payment.screens.addPaymentMethod.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// child
@Composable
fun AddPaymentMethodContent(
    modifier: Modifier = Modifier,
    cardData: CardData,
    onValueChange: (CardData) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AddYourPaymentMethodText(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(bottom = 24.dp)
        )
        WhenYouPlaceOrderText(modifier = modifier.padding(horizontal = 24.dp))


        // superChild
        CardTextFields(
            modifier = Modifier.padding(top = 24.dp),
            cardData = cardData,
            onValueChange = onValueChange
        )
    }
}