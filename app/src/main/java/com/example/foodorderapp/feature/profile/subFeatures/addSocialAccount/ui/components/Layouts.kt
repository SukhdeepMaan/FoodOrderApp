package com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
/**
 * A composable function that provides a common layout structure for adding social accounts.
 * The layout includes a customizable top bar and a scrollable list of content.
 *
 * @param modifier An optional modifier to be applied to the root `Column`.
 *        This allows for customization of the layout's appearance and behavior.
 * @param topBar A composable lambda function that defines the top bar's UI component.
 *        This function will be called to display the content at the top of the layout.
 * @param content A composable lambda function that defines the content of the `LazyColumn`.
 *        This function will be called to provide the list items displayed in the scrollable list. */

@Composable
fun AddSocialAccountCommonLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit,
    content: LazyListScope.() -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        topBar()
        LazyColumn(
            modifier = Modifier.weight(1f)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(88.dp),
            content = content
        )
    }
}