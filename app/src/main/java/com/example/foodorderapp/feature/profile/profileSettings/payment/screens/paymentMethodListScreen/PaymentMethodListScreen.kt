package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.paymentMethodListScreen

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
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.PaymentMethodViewModel
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components.CardData
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.paymentMethodListScreen.components.PaymentMethodItem
import com.example.foodorderapp.utils.WindowInfo


@Composable
fun PaymentMethodListScreen(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo,
    navController: NavHostController,
) {
    val viewModel: PaymentMethodViewModel = viewModel()
    val paymentMethods by viewModel.paymentMethods.collectAsState()

    var iconSized by remember { mutableStateOf(0.dp)}
    Column(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(start = 16.dp, bottom = 16.dp)
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