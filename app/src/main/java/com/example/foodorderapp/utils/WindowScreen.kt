package com.example.foodorderapp.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration

/**
 * Remembers and provides the current window information based on the configuration.
 *
 * This function determines the type of window size (Compact, Medium, Expanded) for both
 * width and height based on the current screen dimensions.
 *
 * @return A [WindowInfo] object containing the screen width type, screen height type,
 * screen width in dp, and screen height in dp.
 */
@Composable
fun rememberWindowInfo() : WindowInfo {
    val configuration = LocalConfiguration.current
    return remember(configuration) {
        WindowInfo(
            screenWidthType = when {
                configuration.screenWidthDp < 600 -> WindowInfo.WindowType.Compact
                configuration.screenWidthDp < 900 -> WindowInfo.WindowType.Medium
                else -> WindowInfo.WindowType.Expanded
            },
            screenHeightType = when {
                configuration.screenHeightDp < 480 -> WindowInfo.WindowType.Compact
                configuration.screenHeightDp < 900 -> WindowInfo.WindowType.Medium
                else -> WindowInfo.WindowType.Expanded
            },
            screenWidth = configuration.screenWidthDp,
            screenHeight = configuration.screenHeightDp
        )

    }
}

/**
 * Holds information about the current window size and its type.
 *
 * This data class encapsulates details about the screen dimensions and categorizes
 * the screen size into predefined types (Compact, Medium, Expanded) based on width and height.
 *
 * @property screenWidthType The type of window size based on screen width (Compact, Medium, Expanded).
 * @property screenHeightType The type of window size based on screen height (Compact, Medium, Expanded).
 * @property screenWidth The current screen width in dp.
 * @property screenHeight The current screen height in dp.
 */
data class WindowInfo (
    val screenWidthType: WindowType,
    val screenHeightType: WindowType,
    val screenWidth: Int,
    val screenHeight: Int
) {
    sealed class WindowType {
        data object Compact: WindowType()
        data object Medium: WindowType()
        data object Expanded: WindowType()
    }
}