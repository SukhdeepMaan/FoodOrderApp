package com.example.foodorderapp.feature.payment.screens.addPaymentMethod

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.payment.screens.PaymentMethodViewModel
import com.example.foodorderapp.feature.payment.screens.addPaymentMethod.components.AddPaymentMethodContent
import com.example.foodorderapp.feature.payment.screens.addPaymentMethod.components.CommonLayout
import com.example.foodorderapp.feature.payment.screens.addPaymentMethod.components.CompactBottomContent
import com.example.foodorderapp.feature.payment.screens.addPaymentMethod.components.MediumAndExpandedBottomContent
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun AddPaymentMethodScreen(modifier: Modifier = Modifier, windowInfo: WindowInfo) {
    val paymentMethodViewModel = viewModel<PaymentMethodViewModel>()
    val cardData = paymentMethodViewModel.cardData.collectAsState().value
    val focusManager = LocalFocusManager.current

    CommonLayout(
        modifier = modifier.pointerInput(key1 = Unit) {
            detectTapGestures {
                // dismiss keyboard
                focusManager.clearFocus()
            }
        },
        topBar = {
            AppHeader(title = stringResource(R.string.payment_methods)) {
            }
        },
        content = {
            item {
                // child
                AddPaymentMethodContent(cardData = cardData) {
                    paymentMethodViewModel.updateCardData(it)
                }
            }
        },
        bottomBar = {
            if (windowInfo.screenWidthType == WindowInfo.WindowType.Compact) {
                CompactBottomContent(
                    addCardOnClick = {},
                    scanCardOnClick = {}
                )
            } else {
                MediumAndExpandedBottomContent(
                    addCardOnClick = {},
                    scanCardOnClick = {}
                )
            }
        }
    )
}