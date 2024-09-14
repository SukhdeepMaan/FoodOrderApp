package com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.foodorderapp.R
import com.example.foodorderapp.theme.poppinsSemiBold


@Composable
fun AddYourPaymentMethodText(modifier: Modifier = Modifier) {
    Text(modifier = modifier,
        text = stringResource(R.string.add_your_payment_methods),
        style = MaterialTheme.typography.headlineSmall.copy(
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun WhenYouPlaceOrderText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.this_card_will_only_be_charged_when_you_place_an_order),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center,
        )
    )

}

@Composable
fun AddCardFilledButtonText(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.add_card),
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = poppinsSemiBold,
            color = MaterialTheme.colorScheme.background
        )
    )
}

@Composable
fun ScanCardButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(id = R.string.scan_card),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = poppinsSemiBold,
            color = MaterialTheme.colorScheme.onBackground
        )
    )
}