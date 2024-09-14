package com.example.foodorderapp.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.theme.fbColor
import com.example.foodorderapp.theme.gothicSemiBold

/**
 * A composable function that displays a button for signing in with either Google or Facebook. The button is customizable in terms of
 * its appearance, including the text, icon, background color, and the action triggered on click.
 *
 * @param modifier A [Modifier] to be applied to the button, allowing for customization of its size, layout, and behavior.
 * Default value is `Modifier`.
 *
 * @param isFacebook A [Boolean] that determines the platform being represented. If `true`, the button is styled for Facebook; otherwise,
 * it's styled for Google or another platform. Default value is `true`.
 *
 * @param text A [String] representing the text displayed on the button. Default value is the string resource for "Connect with Facebook".
 *
 * @param icon An optional drawable resource ID representing the platform's icon. The icon is displayed on the button. Default value is the Facebook icon drawable resource.
 *
 * @param bgColor A [Color] used as the background color for the button. This color typically matches the brand color of the platform (e.g., Facebook blue). Default value is `fbColor`.
 *
 * @param onClick A lambda function that is invoked when the button is clicked. This handles the button's click event and triggers the sign-in action.
 */

@Composable
fun SignWithGoogleFacebook(
    modifier: Modifier = Modifier,
    isFacebook: Boolean = true,
    text: String = stringResource(R.string.connect_with_facebook),
    @DrawableRes icon: Int = R.drawable.facebook_png_icon,
    bgColor: Color = fbColor,
    onClick: () -> Unit
) {
    CustomButton(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        color = bgColor
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.background,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(8.dp)
                    .size(14.dp),
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = if (isFacebook) fbColor else Color.Unspecified,
            )
            Text(
                text = text,
                color = MaterialTheme.colorScheme.background,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontFamily = gothicSemiBold,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Box{}
        }
    }
}
