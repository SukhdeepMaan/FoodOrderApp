package com.example.foodorderapp.feature.search.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodorderapp.feature.location.ui.screen.components.SearchItemField
import com.example.foodorderapp.feature.search.domain.searchingTypes
import com.example.foodorderapp.feature.search.ui.screen.components.SearchCompactLayout
import com.example.foodorderapp.feature.search.ui.screen.components.SearchMediumLayoutAndExpanded
import com.example.foodorderapp.feature.search.ui.screen.components.SearchText
import com.example.foodorderapp.utils.LocalWindowInfo
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
) {
    val windowInfo = LocalWindowInfo.current

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