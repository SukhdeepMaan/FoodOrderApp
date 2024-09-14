package com.example.foodorderapp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = accentColor,
    onPrimary = white,
    background = black,
    onBackground = white,
    surface = black,
    onSurface = white,
    primaryContainer = accentColor,
    onPrimaryContainer = black,
)

private val LightColorScheme = lightColorScheme(
    primary = accentColor,
    onPrimary = white,
    secondary = Color.Gray,
    background = white,
    onBackground = black,
    surface = white,
    onSurface = black,
    primaryContainer = accentColor,
    onPrimaryContainer = black,
    tertiaryContainer = superLightGray,
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