package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.foodorderapp.feature.profile.Profile
import com.example.foodorderapp.feature.profile.profileSettings.payment.PaymentMethod
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.PaymentMethodViewModel
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components.AddPaymentMethodContent
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components.CommonLayout
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components.CompactBottomContent
import com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components.MediumAndExpandedBottomContent
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun AddPaymentMethodScreen(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo,
    navController: NavHostController
) {
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
                    addCardOnClick = {
                        navController.navigate(PaymentMethod.PaymentMethodList)
                    },
                    scanCardOnClick = {}
                )
            } else {
                MediumAndExpandedBottomContent(
                    addCardOnClick = {
                        navController.navigate(PaymentMethod.PaymentMethodList) {
                            popUpTo(PaymentMethod.AddPaymentMethod) {
                                inclusive = true
                            }
                        }
                    },
                    scanCardOnClick = {}
                )
            }
        }
    )
}