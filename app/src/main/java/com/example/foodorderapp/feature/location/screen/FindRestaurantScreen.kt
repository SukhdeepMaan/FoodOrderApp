package com.example.foodorderapp.feature.location.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.location.screen.components.CurrentLocationButton
import com.example.foodorderapp.feature.location.screen.components.FindNearByRestaurantText
import com.example.foodorderapp.feature.location.screen.components.PleaseEnterYourLocationText
import com.example.foodorderapp.feature.location.screen.components.SearchField
import com.example.foodorderapp.feature.location.screen.components.SearchedItems
import com.example.foodorderapp.feature.location.screen.components.TopBarForLocationScreen

@Composable
fun FindRestaurantScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    var searchAddress by remember { mutableStateOf("") }
    var totalHeight by remember { mutableIntStateOf(0) }
    val localDensity = LocalDensity.current
    Box(modifier = modifier.fillMaxSize()) {
        RegisterLayout(
            topBar = {
                TopBarForLocationScreen(
                    modifier = Modifier.onSizeChanged {
                        totalHeight += it.height
                    },
                    onBack = {
                        navController.popBackStack()
                    })
            },
            content = {
                item {
                    Column(
                        modifier = Modifier.onSizeChanged {
                            totalHeight += it.height
                        }
                    ) {
                        FindNearByRestaurantText(modifier = Modifier.fillMaxWidth())
                        PleaseEnterYourLocationText(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp)
                        )
                        CurrentLocationButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 24.dp),
                            onClick = {
                                // TODO: fetch current location and pass
                            }
                        )
                        SearchField(
                            modifier = Modifier.fillMaxWidth(),
                            value = searchAddress,
                            onClear = { searchAddress = "" },
                            onValueChange = {
                                searchAddress = it
                            }
                        )
                    }
                }
            }
        )
        AnimatedVisibility(
            visible = searchAddress.isNotEmpty(),
            enter = slideInVertically {
                with(localDensity) { 100.dp.roundToPx() }
            },
            exit = slideOutVertically {
                with(localDensity) { -30.dp.roundToPx() }
            },
        ) {
            SearchedItems(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .offset(y = with(localDensity) { totalHeight.toDp() + 26.dp }),
                onClick = {
                    /*navController.navigate(Home(userId = 1))*/
                }
            )
        }
    }
}