package com.example.foodorderapp.feature.home.homeUi.screen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.home.domain.Partner
import com.example.foodorderapp.feature.onBoarding.ui.screen.components.PagerIndicator2
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PartnerScrollableImagesAndDetail(
    modifier: Modifier = Modifier,
    partner: Partner,
    scrollableImages: List<Int>,
    detail: @Composable (() -> Unit)? = null
) {
    val pagerState = rememberPagerState { scrollableImages.size }
    val scope = rememberCoroutineScope()

    Column(modifier = modifier.fillMaxWidth()){
        Box(modifier = Modifier) {
            HorizontalPager(
                modifier = Modifier,
                state = pagerState,
            ) { page ->
                EachPage(image = scrollableImages[page]) // here partner image list will be passed
            }
            PagerIndicator2(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 16.dp, end = 24.dp),
                pageCount = pagerState.pageCount,
                currentPage = pagerState.currentPage
            ) {
                scope.launch {
                    pagerState.animateScrollToPage(it)
                }
            }
        }
        detail?.invoke()
    }
}