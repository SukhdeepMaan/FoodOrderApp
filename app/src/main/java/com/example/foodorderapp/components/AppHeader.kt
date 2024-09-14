package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.foodorderapp.R
import com.example.foodorderapp.theme.poppinsRegular

/**
 * A composable function that displays a customizable app header with a title and a back button.
 * The header uses a top bar layout, making it suitable for screens where a back navigation option
 * and a title are required.
 *
 * @param modifier A [Modifier] to be applied to the root layout of the header.
 * It allows customization of the header's size, padding, and other behaviors.
 * Default value is `Modifier`.
 *
 * @param title A [String] representing the title text to be displayed in the header.
 * The title is styled with a bold font weight, centered, and uses the `poppinsRegular` font family.
 *
 * @param onBack A lambda function that will be invoked when the back button is clicked.
 * This is typically used to handle back navigation actions.
 */

@Composable
fun AppHeader(
    modifier: Modifier = Modifier,
    title: String,
    onBack: () -> Unit
) {
    TopBarLayout(
        modifier = modifier,
        title = {
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontFamily = poppinsRegular,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                )
            }
        },
        leadingIcon = {
            IconButton(
                onClick = onBack
            ) {
                AppIcon(icon = R.drawable.back_arrow)
            }
        }
    )
}