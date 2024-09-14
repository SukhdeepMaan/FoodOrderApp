package com.example.foodorderapp.feature.onBoarding.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.onBoarding.ui.screen.components.BottomRowButtons
import com.example.foodorderapp.feature.onBoarding.ui.screen.components.OnBoardingLayout
import com.example.foodorderapp.feature.onBoarding.ui.screen.components.PagerDesign
import com.example.foodorderapp.feature.onBoarding.ui.screen.components.PagerIndicator
import com.example.foodorderapp.feature.onBoarding.ui.viewModel.OnBoardingViewModel
import com.example.foodorderapp.navigation.Route
import kotlinx.coroutines.launch

@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    viewModel: OnBoardingViewModel,
    onNavigate: (Route)-> Unit
) {
    val boardingList by viewModel.onBoardingList.collectAsState()
    val pagerState = rememberPagerState { boardingList.size }
    val scope = rememberCoroutineScope()

    OnBoardingLayout(
        modifier = modifier,
        pagerContent = {
            PagerDesign(
                modifier = it,
                pagerState = pagerState
            )
        },
        indicators = {
            PagerIndicator(
                modifier = Modifier.padding(vertical = 16.dp),
                pageCount = boardingList.size,
                currentPage = pagerState.currentPage
            ) {
                scope.launch {
                    pagerState.animateScrollToPage(page = it)
                }
            }
        },
        buttons = {
            BottomRowButtons(
                shouldShowPreviewButton = pagerState.currentPage != 0,
                isNextButton = pagerState.currentPage != boardingList.size - 1,
                previewOnClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(page = pagerState.currentPage - 1)
                    }
                },
                nextOnClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(page = pagerState.currentPage + 1)
                    }
                    if (pagerState.currentPage == boardingList.size - 1) {
                        onNavigate(Auth.SignIn)
                    }
                },
            )
        }
    )
}