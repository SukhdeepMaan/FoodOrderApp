package com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount.components.AddSocialAccountCommonLayout
import com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount.components.AddSocialAccountText
import com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount.components.ButtonsNextToEachOther
import com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount.components.ButtonsOnTopOfEachOther
import com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount.components.YouWillGoText
import com.example.foodorderapp.utils.WindowInfo

/**
 * Composable function to display the Add Social Account screen.
 *
 * This function sets up the layout for adding social media accounts, with a header and content
 * that adapts based on the screen width type. Depending on the screen size, the layout of the
 * buttons for adding social accounts will change.
 *
 * @param modifier Modifier to be applied to the layout.
 * @param windowInfo Object containing information about the window size. Used to determine
 *                   the screen width type and adjust the layout accordingly.
 */

@Composable
fun AddSocialAccountScreen(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo,
    navController: NavHostController
) {

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