package com.example.foodorderapp.feature.home.homeUi.screen.components

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AutoScroll(
    scope: CoroutineScope = rememberCoroutineScope(),
    pagerState: PagerState,
    isUserScrolling: Boolean,
    onUserScrollDetected: () -> Unit

) {
    // Automatically scroll pages every 5 seconds
    LaunchedEffect(pagerState, isUserScrolling) {
        if (!isUserScrolling) {
            while (true) { // Infinite loop to keep the scrolling going
                yield() // Yield to prevent blocking the UI thread
                delay(5000) // Delay for 5 seconds
                scope.launch {
                // Calculate the next page index
                    val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
                    pagerState.animateScrollToPage(
                        page = nextPage,
                        animationSpec = tween(
                            durationMillis = 1000, // Adjust duration to make it smoother
                            easing = LinearOutSlowInEasing
                        )
                    )
                }
            }
        } else {
            onUserScrollDetected() // Reset the user scroll detection
        }
    }
}

// Detect when the page changes manually
@Composable
fun DetectManualScroll(
    currentPage: Int,
    isScrollInProgress: Boolean,
    onManualScrollDetected: () -> Unit
) {
    LaunchedEffect(currentPage) {
        if (isScrollInProgress) {
            onManualScrollDetected()
        }
    }
}
