package com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.doNotHaveAnyCard.components.CardImage
import com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.components.GetCreditsText
import com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.components.ReferAFriendText
import com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.components.ReferLinkText
import com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.components.ReferToFriendCommonLayout
import com.example.foodorderapp.theme.superLightGray
import com.example.foodorderapp.utils.LocalWindowInfo
import com.example.foodorderapp.utils.WindowInfo

@Composable
fun ReferToFriendScreen(
    modifier: Modifier = Modifier,
) {

    val windowInfo = LocalWindowInfo.current
    ReferToFriendCommonLayout(
        modifier = modifier,
        topBar = {
            AppHeader(title = stringResource(R.string.refer_to_friends), onBack = {})
        },
        content = {
            if (windowInfo.screenWidthType == WindowInfo.WindowType.Compact) {
                item {  }
            }
            item {
                CardImage(modifier = Modifier.padding(vertical = 16.dp))
                ReferAFriendText()
                GetCreditsText(modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp))
                CustomButton(
                    modifier = Modifier.padding(16.dp),
                    color = superLightGray,
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.curved_arrow),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                    ReferLinkText(modifier = Modifier.weight(1f))
                }
            }
        }
    )
}