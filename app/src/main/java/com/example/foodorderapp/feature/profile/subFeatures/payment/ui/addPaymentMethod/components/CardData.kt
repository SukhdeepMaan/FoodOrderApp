package com.example.foodorderapp.feature.profile.subFeatures.payment.ui.addPaymentMethod.components

import com.example.foodorderapp.R

data class CardData(
    var cardNumber: String,
    val cardTypeImage: Int = R.drawable.card,
    val cardType: String,
    var expiryDate: String,
    var cvv: String,
    var isDefault: Boolean = false
)

val sampleCardData = CardData(
    cardNumber = "",
    cardType = "",
    expiryDate = "",
    cvv = ""
)
val samplePaymentMethods = listOf(
    CardData(
        cardNumber = "1234 5678 9012 3456",
        cardTypeImage = R.drawable.card,
        cardType = "Visa",
        expiryDate = "12/25",
        cvv = "123",
        isDefault = true
    ),
    CardData(
        cardNumber = "2345 6789 0123 4567",
        cardType = "Mastercard",
        expiryDate = "06/24",
        cvv = "456"
    ),
    CardData(
        cardNumber = "3456 7890 1234 5678",
        cardType = "Visa",
        expiryDate = "09/23",
        cvv = "789"
    ),
    CardData(
        cardNumber = "4567 8901 2345 6789",
        cardType = "Mastercard",
        expiryDate = "03/22",
        cvv = "444"
    ),
    CardData(
        cardNumber = "5678 9012 3456 7890",
        cardType = "Visa",
        expiryDate = "03/22",
        cvv = "444"
    ),
    CardData(
        cardNumber = "6789 0123 4567 8901",
        cardType = "Mastercard",
        expiryDate = "03/22",
        cvv = "444"
    ),
    CardData(
        cardNumber = "7890 1234 5678 9012",
        cardTypeImage = R.drawable.card,
        cardType = "Visa",
        expiryDate = "12/25",
        cvv = "123"
    ),
    CardData(
        cardNumber = "8901 2345 6789 0123",
        cardType = "Mastercard",
        expiryDate = "06/24",
        cvv = "456"
    ),
    CardData(
        cardNumber = "9012 3456 7890 1234",
        cardType = "Visa",
        expiryDate = "09/23",
        cvv = "789"
    ),
    CardData(
        cardNumber = "0123 4567 8901 2345",
        cardType = "Mastercard",
        expiryDate = "03/22",
        cvv = "444"
    ),
    CardData(
        cardNumber = "2345 6789 0123 4567",
        cardType = "Visa",
        expiryDate = "03/22",
        cvv = "444"
    ),
    CardData(
        cardNumber = "3456 7890 1234 5678",
        cardType = "Mastercard",
        expiryDate = "03/22",
        cvv = "444"
    ),
)


val cardTypes = mapOf(
    "Visa" to R.drawable.visa_icon,
    "Mastercard" to R.drawable.mastercard_icon,
    "Paypal" to R.drawable.paypal
)
