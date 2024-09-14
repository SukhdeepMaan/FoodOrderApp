package com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.SignWithGoogleFacebook
import com.example.foodorderapp.theme.googleColor

@Composable
fun ButtonsOnTopOfEachOther(
    modifier: Modifier = Modifier,
    facebookOnClick: () -> Unit, googleOnClick: () -> Unit
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        SignWithGoogleFacebook(onClick = facebookOnClick)
        SignWithGoogleFacebook(
            isFacebook = false,
            bgColor = googleColor,
            text = stringResource(id = R.string.connect_with_google),
            icon = R.drawable.google_icon,
            onClick = googleOnClick
        )
    }
}

@Composable
fun ButtonsNextToEachOther(
    modifier: Modifier = Modifier,
    facebookOnClick: () -> Unit,
    googleOnClick: () -> Unit
) {
    Row(modifier = modifier.padding(top = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(24.dp)) {
        SignWithGoogleFacebook(
            modifier = Modifier.weight(1f),
            onClick = facebookOnClick
        )
        SignWithGoogleFacebook(
            modifier = Modifier.weight(1f),
            isFacebook = false,
            text = stringResource(id = R.string.connect_with_google),
            icon = R.drawable.google_icon,
            bgColor = googleColor,
            onClick = googleOnClick
        )
    }
}