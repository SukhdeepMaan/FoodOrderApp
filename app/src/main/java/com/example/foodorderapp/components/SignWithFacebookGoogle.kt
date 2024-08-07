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
import androidx.compose.material3.ButtonDefaults
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
import com.example.foodorderapp.ui.theme.fbColor
import com.example.foodorderapp.ui.theme.gothicSemiBold

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
                    .padding(12.dp)
                    .size(20.dp),
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
