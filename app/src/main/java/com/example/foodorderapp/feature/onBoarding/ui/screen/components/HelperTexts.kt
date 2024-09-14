package com.example.foodorderapp.feature.onBoarding.ui.screen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodorderapp.R
import com.example.foodorderapp.theme.gothicSemiBold
import com.example.foodorderapp.theme.poppinsBold

@Composable
fun CompanyNameText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.padding(24.dp),
        text = stringResource(id = R.string.tamang_food_service),
        style = MaterialTheme.typography.titleLarge.copy(
            fontFamily = poppinsBold,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 36.sp
        )
    )
}

@Composable
fun TitleText(modifier: Modifier = Modifier, title: Int) {
    Text(
        modifier = modifier.padding(24.dp),
        text = stringResource(id = title),
        style = MaterialTheme.typography.titleLarge.copy(
            fontFamily = poppinsBold,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun DescriptionText(modifier: Modifier = Modifier, desc: Int) {
    Text(
        modifier = modifier,
        text = stringResource(id = desc),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center
        )
    )
}

@Composable
fun PreviewButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.preview),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

@Composable
fun NextButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.next),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

@Composable
fun GetStartedButtonText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.get_started),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}