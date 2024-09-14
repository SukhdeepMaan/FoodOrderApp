package com.example.foodorderapp.feature.onBoarding.ui.screen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.feature.onBoarding.domain.repository.OnBoardingData
import com.example.foodorderapp.feature.onBoarding.domain.repository.listOfOnBoardingData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerDesign(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {

    HorizontalPager(
        modifier = modifier.fillMaxSize(),
        state = pagerState
    ) { page ->
        PagerContent(
            data = listOfOnBoardingData[page],
            pagerState = pagerState
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun PagerContent(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
    data: OnBoardingData
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(
            top = 64.dp
        )
    ) {
        item {
            if (pagerState.currentPage == 0) {
                CustomCircle()
            }
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Image(
                    modifier = modifier.size(64.dp),
                    painter = painterResource(id = R.drawable.leaf_img),
                    contentDescription = null
                )
                CompanyNameText()
            }
            MainImage(image = data.image)
            TitleText(title = data.title)
            DescriptionText(desc = data.desc)
        }
    }
}
