package com.example.foodorderapp.feature.payment.screens.paymentMethodListScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.payment.screens.PaymentMethodViewModel
import com.example.foodorderapp.feature.payment.screens.paymentMethodListScreen.components.PaymentMethodItem


@Composable
fun PaymentMethodListScreen(modifier: Modifier = Modifier) {
    val paymentMethodViewModel = viewModel<PaymentMethodViewModel>()
    val paymentMethods = paymentMethodViewModel.paymentMethods.collectAsState().value

    var iconSized by remember { mutableStateOf(0.dp)}
    Column(modifier = modifier.fillMaxSize()) {
        AppHeader(title = stringResource(id = R.string.payment_methods), onBack = {})
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(vertical = 24.dp)
        ) {
            item {}
            items(paymentMethods) {
                PaymentMethodItem(
                    modifier = Modifier.padding(top = 8.dp),
                    cadData = it
                    , iconSize = { iconSize ->
                        iconSized =  iconSize
                    }
                ){}
                HorizontalDivider(
                    modifier = Modifier.padding(start = iconSized).alpha(0.3f),
                )
            }
        }
    }
}