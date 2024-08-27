package com.example.foodorderapp.feature.auth.forgetPassword.screens.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeadLineText
import com.example.foodorderapp.ui.theme.gothicSemiBold

@Composable
fun HeaderForgetPassword(modifier: Modifier = Modifier) {
    HeadLineText(
        modifier = modifier.padding(top = 24.dp),
        text = stringResource(id = R.string.forget_password),
    )
}

@Composable
fun ResetPasswordText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.reset_password),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

@Composable
fun HavingProblemText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.ExtraBold,
        text = "Having Problem?"
    )
}

@Composable
fun SendAgainText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.send_again),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

