package com.example.foodorderapp.feature.auth.signIn.ui.screens.screenOtp.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.foodorderapp.R
import com.example.foodorderapp.ui.theme.gothicBold
import com.example.foodorderapp.ui.theme.gothicSemiBold

@Composable
fun VerifyPhoneNumberText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.verify_phone_number),
        style = MaterialTheme.typography.titleLarge.copy(
            fontFamily = gothicBold,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun EnterCodeText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.enter_the_4_digit_code_sent_to_your_phone_at_91_9876543210),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun ContinueButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.continueText),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

@Composable
fun DoNotReceiveCodeText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.don_t_receive_the_code)
    )
}

@Composable
fun ResendCodeText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.resend_again),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 14.sp,
            fontFamily = gothicSemiBold,
            color = MaterialTheme.colorScheme.primary
        )
    )
}
