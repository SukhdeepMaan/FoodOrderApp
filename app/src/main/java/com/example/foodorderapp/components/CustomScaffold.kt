package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import kotlinx.coroutines.launch

/**
 * A custom scaffold composable that provides a flexible structure for laying out a screen with content,
 * an optional bottom bar, a drawer, and a modal bottom sheet. This scaffold allows you to easily combine
 * these elements while managing their visibility and state.
 *
 * @param modifier A [Modifier] to be applied to the scaffold, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param content A [Composable] lambda that provides the main content of the screen. This content takes up the majority of the screen space.
 *
 * @param bottomBar An optional [Composable] lambda that provides the content for the bottom bar. If not `null`, the bottom bar is displayed at the bottom of the screen.
 *
 * @param drawerContent An optional [Composable] lambda that provides the content for a side drawer. The drawer is displayed when `drawerOpen` is `true`.
 *
 * @param drawerOpen A [Boolean] that controls the visibility of the side drawer. If `true`, the drawer content is displayed.
 * Default value is `false`.
 *
 * @param bottomSheetContent An optional [Composable] lambda that provides the content for a modal bottom sheet. If not `null`, the bottom sheet is displayed.
 *
 * @param bottomSheetState A [SheetState] object that manages the state of the bottom sheet, such as whether it is expanded or hidden.
 * Default value is `rememberModalBottomSheetState()`.
 *
 * @OptIn(ExperimentalMaterial3Api::class)
 * This function uses experimental Material 3 APIs, including `ModalBottomSheet`.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomScaffold(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    bottomBar: @Composable (() -> Unit)? = null,
    drawerContent: @Composable (() -> Unit)? = null,
    drawerOpen: Boolean = false,
    bottomSheetContent: @Composable (() -> Unit)? = null,
    bottomSheetState: SheetState = rememberModalBottomSheetState()
) {
    val scope = rememberCoroutineScope()
    var bottomBarHeight by remember { mutableStateOf(0.dp) }
    // Scaffold
    Box(modifier = modifier.fillMaxWidth()) {
        Column {
            // Content
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(bottomBarHeight)
            ) {
                content()
            }
            // Bottom bar
            bottomBar?.let {
                Box(modifier = Modifier.onSizeChanged {
                    bottomBarHeight = it.toSize().height.dp
                }
                ) { it() }
            }
        }
        // Bottom sheet
        bottomSheetContent?.let {
            ModalBottomSheet(
                sheetState = bottomSheetState,
                onDismissRequest = { scope.launch { bottomSheetState.hide() } }) {
                it()
            }
        }
        // Drawer
        if (drawerOpen) {
            drawerContent?.let {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .fillMaxHeight()
                        .fillMaxWidth(0.75f)
                ) {
                    it()
                }
            }
        }
    }
}