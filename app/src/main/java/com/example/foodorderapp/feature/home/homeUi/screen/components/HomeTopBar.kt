package com.example.foodorderapp.feature.home.homeUi.screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Icon
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.TopBarLayout
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.feature.home.common.uiComponent.DeliveryToText
import com.example.foodorderapp.feature.home.common.uiComponent.FilterButtonText
import com.example.foodorderapp.feature.home.common.uiComponent.LocationText
import com.example.foodorderapp.utils.LocalNavigation

@Composable
fun HomeTopBar(
    modifier: Modifier = Modifier,
) {
    val navController = LocalNavigation.current
    TopBarLayout(
        modifier = modifier,
        trailingIcon = {
            TextButton(onClick = { navController.navigate(Home.Filter) }) {
                FilterButtonText()
            }
        },
        title = {
            Row(
                verticalAlignment = Alignment.Bottom,
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    DeliveryToText()
                    // TODO get location from viewModel and pass here
                    LocationText(location = "Select Location")
                }
                Icon(
                    modifier = Modifier
                        .offset(y = 2.dp)
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            //TODO navigate to location picker screen to select location
                            /*navController.navigate(FindRestaurant)*/
                        }
                        .rotate(-90f),
                    painter = painterResource(id = R.drawable.back_arrow),
                    contentDescription = stringResource(R.string.location_picker)
                )
            }
        }
    )
}