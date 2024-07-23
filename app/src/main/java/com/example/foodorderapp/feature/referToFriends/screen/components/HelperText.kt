package com.example.foodorderapp.feature.referToFriends.screen.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.foodorderapp.R

@Composable
fun ReferAFriendText(modifier: Modifier = Modifier) {
    Text(modifier = modifier,
        text = stringResource(R.string.refer_a_friend_get_10),
        style = MaterialTheme.typography.headlineSmall.copy(
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun GetCreditsText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = "Get \$10 in credits when someone sign up using your refer link",
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center,
        )
    )
}

@Composable
fun ReferLinkText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = "https://ui8.net/76738b",
        style = MaterialTheme.typography.bodyLarge.copy(
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center,
        )
        )

}