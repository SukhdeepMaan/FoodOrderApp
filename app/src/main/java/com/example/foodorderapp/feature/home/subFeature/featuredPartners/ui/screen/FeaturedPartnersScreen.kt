package com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.screen

import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.feature.home.domain.partnersList
import com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.screen.components.EachPartnerDesign
import com.example.foodorderapp.feature.home.subFeature.featuredPartners.ui.screen.components.FeaturedPartnerLayout
import com.example.foodorderapp.utils.LocalWindowInfo

@Composable
fun FeaturedPartnersScreen(
    modifier: Modifier = Modifier,
) {
    val windowInfo = LocalWindowInfo.current

    FeaturedPartnerLayout(
        modifier = modifier,
        windowInfo = windowInfo
    ) {
       items(partnersList) {
           EachPartnerDesign(partner = it)
       }
    }
}