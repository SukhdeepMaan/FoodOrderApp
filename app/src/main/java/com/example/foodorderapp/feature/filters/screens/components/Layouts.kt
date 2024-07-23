package com.example.foodorderapp.feature.filters.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FilterCommonLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit,
    content: LazyListScope.() -> Unit,
    bottomButton: @Composable () -> Unit
) {
    Column(modifier = modifier.fillMaxSize()) {
        topBar()
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(top = 16.dp),
            content = content)
        bottomButton()
    }
}