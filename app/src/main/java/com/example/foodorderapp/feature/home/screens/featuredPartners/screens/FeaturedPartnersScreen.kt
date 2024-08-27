package com.example.foodorderapp.feature.home.screens.featuredPartners.screens

import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.foodorderapp.feature.home.data.partnerList
import com.example.foodorderapp.feature.home.screens.featuredPartners.screens.components.EachPartnerDesign
import com.example.foodorderapp.feature.home.screens.featuredPartners.screens.components.FeaturedPartnerLayout
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun FeaturedPartnersScreen(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo,
    navController: NavHostController
) {
    FeaturedPartnerLayout(
        modifier = modifier,
        windowInfo = windowInfo
    ) {
       items(partnerList) {
           EachPartnerDesign(partner = it)
       }
    }
}