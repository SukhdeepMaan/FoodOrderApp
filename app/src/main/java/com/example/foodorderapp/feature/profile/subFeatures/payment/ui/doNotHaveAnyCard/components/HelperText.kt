package com.example.foodorderapp.feature.profile.subFeatures.payment.ui.doNotHaveAnyCard.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.foodorderapp.R
import com.example.foodorderapp.theme.gothicSemiBold

@Composable
fun DoNotHaveAnyCardText(modifier: Modifier = Modifier) {
    Text(modifier = modifier,
        text = stringResource(R.string.don_t_have_any_card),
        style = MaterialTheme.typography.headlineSmall.copy(
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun EasilyAddCardText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = "It’s seems like you have not added any credit or debit card. You may easily add card.",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary
        )
    )
}

@Composable
fun AddCardButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.add_card),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold,
            color = MaterialTheme.colorScheme.primary
        )
    )
}
