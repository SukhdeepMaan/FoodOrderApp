package com.example.foodorderapp

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
import com.example.foodorderapp.navigation.AppNavGraph
import com.example.foodorderapp.navigation.NaviBar.NavigationBarManager
import com.example.foodorderapp.navigation.topBar.TopBarManager
import com.example.foodorderapp.theme.FoodOrderAppTheme
import com.example.foodorderapp.utils.LocalNavigation
import com.example.foodorderapp.utils.LocalWindowInfo
import com.example.foodorderapp.utils.rememberWindowInfo
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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