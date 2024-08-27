package com.example.foodorderapp.components


import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

/**
 * A composable function that displays an icon using either a drawable resource or an [ImageVector].
 * It provides flexibility to choose between an Android drawable resource or a vector image.
 * The icon can also be tinted with a specified color.
 *
 * @param modifier A [Modifier] to be applied to the icon for customization of size, padding, etc.
 * Default value is `Modifier`.
 *
 * @param icon An optional drawable resource ID to be used as the icon. If provided, the icon will be
 * displayed using this drawable resource. This parameter is annotated with [DrawableRes].
 *
 * @param imageVector An optional [ImageVector] to be used as the icon. If provided, the icon will be
 * displayed using this vector image.
 *
 * @param contentDescription An optional [String] used for accessibility purposes to describe the icon.
 * This helps screen readers to identify the content of the icon.
 *
 * @param tint A [Color] to tint the icon. If not specified, the icon will be displayed with its default color.
 * The default value is `Color.Unspecified`.
 */

@Composable
fun AppIcon(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int? = null,
    imageVector: ImageVector? = null,
    contentDescription: String? = null,
    tint: Color = Color.Unspecified
) {
    icon?.let {
        Icon(
            painter = painterResource(id = it),
            contentDescription = contentDescription,
            modifier, tint
        )
    }
    imageVector?.let {
        Icon(
            imageVector = it,
            contentDescription = contentDescription,
            modifier, tint
        )
    }
}