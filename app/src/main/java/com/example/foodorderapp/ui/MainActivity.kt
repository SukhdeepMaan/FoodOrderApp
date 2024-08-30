package com.example.foodorderapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.foodorderapp.components.NewCustomScaffold
import com.example.foodorderapp.typeSafeNavigation.AppNavGraph
import com.example.foodorderapp.ui.theme.FoodOrderAppTheme
import com.example.foodorderapp.utils.LocalNavigation
import com.example.foodorderapp.utils.LocalWindowInfo
import com.example.foodorderapp.typeSafeNavigation.NaviBar.NavigationBarManager
import com.example.foodorderapp.typeSafeNavigation.topBar.TopBarManager
import com.example.foodorderapp.utils.rememberWindowInfo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val windowInfo = rememberWindowInfo()
            FoodOrderAppTheme {
                CompositionLocalProvider(
                    LocalNavigation provides navController,
                    LocalWindowInfo provides windowInfo
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        NewCustomScaffold(
                            topBar = { TopBarManager() },
                            navigationBar = { NavigationBarManager() }
                        ) { AppNavGraph() }
                    }
                }
            }
        }
    }
}