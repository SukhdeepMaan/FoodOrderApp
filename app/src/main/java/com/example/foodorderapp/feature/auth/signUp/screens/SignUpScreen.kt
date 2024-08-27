package com.example.foodorderapp.feature.auth.signUp.screens

import android.widget.Toast
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodorderapp.R
import com.example.foodorderapp.components.RegisterLayout
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.auth.signUp.screens.components.CreateAccountText
import com.example.foodorderapp.feature.auth.signUp.screens.components.HintLineWithButton
import com.example.foodorderapp.feature.auth.signUp.screens.components.SomeButtonsTogether
import com.example.foodorderapp.feature.auth.signUp.screens.components.SomeLabelAndFieldsTogether
import com.example.foodorderapp.typeSafeNavigation.Home

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
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
                HintLineWithButton(onClick = {navController.navigate(Auth.SignIn) {
                    popUpTo(Auth.SignIn) {
                        inclusive = true
                    }
                } })
                SomeLabelAndFieldsTogether()
                Spacer(modifier = Modifier.height(48.dp))
                SomeButtonsTogether(
                    signUp = { navController.navigate(Home(userId = 1)) },
                    signInWithFacebook = { toast.show() },
                    signInWithGoogle = { toast.show() }
                )
            }
        }
    )
}