package com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.foodorderapp.R

@Composable
fun AddSocialAccountText(modifier: Modifier = Modifier) {
    Text(modifier = modifier,
        text = stringResource(R.string.add_social_accounts),
        style = MaterialTheme.typography.headlineSmall.copy(
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun YouWillGoText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.add_your_social_accounts_for_more_security_you_will_go_directly_to_their_site),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center,
        )
    )
}