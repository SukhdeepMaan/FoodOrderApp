package com.example.foodorderapp.feature.signIn.screens.screenByNumber.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun DropDownCountryList(
    modifier: Modifier = Modifier,
    expanded: Boolean,
    onClicked: () -> Unit,
    onDismissRequest: () -> Unit,
    selectedCountry: Country,
    itemClicked: (Country) -> Unit
) {

    val rotation = animateFloatAsState(
        targetValue = if (expanded) -180f else 0f,
        animationSpec = tween(300),
        label = "")

    Box(modifier = modifier
        .clickable { onClicked() }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            AnimatedContent(
                targetState = selectedCountry,
                transitionSpec = {
                    slideInHorizontally(animationSpec = tween(300)) with slideOutVertically(animationSpec = tween(300))
                }, label = ""
            ) { targetCountry ->
                AppIcon(
                    modifier = Modifier
                        .size(36.dp),
                    icon = targetCountry.flag
                )
            }
            AppIcon(
                modifier = Modifier
                    .rotate(rotation.value),
                icon = R.drawable.small_arrow)
        }
        // Display the list of countries when expanded
        DropDownMenuToShowList(
            expanded = expanded,
            list = listOfCountries,
            itemClicked = itemClicked,
            onDismissRequest = onDismissRequest
        )
    }
}

@Composable
fun DropDownMenuToShowList(
    modifier: Modifier = Modifier,
    expanded: Boolean,
    list: List<Country>,
    itemClicked: (Country) -> Unit,
    onDismissRequest: () -> Unit
) {
    DropdownMenu(
        modifier = modifier.background(Color.White),
        expanded = expanded,
        onDismissRequest = onDismissRequest
    ) {
        list.forEach { country ->
            DropdownMenuItem(
                text = {
                    EachDropItem(country = country)
                },
                onClick = { itemClicked(country) })
            if (country != list.last()) {
                HorizontalDivider(modifier = Modifier.alpha(0.2f))
            }
        }
    }
}
