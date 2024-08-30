package com.example.foodorderapp.feature.onBoarding.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.onBoarding.data.listOfOnBoardingData
import com.example.foodorderapp.feature.onBoarding.screen.components.BottomRowButtons
import com.example.foodorderapp.feature.onBoarding.screen.components.PagerDesign
import com.example.foodorderapp.feature.onBoarding.screen.components.PagerIndicator
import com.example.foodorderapp.utils.LocalNavigation
import kotlinx.coroutines.launch

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier ) {
    val pagerState = rememberPagerState { listOfOnBoardingData.size }
    val scope = rememberCoroutineScope()
    val navController = LocalNavigation.current
    OnBoardingSection(
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
                pageCount = listOfOnBoardingData.size,
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
                    if (pagerState.currentPage == listOfOnBoardingData.size - 1) {
                        navController.navigate(Auth)
                    }
                },
            )
        }
    )
}


@Composable
fun OnBoardingSection(
    modifier: Modifier = Modifier,
    pagerContent: (@Composable (modifier: Modifier) -> Unit)? = null,
    indicators: (@Composable () -> Unit)? = null,
    buttons: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier
    ) {
        pagerContent?.invoke(Modifier.weight(1f))
        indicators?.invoke()
        buttons?.invoke()
    }
}
