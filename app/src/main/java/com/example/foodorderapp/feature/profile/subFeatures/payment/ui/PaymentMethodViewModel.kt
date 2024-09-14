package com.example.foodorderapp.feature.profile.subFeatures.payment.ui

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components.CardData
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components.sampleCardData
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components.samplePaymentMethods
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PaymentMethodViewModel : ViewModel() {

    // properties
    private var _paymentMethods = MutableStateFlow<List<CardData>>(samplePaymentMethods)
    val paymentMethods = _paymentMethods.asStateFlow()

    private var _selectedPaymentMethod = MutableStateFlow<CardData?>(null)
    val selectedPaymentMethod = _selectedPaymentMethod.asStateFlow()

    private var _cardData = MutableStateFlow<CardData>(sampleCardData)
    val cardData = _cardData.asStateFlow()

    // methods to update properties

    fun updateCardData(cardData: CardData) {
        _cardData.value = cardData
    }
    fun selectPaymentMethod(cardData: CardData) {
        _selectedPaymentMethod.value = cardData
    }
    fun addPaymentMethod(cardData: CardData) {
        _paymentMethods.value += cardData
    }
}