package com.example.foodorderapp.feature.location.screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon

@Composable
fun SearchedItems(modifier: Modifier = Modifier) {
    var iconWidth by remember {
        mutableStateOf(0.dp)
    }
    LazyColumn(
        modifier = modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp),
    ) {
        items(locations, key = { locations.indexOf(it) }) { location ->
            EachItemDesign(location = location,
                iconSize = {
                    iconWidth = it
                }
            ) {
            }
            HorizontalDivider(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = iconWidth),
                color = Color.LightGray
            )
        }
    }
}

@Composable
fun EachItemDesign(
    modifier: Modifier = Modifier,
    location: LocationDetail,
    iconSize: (Dp) -> Unit,
    onClick: (LocationDetail) -> Unit = {}
) {
    val localDensity = LocalDensity.current
    val iconPadding = 16.dp
    var iconWidth by remember {
        mutableIntStateOf(0)
    }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                onClick(location)
            }
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AppIcon(
            modifier = Modifier
                .padding(end = iconPadding)
                .onSizeChanged {
                    iconWidth = it.width
                },
            icon = R.drawable.location_arrow,
            tint = Color.Gray
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            LocationHeader(text = location.suburb)
            LocationState(text = location.city)
        }
        // Convert the icon width from pixels to Dp and call the iconSize function
        val totalIconWidthDp = with(localDensity) {
            iconWidth.toDp() + iconPadding + 4.dp
        }
        iconSize(totalIconWidthDp)
    }
}