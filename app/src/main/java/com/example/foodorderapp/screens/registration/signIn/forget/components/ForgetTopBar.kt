package com.example.foodorderapp.screens.registration.signIn.forget.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.components.TopBarLayout
import com.example.foodorderapp.screens.registration.signIn.components.ForgetText

@Composable
fun ForgetTopBar(modifier: Modifier = Modifier) {
    TopBarLayout(
        modifier = modifier,
        trailingIcon = {},
        title = { ForgetText() }
    )
}
