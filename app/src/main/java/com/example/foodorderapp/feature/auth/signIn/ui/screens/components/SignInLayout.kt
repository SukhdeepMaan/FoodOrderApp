package com.example.foodorderapp.feature.auth.signIn.ui.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun SignInLayout(
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    welcome: (@Composable () -> Unit)? = null,
    inputFields: (@Composable () -> Unit)? = null,
    forgotPassword: (@Composable () -> Unit)? = null,
    signInButton: (@Composable () -> Unit)? = null,
    haveAccounts: (@Composable () -> Unit)? = null,
    connects: (@Composable () -> Unit)? = null
) {
    Column(
        modifier = modifier
    ) {
        header?.invoke()
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            item {
                welcome?.invoke()
                inputFields?.invoke()
                forgotPassword?.invoke()
                signInButton?.invoke()
                haveAccounts?.invoke()
                connects?.invoke()
            }
        }
    }
}