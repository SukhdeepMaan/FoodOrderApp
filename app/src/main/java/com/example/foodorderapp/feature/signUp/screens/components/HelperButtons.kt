package com.example.foodorderapp.feature.signUp.screens.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.foodorderapp.R
import com.example.foodorderapp.components.CustomButton

@Composable
fun AlreadyHaveAnAccountButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) { AlreadyHaveAccountText() }
}

@Composable
fun SignUpButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(modifier = modifier, onClick = onClick) {
        SingUpTextForButton()
    }
}

@Composable
fun TermsAndConditions(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.by_signing_up_you_agree_to_our_terms_conditions_privacy_policy),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary
        )
    )
}