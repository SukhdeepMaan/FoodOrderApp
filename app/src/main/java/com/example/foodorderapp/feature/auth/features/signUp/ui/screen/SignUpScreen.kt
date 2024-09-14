package com.example.foodorderapp.feature.auth.features.signUp.ui.screen

import android.widget.Toast
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.auth.features.signUp.ui.screen.components.CreateAccountText
import com.example.foodorderapp.feature.auth.features.signUp.ui.screen.components.HintLineWithButton
import com.example.foodorderapp.feature.auth.features.signUp.ui.screen.components.SomeButtonsTogether
import com.example.foodorderapp.feature.auth.features.signUp.ui.screen.components.SomeLabelAndFieldsTogether
import com.example.foodorderapp.feature.auth.features.signUp.ui.viewModel.SignUpViewModel
import com.example.foodorderapp.feature.home.common.navigation.Home
import com.example.foodorderapp.navigation.Route

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    viewModel: SignUpViewModel,
    onNavigate: (Route) -> Unit
) {
    val state by viewModel.signUpState.collectAsState()
    val focusManager = LocalFocusManager.current
    val context = LocalContext.current
    val toast = Toast.makeText(
        context,
        stringResource(R.string.this_feature_is_currently_under_development),
        Toast.LENGTH_SHORT
    )
    RegisterLayout(
        modifier = modifier
            .pointerInput(key1 = Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
        content = {
            item {
                CreateAccountText()
                HintLineWithButton(onClick = { onNavigate(Auth.SignIn) })
                SomeLabelAndFieldsTogether(
                    state = state,
                    onEvent = viewModel::onEvent
                )
                Spacer(modifier = Modifier.height(48.dp))
                SomeButtonsTogether(
                    signUp = { onNavigate(Home.HomePage)},
                    signInWithFacebook = { toast.show() },
                    signInWithGoogle = { toast.show() }
                )
            }
        }
    )
}