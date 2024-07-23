package com.example.foodorderapp.feature.onBoarding.screen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import com.example.foodorderapp.feature.onBoarding.data.OnBoardingData
import com.example.foodorderapp.feature.onBoarding.data.listOfOnBoardingData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerDesign(modifier: Modifier = Modifier, pagerState: PagerState) {

    HorizontalPager(modifier = modifier.fillMaxSize(), state = pagerState) { page ->
        PagerContent(data = listOfOnBoardingData[page])
    }
}

@Composable
fun PagerContent(modifier: Modifier = Modifier, data: OnBoardingData) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
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
