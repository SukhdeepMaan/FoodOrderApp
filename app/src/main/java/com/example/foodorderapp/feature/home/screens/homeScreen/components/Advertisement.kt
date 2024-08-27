package com.example.foodorderapp.feature.home.screens.homeScreen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.feature.onBoarding.screen.components.PagerIndicator2
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Advertisement(
    modifier: Modifier = Modifier,
    images: List<Int>
) {
    val pagerState = rememberPagerState { images.size }
    val scope = rememberCoroutineScope()

    var isUserScrolling by remember { mutableStateOf(false) }  // Track user scrolling
    DetectManualScroll(                                             // Detect manual scroll
        currentPage = pagerState.currentPage,
        isScrollInProgress = pagerState.isScrollInProgress
    ) { isUserScrolling = true }
    AutoScroll(                                                     // Auto scroll
        pagerState = pagerState,
        isUserScrolling = isUserScrolling
    ) { isUserScrolling = false }

    Box(modifier = modifier) {
        HorizontalPager(
            modifier = Modifier,
            state = pagerState,
        ) { page ->
            EachPage(image = images[page])
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
}

@Composable
fun EachPage(
    modifier: Modifier = Modifier,
    image: Int
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(220.dp)
            .clip(RoundedCornerShape(16.dp)),
        painter = painterResource(id = image),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}