package com.example.foodorderapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.ui.theme.poppinsRegular


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