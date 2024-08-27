package com.example.foodorderapp.feature.search.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.feature.location.screen.components.SearchItemField
import com.example.foodorderapp.feature.search.data.searchingTypes
import com.example.foodorderapp.feature.search.screen.components.SearchCompactLayout
import com.example.foodorderapp.feature.search.screen.components.SearchMediumLayoutAndExpanded
import com.example.foodorderapp.feature.search.screen.components.SearchText
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo
) {

    Column(modifier = modifier.fillMaxSize()) {
        SearchText()
        SearchItemField(
            value = "",
            onValueChange = {}) {

        }
        if (windowInfo.screenWidthType is WindowInfo.WindowType.Compact) {
            SearchCompactLayout(list = searchingTypes)
        } else {
            SearchMediumLayoutAndExpanded(list = searchingTypes)
        }
    }
}