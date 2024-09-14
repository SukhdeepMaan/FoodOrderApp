package com.example.foodorderapp.feature.home.homeUi.viewModel

import com.example.foodorderapp.feature.home.domain.Partner
import com.example.foodorderapp.feature.home.domain.advertisement.advertisementList
import com.example.foodorderapp.feature.home.domain.offerImg

// some states will be empty when data comes from backend

data class HomeState(
    val isOffer: Boolean = true,
    val offer : Int = offerImg,
    val addList: List<Int> = advertisementList,
    val partnersList: List<Partner> = com.example.foodorderapp.feature.home.domain.partnersList
)
