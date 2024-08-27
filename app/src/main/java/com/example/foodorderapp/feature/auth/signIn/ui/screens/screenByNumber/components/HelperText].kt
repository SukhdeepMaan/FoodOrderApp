package com.example.foodorderapp.feature.auth.signIn.ui.screens.screenByNumber.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.ui.theme.gothicBold

@Composable
fun GetStartedWithFoodText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.fillMaxWidth(),
        text = stringResource(id = R.string.get_started_with_foodly),
        style = MaterialTheme.typography.titleLarge.copy(
            fontFamily = gothicBold,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun TextBelowGetStarted(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .padding(top = 8.dp)
            .fillMaxWidth(),
        text = stringResource(R.string.enter_your_phone_number_to_use_foodly_and_enjoy_your_food),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
    )
}