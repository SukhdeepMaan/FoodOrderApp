package com.example.foodorderapp.feature.auth.forgetPassword.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeadLineText
import com.example.foodorderapp.components.HeaderBelowTextAndButton
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.auth.forgetPassword.screens.components.HavingProblemButton
import com.example.foodorderapp.feature.auth.forgetPassword.screens.components.SendAgain
import com.example.foodorderapp.feature.auth.signIn.screens.components.CupImage


@Composable
fun ForgetPasswordStepTwo(modifier: Modifier = Modifier, navController: NavHostController) {
    RegisterLayout(
        modifier = modifier,
        content = {
            item {
                ResetEmailSent()
                TextAndButtonBelowHeaders()
                Spacer(modifier = Modifier.height(24.dp))
                SendAgain(onClick = {})
            }
            item { CupImage() }
            item {}
        },
        isSpaceBetween = true
    )
}

@Composable
fun ResetEmailSent(modifier: Modifier = Modifier) {
    HeadLineText(
        modifier = modifier,
        text = stringResource(R.string.reset_email_sent),
    )
}

@Composable
fun TextAndButtonBelowHeaders(modifier: Modifier = Modifier) {
    HeaderBelowTextAndButton(
        modifier = modifier,
        line1Text = stringResource(R.string.we_have_sent_an_instructions_email_to),
        line2Text = stringResource(R.string.sajin_tamang_gmail_com),
        lineGap = 4.dp,
        textButton = {
            HavingProblemButton(onClick = {})
        }
    )
}