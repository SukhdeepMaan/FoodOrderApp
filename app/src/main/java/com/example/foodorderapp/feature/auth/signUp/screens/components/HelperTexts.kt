package com.example.foodorderapp.feature.auth.signUp.screens.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeadLineText
import com.example.foodorderapp.ui.theme.gothicSemiBold

@Composable
fun CreateAccountText(modifier: Modifier = Modifier) {
    HeadLineText(
        modifier = modifier,
        text = stringResource(R.string.create_account)
    )
}

@Composable
fun AlreadyHaveAccountText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.ExtraBold,
        text = stringResource(R.string.already_have_an_account)
    )
}

@Composable
fun SingUpTextForButton(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.sign_up),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold,
            color = MaterialTheme.colorScheme.background
        )
    )
}