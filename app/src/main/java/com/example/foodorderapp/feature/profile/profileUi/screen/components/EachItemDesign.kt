package com.example.foodorderapp.feature.profile.profileUi.screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppIcon
import com.example.foodorderapp.feature.profile.domain.AccountBasicSetting
import com.example.foodorderapp.feature.profile.domain.MoreSetting
import com.example.foodorderapp.feature.profile.domain.NotificationSetting
import com.example.foodorderapp.feature.profile.domain.SettingType

@Composable
fun EachItemDesign(
    modifier: Modifier = Modifier,
    title: String,
    item: Any,
    selectedItem: (Any) -> Unit,
    iconWidthSize: (Dp) -> Unit,
    isSwitched: (Boolean, item: Any) -> Unit,
) {
    when (title) {
        SettingType.BASICS.naming -> {
            item as AccountBasicSetting
            EachItem(
                modifier = modifier
                    .clickable {
                        selectedItem(item)
                    }
                    .padding(vertical = 12.dp),
                startIcon = item.icon,
                name = item.name,
                description = item.description,
                onIconSizeCalculated = { size ->
                    iconWidthSize(size)
                },
                endIcon = { mModifier ->
                    AppIcon(
                        modifier = mModifier.rotate(180f),
                        icon = R.drawable.back_arrow
                    )
                })
        }

        SettingType.NOTIFICATION.naming -> {
            item as NotificationSetting
            // if you want to pass item at onClick then follow top code and below
            EachItem(
                modifier = modifier
                    .padding(vertical = 12.dp),
                startIcon = item.icon,
                name = item.name,
                description = item.description,
                onIconSizeCalculated = { size ->
                    iconWidthSize(size)
                },
                endIcon = { mModifier ->
                    Switch(
                        modifier = mModifier,
                        checked = item.isEnabled,
                        onCheckedChange = { isSwitched(it, item)}
                    )
                }
            )
        }

        SettingType.MORE.naming -> {
            item as MoreSetting
            EachItem(
                modifier = modifier
                    .clickable {
                        selectedItem(item)
                    }
                    .padding(vertical = 12.dp),
                startIcon = item.icon,
                name = item.name,
                description = item.description,
                onIconSizeCalculated = { size ->
                    iconWidthSize(size)
                },
                endIcon = { mModifier ->
                    AppIcon(
                        modifier = mModifier.rotate(180f),
                        icon = R.drawable.back_arrow
                    )
                }
            )
        }
    }
}