package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import com.example.foodorderapp.utils.WindowInfo
import com.example.foodorderapp.utils.rememberWindowInfo

/**
 * A custom scaffold composable that provides a flexible layout for screens with a top bar, content area,
 * and a bottom navigation bar or side navigation rail depending on the screen width. This scaffold adjusts
 * its padding based on the size of the top bar, bottom bar, or navigation rail to ensure content is properly laid out.
 *
 * @param modifier A [Modifier] to be applied to the scaffold, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param windowInfo A [WindowInfo] object that provides information about the current screen configuration, such as screen width type.
 * Default value is obtained from `rememberWindowInfo()`.
 *
 * @param topBar An optional [Composable] lambda that provides the content for the top bar. If not `null`, the top bar is displayed at the top of the screen.
 *
 * @param navigationBar An optional [Composable] lambda that provides the content for the bottom navigation bar or side navigation rail.
 * The component displayed depends on the screen width; for compact screens, a bottom bar is used, while for larger screens, a side rail is used.
 *
 * @param content A [Composable] lambda that provides the main content of the screen. The content is placed inside a `Column` and its layout
 * is adjusted based on the sizes of the top bar, bottom bar, or navigation rail.
 */

@Composable
fun NewCustomScaffold(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo = rememberWindowInfo(),
    topBar: @Composable (() -> Unit)? = null,
    navigationBar: @Composable (() -> Unit)? = null,
    content: @Composable ColumnScope.(modifier: Modifier) -> Unit,
) {
    var topBarHeight by remember { mutableIntStateOf(0) } // Store height in pixels
    var navigationRailWidth by remember { mutableIntStateOf(0) } // Store width in pixels
    var bottomBarHeight by remember { mutableIntStateOf(0) } // Store height in pixels
    val density = LocalDensity.current // Get the current density

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        // main content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = with(density) { topBarHeight.toDp() },
                    start = with(density) { navigationRailWidth.toDp() },
                    bottom = with(density) { bottomBarHeight.toDp() }
                )
        ) { content(Modifier.weight(1f)) }
        // top bar
        topBar?.let {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .onSizeChanged {
                        topBarHeight = it.height
                    } // Directly store the height in pixels
            ) { it() }
        }
        // bottom bar
        navigationBar?.let {
            if (windowInfo.screenWidthType is WindowInfo.WindowType.Compact) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .onSizeChanged {
                            bottomBarHeight = it.height // Directly store the width in pixels
                        }
                ) { it() }
            } else {
                // side navigation rail
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = with(density) { topBarHeight.toDp() })
                        .onSizeChanged {
                            navigationRailWidth = it.width // Directly store the width in pixels
                        }
                ) { it() }
            }
        }
    }
}