package com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.components.TopBarLayout

@Composable
fun SignInTopBar(modifier: Modifier = Modifier) {
    TopBarLayout(
        modifier = modifier,
        trailingIcon = {},
        title = { SingInText() }
    )
}