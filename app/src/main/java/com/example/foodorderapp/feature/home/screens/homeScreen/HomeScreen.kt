package com.example.foodorderapp.feature.home.screens.homeScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.feature.home.data.advertisement.advertisementList
import com.example.foodorderapp.feature.home.data.offerImage
import com.example.foodorderapp.feature.home.data.partnerList
import com.example.foodorderapp.feature.home.screens.homeScreen.components.Advertisement
import com.example.foodorderapp.feature.home.screens.homeScreen.components.AllRestaurants
import com.example.foodorderapp.feature.home.screens.homeScreen.components.FeaturedPartners
import com.example.foodorderapp.feature.home.screens.homeScreen.components.HomeCommonLayout
import com.example.foodorderapp.feature.home.screens.homeScreen.components.OfferDesign
import com.example.foodorderapp.utils.typeSafeNavigation.AllRestaurant
import com.example.foodorderapp.utils.typeSafeNavigation.BestPickRestaurant
import com.example.foodorderapp.utils.typeSafeNavigation.FeaturedPartner

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    val isOffer by remember { mutableStateOf(true) }

    HomeCommonLayout(
        modifier = modifier,
        advertisement = { Advertisement(images = advertisementList) },
        featuredPartners = {
            FeaturedPartners(
                header = stringResource(R.string.featured_partners_header),
                partners = partnerList,
                onSeeAllClick = { navController.navigate(FeaturedPartner) }
            )
        },
        offers = { if (isOffer) OfferDesign(image = offerImage) else null },
        bestPicks = {
            FeaturedPartners(
                header = stringResource(R.string.best_picks_restaurants_by_team),
                partners = partnerList,
                onSeeAllClick = { navController.navigate(BestPickRestaurant) }
            )
        },
        allRestaurants = {
            AllRestaurants(
                header = stringResource(R.string.all_restaurants),
                partners = partnerList,
                onSeeAllClicked = { navController.navigate(AllRestaurant) }
            )
        }
    )
}