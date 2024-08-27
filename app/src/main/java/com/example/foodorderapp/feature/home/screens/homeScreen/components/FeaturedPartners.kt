package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.home.data.Partner

@Composable
fun FeaturedPartners(
    modifier: Modifier = Modifier,
    header: String,
    onSeeAllClick: () -> Unit,
    partners: List<Partner>
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // header
        EachHeader(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            header = header,
            onSeeAllClick = onSeeAllClick
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(13.dp),
        ) {
            item { }
            items(partners) {
                FpEachDesign(partner = it)
            }
        }
    }
}