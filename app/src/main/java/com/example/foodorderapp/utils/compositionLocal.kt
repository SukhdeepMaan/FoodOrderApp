package com.example.foodorderapp.utils

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController


val LocalNavigation = staticCompositionLocalOf<NavHostController> {
    error("error in navhost controller")
}