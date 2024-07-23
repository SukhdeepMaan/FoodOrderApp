package com.example.foodorderapp.feature.signIn.screens.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeadLineText
import com.example.foodorderapp.ui.theme.gothicSemiBold
import com.example.foodorderapp.ui.theme.poppinsRegular


@Composable
fun WelcomeText(modifier: Modifier = Modifier) {
    HeadLineText(
        text = stringResource(R.string.welcome_to_tamang_food_service)
    )
}

@Composable
fun SingInTextForButton(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.sign_in),
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = gothicSemiBold
        )
    )
}

@Composable
fun SingInText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.sign_in),
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = poppinsRegular,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    )
}

@Composable
fun ForgetPasswordText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.forget_password),
        style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.secondary)
    )
}

@Composable
fun OrText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.or),
        style = MaterialTheme.typography.titleMedium.copy(
            color = MaterialTheme.colorScheme.secondary,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun DoNotHaveAccountText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.secondary),
        text = stringResource(R.string.don_t_have_an_account)
    )
}

@Composable
fun CreateNewAccountText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
        text = stringResource(R.string.create_new_account)
    )
}

@Composable
fun ForgetText() {
    Text(
        text = "Forget Password",
        style = MaterialTheme.typography.bodyLarge.copy(
            fontFamily = poppinsRegular,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    )
}