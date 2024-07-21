package com.example.foodorderapp.screens.registration.signIn.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.CustomButton
import com.example.foodorderapp.ui.theme.fbColor
import com.example.foodorderapp.ui.theme.googleColor


@Composable
fun SignInButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(modifier = modifier, onClick = onClick) {
        SingInTextForButton()
    }
}

@Composable
fun SignInWithFacebook(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = fbColor,
        )
    ) {
        Icon(
            modifier = Modifier
                .background(
                    color = MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(14.dp, 10.dp),
            painter = painterResource(id = R.drawable.facebook_png_icon),
            contentDescription = null,
            tint = fbColor
        )
        Text(
            text = stringResource(R.string.connect_with_facebook),
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun SignInWithGoogle(modifier: Modifier = Modifier, onClick: () -> Unit) {
    CustomButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = googleColor,
        )
    ) {
        Icon(
            modifier = Modifier
                .background(
                    color = MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(10.dp, 10.dp),
            painter = painterResource(id = R.drawable.google_icon),
            contentDescription = null,
            tint = Color.Unspecified
        )
        Text(
            text = stringResource(R.string.connect_with_google),
            modifier = Modifier.weight(1f),
            color = MaterialTheme.colorScheme.background,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun DoNotHaveAccountButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        DoNotHaveAccountText()
    }
}

@Composable
fun CreateNewAccountButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        CreateNewAccountText()
    }
}

@Composable
fun ForgetPasswordButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        ForgetPasswordText()
    }
}