package com.example.foodorderapp.screens.registration.signIn.forget.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeaderBelowTextAndButton

@Composable
fun TextAndButtonBelowHeader(modifier: Modifier = Modifier) {
    HeaderBelowTextAndButton(
        modifier = modifier,
        line1Text = stringResource(R.string.enter_your_email_address_and_we_will),
        line2Text = stringResource(R.string.send_you_a_rest_instructions),
    )
}