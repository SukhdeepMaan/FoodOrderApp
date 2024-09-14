package com.example.foodorderapp.feature.home.homeUi.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.foodorderapp.R
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.feature.home.homeUi.screen.components.Advertisement
import com.example.foodorderapp.feature.home.homeUi.screen.components.AllRestaurants
import com.example.foodorderapp.feature.home.homeUi.screen.components.FeaturedPartners
import com.example.foodorderapp.feature.home.homeUi.screen.components.HomeCommonLayout
import com.example.foodorderapp.feature.home.homeUi.screen.components.OfferDesign
import com.example.foodorderapp.feature.home.homeUi.viewModel.HomeViewModel
import com.example.foodorderapp.navigation.Route

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel,
    onNavigate: (Route) -> Unit
) {
    val homeState by homeViewModel.homeState.collectAsState()

    HomeCommonLayout(
        modifier = modifier,
        advertisement = { Advertisement(images = homeState.addList) },
        featuredPartners = {
            FeaturedPartners(
                header = stringResource(R.string.featured_partners_header),
                partners = homeState.partnersList,
                onSeeAllClick = { onNavigate(Home.FeaturedPartners) }
            )
        },
        offers = { if (homeState.isOffer) OfferDesign(image = homeState.offer) else null },
        bestPicks = {
            FeaturedPartners(
                header = stringResource(R.string.best_picks_restaurants_by_team),
                partners = homeState.partnersList,
                onSeeAllClick = { onNavigate(Home.FeaturedPartners) }
            )
        },
        allRestaurants = {
            AllRestaurants(
                header = stringResource(R.string.all_restaurants),
                partners = homeState.partnersList,
                onSeeAllClicked = { onNavigate(Home.FeaturedPartners) }
            )
        }
    )
}