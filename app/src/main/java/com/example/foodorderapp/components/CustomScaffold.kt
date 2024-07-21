package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
    var bottomPadding by remember { mutableStateOf(0.dp) }
    // Scaffold
    Box(modifier = modifier.fillMaxWidth()) {
        Column {
            // Content
            Box(modifier = Modifier
                .weight(1f)
                .padding(bottom = bottomPadding)) {
                content()
            }
            // Bottom bar
            bottomBar?.let {
                Box(modifier = Modifier.onSizeChanged {
                    bottomPadding = it.toSize().height.dp
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
                        .align(Alignment.CenterEnd)
                        .fillMaxHeight()
                        .fillMaxWidth(0.75f)
                ) {
                    it()
                }
            }
        }
    }
}