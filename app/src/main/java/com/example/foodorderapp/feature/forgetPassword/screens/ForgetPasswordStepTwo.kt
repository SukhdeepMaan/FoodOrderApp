package com.example.foodorderapp.feature.forgetPassword.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.HeadLineText
import com.example.foodorderapp.components.HeaderBelowTextAndButton
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.forgetPassword.screens.components.HavingProblemButton
import com.example.foodorderapp.feature.forgetPassword.screens.components.SendAgain
import com.example.foodorderapp.feature.signIn.screens.components.CupImage


@Composable
fun ForgetPasswordStepTwo(modifier: Modifier = Modifier) {
    RegisterLayout(
        modifier = modifier,
        topBar = { AppHeader(title = stringResource(id = R.string.forget_password)) { /*back button action */} },
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
        line1Text = "We have sent an instructions email to",
        line2Text = "sajin tamang@gmail.com.",
        lineGap = 4.dp,
        textButton = {
            HavingProblemButton(onClick = {})
        }
    )
}