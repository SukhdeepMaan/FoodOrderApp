package com.example.foodorderapp.utils

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController


val LocalNavigation = staticCompositionLocalOf<NavHostController> {
    error("error in NavHost controller")
}

val LocalWindowInfo = staticCompositionLocalOf<WindowInfo> {
    error("error in window info")
}