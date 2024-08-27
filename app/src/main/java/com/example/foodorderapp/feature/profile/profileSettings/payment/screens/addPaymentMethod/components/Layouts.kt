package com.example.foodorderapp.feature.profile.profileSettings.payment.screens.addPaymentMethod.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CommonLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit)? = null,
    content: LazyListScope.() -> Unit,
    bottomBar: @Composable (() -> Unit)? = null
) {
    Column(modifier = modifier.fillMaxSize()) {
        topBar.let { it?.invoke() }
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(start = 24.dp, end = 24.dp, top = 24.dp),
            content = content
        )
        bottomBar?.invoke()
    }
}