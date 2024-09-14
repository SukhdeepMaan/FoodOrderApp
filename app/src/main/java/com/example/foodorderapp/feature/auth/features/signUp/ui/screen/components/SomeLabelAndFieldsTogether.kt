package com.example.foodorderapp.feature.auth.features.signUp.ui.screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.PanoramaFishEye
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.AppTextField
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.components.PasswordWithTextField
import com.example.foodorderapp.feature.auth.features.signIn.ui.screens.signInEmail.components.checkEmail
import com.example.foodorderapp.feature.auth.features.signIn.ui.viewModel.signInEmail.SignInEvent
import com.example.foodorderapp.feature.auth.features.signUp.ui.viewModel.SignUpEvent
import com.example.foodorderapp.feature.auth.features.signUp.ui.viewModel.SignUpState

@Composable
fun SomeLabelAndFieldsTogether(
    modifier: Modifier = Modifier,
    state: SignUpState,
    onEvent: (SignUpEvent) -> Unit
) {
    val nameFocusRequester = remember { FocusRequester() }
    val emailFocusRequester = remember { FocusRequester() }
    val passwordFocusRequester = remember { FocusRequester() }

    Column(modifier = modifier.padding(top = 32.dp)) {
        // name
        AppTextField(
            modifier = Modifier.focusRequester(nameFocusRequester),
            value = state.name,
            onValueChange = { onEvent(SignUpEvent.NameChanged(it)) },
            label = stringResource(id = R.string.email_address),
            trailingIcon = if (checkEmail(state.name)
            ) Icons.Default.Check else null,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        // email
        AppTextField(
            modifier = Modifier.focusRequester(emailFocusRequester),
            value = state.emailAddress,
            onValueChange = { onEvent(SignUpEvent.EmailChanged(it)) },
            label = stringResource(id = R.string.email_address),
            trailingIcon = if (checkEmail(state.emailAddress)
            ) Icons.Default.Check else null,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        // password
        AppTextField(
            modifier = Modifier.focusRequester(passwordFocusRequester),
            value = state.password,
            onValueChange = { onEvent(SignUpEvent.PasswordChanged(it)) },
            label = stringResource(R.string.password),
            trailingIcon = if (state.isPasswordVisible) Icons.Default.RemoveRedEye else Icons.Default.PanoramaFishEye,
            isShowPassword = state.isPasswordVisible,
            onTrailingIconClick = { onEvent(SignUpEvent.TogglePasswordVisibility) },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Password
            ),
        )
    }
}