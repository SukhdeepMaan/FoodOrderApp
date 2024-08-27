package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon
// superChild
@Composable
fun CardTextFields(
    modifier: Modifier = Modifier,
    cardData: CardData,
    onValueChange: (CardData) -> Unit) {

    val keyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Number,
        imeAction = ImeAction.Next
    )
    val colors = OutlinedTextFieldDefaults.colors(
        focusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
        unfocusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
        focusedBorderColor = MaterialTheme.colorScheme.tertiaryContainer,
        unfocusedBorderColor = Color.LightGray,
        focusedTextColor = /*MaterialTheme.colorScheme.onBackground*/ Color.Black,
        unfocusedTextColor = Color.Black
    )
    Column(modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = cardData.cardNumber,
            onValueChange = {onValueChange(cardData.copy(cardNumber = it))},
            placeholder = {
                Text(text = stringResource(R.string._4343_4343_4343_4343))
            },
            leadingIcon = {
                AppIcon(
                    modifier = Modifier.size(24.dp),
                    icon = R.drawable.card,
                )
            },
            singleLine = true,
            maxLines = 1,
            keyboardOptions = keyboardOptions,
            colors = colors
        )
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)){
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = cardData.expiryDate,
                onValueChange = { onValueChange(cardData.copy(expiryDate = it)) },
                placeholder = {
                    Text(text = stringResource(R.string.mm_yy))
                },
                singleLine = true,
                maxLines = 1,
                keyboardOptions = keyboardOptions,
                colors = colors
            )
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = cardData.cvv,
                onValueChange = { onValueChange.invoke(cardData.copy(cvv = it)) },
                placeholder = {
                    Text(text = stringResource(R.string.cvc))
                },
                singleLine = true,
                maxLines = 1,
                keyboardOptions = keyboardOptions.copy(
                    imeAction = ImeAction.Done
                ),
                colors = colors
            )
        }
    }
}