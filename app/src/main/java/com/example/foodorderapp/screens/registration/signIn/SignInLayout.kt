package com.example.foodorderapp.screens.registration.signIn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignInLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit)? = null,
    content: LazyListScope.() -> Unit,
) {
    Column(
        modifier
            .fillMaxSize()

    ) {
        topBar?.let { it() }
        LazyColumn(modifier = Modifier.weight(1f).fillMaxWidth()
        ) {
            content.invoke(this)
        }
    }
}