package com.example.foodorderapp.feature.auth.features.signUp.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.SignWithGoogleFacebook
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.OrText
import com.example.foodorderapp.theme.googleColor

@Composable
fun SomeButtonsTogether(
    modifier: Modifier = Modifier,
    signUp: () -> Unit,
    signInWithFacebook: () -> Unit,
    signInWithGoogle: () -> Unit
    ) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SignUpButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = signUp)
        // someText
        TermsAndConditions(modifier = Modifier.padding(vertical = 12.dp))
        OrText(modifier = Modifier.padding(vertical = 12.dp))
        SignWithGoogleFacebook(onClick = signInWithFacebook)
        SignWithGoogleFacebook(
            onClick = signInWithGoogle,
            isFacebook = false,
            text = stringResource(R.string.connect_with_google),
            bgColor = googleColor,
            icon = R.drawable.google_icon
        )
    }
}