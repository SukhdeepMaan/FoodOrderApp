package com.example.foodorderapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = accentColor,
    onPrimary = bgColor,
    background = bgColor,
    onBackground = mainColor,
    surface = bgColor,
    onSurface = mainColor,
    primaryContainer = bgColor,
    onPrimaryContainer = mainColor


)

private val LightColorScheme = lightColorScheme(
    primary = accentColor,
    onPrimary = bgColor,
    secondary = Color.Gray,
    background = bgColor,
    onBackground = mainColor,
    surface = bgColor,
    onSurface = mainColor,
    primaryContainer = accentColor,
    onPrimaryContainer = mainColor
)

@Composable
fun FoodOrderAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        /*dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }*/

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}