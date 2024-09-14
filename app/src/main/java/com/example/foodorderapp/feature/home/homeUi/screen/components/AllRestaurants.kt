package com.example.foodorderapp.feature.home.homeUi.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.home.domain.Partner

@Composable
fun AllRestaurants(
    modifier: Modifier = Modifier,
    header: String,
    onSeeAllClicked: () -> Unit,
    partners: List<Partner>
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        EachHeader(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            header = header,
            onSeeAllClick = onSeeAllClicked
        )
        partners.forEach { partner ->
            PartnerScrollableImagesAndDetail(
                partner = partner,
                scrollableImages = partner.image
            ) {
                PartnerDesign(partner = partner)
            }
        }
    }
}
