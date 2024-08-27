package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun EachHeader(
    modifier: Modifier = Modifier,
    header: String,
    onSeeAllClick: () -> Unit
) {
    Row(modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
        // headerName
        HeaderText(
            modifier = Modifier.weight(1f),
            text = header)
        SeeAllButton(onClick = onSeeAllClick)
    }
}