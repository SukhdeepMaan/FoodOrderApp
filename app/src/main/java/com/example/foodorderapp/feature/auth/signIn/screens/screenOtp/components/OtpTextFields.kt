package com.example.foodorderapp.feature.auth.signIn.screens.screenOtp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.unit.dp

@Composable
fun OtpTextFields(modifier: Modifier = Modifier) {
    val otpLength = 4
    val otpValueList = remember { List(otpLength) { mutableStateOf("") } }
    val focusRequesterList = remember { List(otpLength) { FocusRequester() } }
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Create a list of OTP text fields
            for (i in 0 until otpLength) {
                CustomOtpTextField(
                    value = otpValueList[i].value,
                    focusRequester = focusRequesterList[i],
                    onKeyEvent = { keyEvent ->
                        if (keyEvent.key == Key.Backspace) {
                            if (otpValueList[i].value.isEmpty() && i > 0) {
                                focusRequesterList[i - 1].requestFocus()
                            }
                            false
                        } else {
                            false
                        }
                    }
                ) { typedValue ->
                    if (typedValue.length <= 1) {
                        otpValueList[i].value = typedValue
                    }
                    if (typedValue.isNotEmpty() && i < otpLength - 1) {
                        focusRequesterList[i + 1].requestFocus()
                    }
                }
            }
        }
    }
}