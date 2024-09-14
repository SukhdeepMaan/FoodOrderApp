package com.example.foodorderapp.feature.profile.profileUi.screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R

@Composable
fun TopHeadingText(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.account_setting),
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = stringResource(R.string.update_your_settings_like_notifications_payments_profile_edit_etc),
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
        )
    }

}