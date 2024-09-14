package com.example.foodorderapp.navigation.NaviBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.feature.profile.common.navigation.Profile
import com.example.foodorderapp.feature.search.ui.navigation.Search
import com.example.foodorderapp.utils.LocalNavigation
import com.example.foodorderapp.utils.LocalWindowInfo
import com.example.foodorderapp.utils.WindowInfo

val bottomBarScreens = listOf(
    Home.HomePage::class.qualifiedName,
    Profile.ProfileSetting::class.qualifiedName
)

@Composable
fun NavigationBarManager(modifier: Modifier = Modifier) {
    val navController = LocalNavigation.current
    val windowInfo = LocalWindowInfo.current
    val naviViewModel: NaviViewModel = viewModel()
    val selectedIndex by naviViewModel.selectedIndex.collectAsState()

    val onItemSelected: (Int) -> Unit = { index ->
        naviViewModel.setSelectedIndex(index)
        when (index) {
            0 -> navController.navigate(Home.HomePage)
            1 -> navController.navigate(Search)
            //  2 -> navController.navigate("anotherScreen") // Example
            3 -> navController.navigate(Profile.ProfileSetting)
        }
    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    when (navBackStackEntry?.destination?.route?.substringBefore("?")) {
        in bottomBarScreens -> {
            if (windowInfo.screenWidthType is WindowInfo.WindowType.Compact) {
                NaviBottomBar(
                    modifier = modifier,
                    navController = navController,
                    selectedIndex = selectedIndex,
                    onItemSelected = onItemSelected
                )
            } else {
                NaviRailBar(
                    modifier = modifier,
                    navController = navController,
                    selectedIndex = selectedIndex,
                    onItemSelected = onItemSelected
                )
            }
        }

        else -> {
            // No bottom bar or rail bar for other screens
        }
    }
}

@Composable
fun NaviBottomBar(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit = {}
) {
    LaunchedEffect(selectedIndex) {}
    Row(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(56.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        naviItems.forEachIndexed { index, it ->
            // TODO navigation each item is needed here
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = { onItemSelected(index) },
                icon = { Icon(painter = painterResource(id = it.icon), contentDescription = null) },
                label = { Text(text = it.name) },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.primaryContainer.copy(
                        alpha = 0.4f
                    ),
                    selectedIconColor = MaterialTheme.colorScheme.primaryContainer,
                    selectedTextColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    }
}

@Composable
fun NaviRailBar(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit = {}
) {
    LaunchedEffect(selectedIndex) {}
    Column(
        modifier
            .fillMaxHeight()
            .widthIn(min = 56.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        naviItems.forEachIndexed { index, it ->
            // TODO navigation each item is needed here
            NavigationRailItem(
                selected = selectedIndex == index,
                onClick = { onItemSelected(index) },
                icon = { Icon(painter = painterResource(id = it.icon), contentDescription = null) },
                label = { Text(text = it.name) },
                colors = NavigationRailItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.primaryContainer.copy(
                        alpha = 0.4f
                    ),
                    selectedIconColor = MaterialTheme.colorScheme.primaryContainer,
                    selectedTextColor = MaterialTheme.colorScheme.primaryContainer,
                )
            )
        }
    }
}
