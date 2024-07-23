package com.example.foodorderapp.feature.signUp.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.feature.signIn.screens.components.PasswordWithTextField

@Composable
fun SomeLabelAndFieldsTogether(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    val nameFocusRequester = remember { FocusRequester() }
    var emailAddress by remember { mutableStateOf("") }
    val emailFocusRequester = remember { FocusRequester() }
    var password by remember { mutableStateOf("") }
    val passwordFocusRequester = remember { FocusRequester() }
    var checkIcon by remember { mutableStateOf(true) }
    val focusManager = LocalFocusManager.current

   /* LaunchedEffect(key1 = Unit) {
        nameFocusRequester.requestFocus()
    }*/
    Column(modifier = modifier.padding(top = 32.dp)) {
        EmailOrNameTextWithInput(
            modifier = Modifier.focusRequester(nameFocusRequester),
            value = name,
            label = R.string.full_name,
            showIcon = checkIcon,
            onValueChange = { name = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        // email
        EmailOrNameTextWithInput(
            modifier = Modifier.focusRequester(emailFocusRequester),
            value = emailAddress,
            showIcon = checkIcon,
            onValueChange = { emailAddress = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        // password
        PasswordWithTextField(
            modifier = Modifier
                .padding(top = 16.dp)
                .focusRequester(passwordFocusRequester),
            value = password,
            onValueChange = { password = it }
        )
    }
}