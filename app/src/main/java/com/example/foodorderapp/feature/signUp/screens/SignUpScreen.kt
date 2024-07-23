package com.example.foodorderapp.feature.signUp.screens

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.signUp.screens.components.CreateAccountText
import com.example.foodorderapp.feature.signUp.screens.components.HintLineWithButton
import com.example.foodorderapp.feature.signUp.screens.components.SomeButtonsTogether
import com.example.foodorderapp.feature.signUp.screens.components.SomeLabelAndFieldsTogether

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    val focusManager = LocalFocusManager.current

    RegisterLayout(
        modifier = modifier
            .pointerInput(key1 = Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
        topBar = {
            AppHeader(title = stringResource(R.string.sign_up)) {
            }
        },
        content = {
            item {
                CreateAccountText()
                HintLineWithButton(onClick = {})
                SomeLabelAndFieldsTogether()
                Spacer(modifier = Modifier.height(48.dp))
                SomeButtonsTogether(
                    signUp = {},
                    signInWithFacebook = {},
                    signInWithGoogle = {}
                )
            }
        }
    )
}