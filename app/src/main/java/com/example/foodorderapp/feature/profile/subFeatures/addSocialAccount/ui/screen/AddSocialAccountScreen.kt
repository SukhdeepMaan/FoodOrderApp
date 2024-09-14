package com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components.AddSocialAccountCommonLayout
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components.AddSocialAccountText
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components.ButtonsNextToEachOther
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components.ButtonsOnTopOfEachOther
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.components.YouWillGoText
import com.example.foodorderapp.utils.LocalWindowInfo
import com.example.foodorderapp.utils.WindowInfo


@Composable
fun AddSocialAccountScreen(
    modifier: Modifier = Modifier,
) {

    val windowInfo = LocalWindowInfo.current
    val isCompact = windowInfo.screenWidthType == WindowInfo.WindowType.Compact

    AddSocialAccountCommonLayout(
        modifier = modifier,
        topBar = {
            AppHeader(title = stringResource(R.string.add_social_accounts_normal_text), onBack = {})
        },
        content = {
            item { }
            item {
                AddSocialAccountText()
                YouWillGoText(modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp))
                if (isCompact) {
                    ButtonsOnTopOfEachOther(facebookOnClick = {}, googleOnClick = {})
                } else {
                    ButtonsNextToEachOther(facebookOnClick = {}, googleOnClick = {})
                }
            }
        }
    )
}