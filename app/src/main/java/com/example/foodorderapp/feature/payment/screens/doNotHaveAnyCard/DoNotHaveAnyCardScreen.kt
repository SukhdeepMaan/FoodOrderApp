package com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard.components.AddCardButton
import com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard.components.CardImage
import com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard.components.CompactLayout
import com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard.components.DoNotHaveAnyCardText
import com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard.components.EasilyAddCardText
import com.example.foodorderapp.feature.payment.screens.doNotHaveAnyCard.components.MediumAndExpendedLayout
import com.example.foodorderapp.utils.WindowInfo

/**
 * A composable function that displays the "Do Not Have Any Card" screen.
 * This function adapts its layout based on the screen width type (compact or expanded).
 *
 * @param modifier The modifier to be applied to the layout.
 * @param windowInfo An instance of WindowInfo containing information about the current window.
 */

@Composable
fun DoNotHaveAnyCardScreen(modifier: Modifier = Modifier, windowInfo: WindowInfo) {

    if (windowInfo.screenWidthType == WindowInfo.WindowType.Compact) {
        CompactLayout(
            modifier = modifier,
            topBar = {
                AppHeader(title = stringResource(R.string.payment_methods)) {
                }
            },
            content = {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CardImage(modifier = Modifier.padding(bottom = 48.dp))
                    DoNotHaveAnyCardText()
                    EasilyAddCardText(
                        modifier = Modifier.padding(
                            horizontal = 48.dp,
                            vertical = 24.dp
                        )
                    )
                    AddCardButton(modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp)) {
                    }
                }
            }
        )
    }
    else {
        MediumAndExpendedLayout(
            modifier = modifier,
            topBar = {
                AppHeader(title = stringResource(R.string.payment_methods)) {}
            },
            leftContent = {
                CardImage()
            },
            rightContent = {
                LazyColumn(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(24.dp)
                ) {
                    item {
                        DoNotHaveAnyCardText()
                        EasilyAddCardText(
                            modifier = Modifier.padding(
                                horizontal = 48.dp,
                                vertical = 24.dp
                            )
                        )
                        AddCardButton(modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 48.dp)) {
                        }
                    }
                }
            }
        )
    }
}