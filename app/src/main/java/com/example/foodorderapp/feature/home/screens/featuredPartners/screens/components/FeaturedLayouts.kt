package com.example.foodorderapp.feature.home.screens.featuredPartners.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.utils.WindowInfo

/**
 * A composable function that provides a layout for displaying a list of featured partners
 * in a grid format, with a configurable number of columns based on the screen width type.
 *
 * This layout includes a top bar for a header or other content, and a `LazyVerticalGrid` for
 * displaying the list of partners. The grid adjusts its column count according to the screen
 * width, ensuring optimal display across various screen sizes.
 *
 * @param modifier [Modifier] used to adjust the layout's appearance and behavior.
 *                 By default, it is set to an empty Modifier.
 * @param windowInfo [WindowInfo] contains information about the current window,
 *                   particularly the screen width type, which is used to determine the number
 *                   of columns in the grid.
 * @param topBar A composable lambda that allows you to pass in the top bar content, such as a
 *               header or toolbar. This content is displayed at the top of the layout.
 * @param content A lambda with a receiver of type [LazyGridScope], where you define the grid
 *                content. Typically, this will be a list of items, such as the featured
 *                partners.
 *
 * The grid's layout behavior is adjusted based on the screen width type:
 * - Compact: 2 columns
 * - Medium: 3 columns
 * - Expanded: 4 columns
 *
 * The grid also has built-in spacing between items, both horizontally and vertically,
 * and padding around the grid to ensure a visually appealing and consistent layout.
 */

@Composable
fun FeaturedPartnerLayout(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo,
    content: LazyGridScope.() -> Unit
) {
    val columns = when (windowInfo.screenWidthType) {
        is WindowInfo.WindowType.Compact -> 2
        is WindowInfo.WindowType.Medium -> 3
        is WindowInfo.WindowType.Expanded -> 4
    }
    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridCells.Fixed(columns),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp),
        content = content
    )
}