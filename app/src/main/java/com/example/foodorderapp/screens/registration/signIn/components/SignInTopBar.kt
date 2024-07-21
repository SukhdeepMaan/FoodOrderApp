package com.example.foodorderapp.screens.registration.signIn.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.foodorderapp.R
import com.example.foodorderapp.components.TopBarLayout

@Composable
fun SignInTopBar(modifier: Modifier = Modifier) {
    TopBarLayout(
        modifier = modifier,
        trailingIcon = {},
        title = { SingInText() }
    )
}