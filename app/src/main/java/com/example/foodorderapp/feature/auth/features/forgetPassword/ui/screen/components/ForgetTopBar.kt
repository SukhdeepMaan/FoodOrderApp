package com.example.foodorderapp.feature.auth.features.forgetPassword.ui.screen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.components.TopBarLayout
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.ForgetText

@Composable
fun ForgetTopBar(modifier: Modifier = Modifier) {
    TopBarLayout(
        modifier = modifier,
        trailingIcon = {},
        title = { ForgetText() }
    )
}
