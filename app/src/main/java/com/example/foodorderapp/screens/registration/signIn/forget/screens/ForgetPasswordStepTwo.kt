package com.example.foodorderapp.screens.registration.signIn.forget.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.HeadLineText
import com.example.foodorderapp.components.HeaderBelowTextAndButton
import com.example.foodorderapp.screens.registration.signIn.SignInLayout
import com.example.foodorderapp.screens.registration.signIn.components.CupImage
import com.example.foodorderapp.screens.registration.signIn.forget.components.HavingProblemButton
import com.example.foodorderapp.screens.registration.signIn.forget.components.ForgetTopBar
import com.example.foodorderapp.screens.registration.signIn.forget.components.SendAgain


@Composable
fun ForgetPasswordStepTwo(modifier: Modifier = Modifier) {

    SignInLayout(
        modifier = modifier
            .padding(start = 24.dp, end = 24.dp, bottom = 24.dp),
        topBar = { ForgetTopBar() },
        content = {
            item {
                ResetEmailSent()
                TextAndButtonBelowHeaders()
                Spacer(modifier = Modifier.height(24.dp))
                SendAgain(onClick = {})
                CupImage()
            }
        }
    )
}

@Composable
fun ResetEmailSent(modifier: Modifier = Modifier) {
    HeadLineText(
        modifier = modifier.padding(top = 24.dp),
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