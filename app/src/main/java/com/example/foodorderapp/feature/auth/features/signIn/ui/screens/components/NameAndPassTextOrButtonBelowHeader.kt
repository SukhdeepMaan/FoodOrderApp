package com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeaderBelowTextAndButton

@Composable
fun NamePassTextOrButtonBelowHeader(modifier: Modifier = Modifier) {
    HeaderBelowTextAndButton(
        modifier = modifier,
        line1Text = stringResource(R.string.enter_your_email_and_password),
        line2Text = stringResource(R.string.for_sign_in_enjoy_your_food),
    )
}
