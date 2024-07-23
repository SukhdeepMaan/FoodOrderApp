package com.example.foodorderapp.feature.onBoarding.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.onBoarding.data.listOfOnBoardingData
import com.example.foodorderapp.feature.onBoarding.screen.components.BottomRowButtons
import com.example.foodorderapp.feature.onBoarding.screen.components.CustomCircle
import com.example.foodorderapp.feature.onBoarding.screen.components.PagerDesign
import com.example.foodorderapp.feature.onBoarding.screen.components.PagerIndicator
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState { listOfOnBoardingData.size }
    val scope = rememberCoroutineScope()
    Box(modifier = modifier.fillMaxSize()) {
        if (pagerState.currentPage == 0) {
            CustomCircle()
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PagerDesign(
                modifier = Modifier.weight(1f),
                pagerState = pagerState
            )
            PagerIndicator(
                modifier = Modifier.padding(vertical = 16.dp),
                pageCount = listOfOnBoardingData.size,
                currentPage = pagerState.currentPage
            ) {
                scope.launch {
                    pagerState.animateScrollToPage(page = it)
                }
            }
            BottomRowButtons(
                shouldShowPreviewButton = pagerState.currentPage != 0,
                isNextButton = pagerState.currentPage != listOfOnBoardingData.size - 1,
                previewOnClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(page = pagerState.currentPage - 1)
                    }
                },
                nextOnClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(page = pagerState.currentPage + 1)
                    }
                },
            )
        }
    }
}

