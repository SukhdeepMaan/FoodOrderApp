package com.example.foodorderapp.feature.signIn.screens.screenOtp

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.signIn.screens.screenOtp.components.ContinueButtonText
import com.example.foodorderapp.feature.signIn.screens.screenOtp.components.EnterCodeText
import com.example.foodorderapp.feature.signIn.screens.screenOtp.components.OtpTextFields
import com.example.foodorderapp.feature.signIn.screens.screenOtp.components.RowBellowMainButton
import com.example.foodorderapp.feature.signIn.screens.screenOtp.components.VerifyPhoneNumberText
import com.example.foodorderapp.feature.signUp.screens.components.TermsAndConditions

@Composable
fun OtpVerificationScreen(modifier: Modifier = Modifier) {

    val focusManager = LocalFocusManager.current

    RegisterLayout(
        modifier = modifier.pointerInput(key1 = Unit) {
            detectTapGestures {
                focusManager.clearFocus()
            }
        },
        topBar = {
            AppHeader(title = stringResource(R.string.login_to_foodly),
                onBack = {}
            )
        },
        content = {
            item {
                VerifyPhoneNumberText(modifier = Modifier.fillMaxWidth())
                EnterCodeText(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )
                OtpTextFields(
                    modifier
                        .fillMaxWidth()
                        .padding(vertical = 56.dp)
                )
                CustomButton {
                    ContinueButtonText()
                }
                RowBellowMainButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                )
                TermsAndConditions(modifier = Modifier.fillMaxWidth())
            }
        }
    )
}