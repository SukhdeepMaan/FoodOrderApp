package com.example.foodorderapp.feature.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.foodorderapp.R
import com.example.foodorderapp.components.LabelAndTextField2

@Composable
fun AllTextFields(
    modifier: Modifier = Modifier,
    profileData: ProfileData,
    onValueChange: (ProfileData) -> Unit,
) {
    var changePassword by remember { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }


    Column(modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(36.dp)) {
        LabelAndTextField2(
            labelText = stringResource(id = R.string.full_name),
            value = profileData.name,
        ) {
            onValueChange(profileData.copy(name = it))
        }
        LabelAndTextField2(
            labelText = stringResource(id = R.string.email_address),
            value = profileData.emailAddress,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        ) {
            onValueChange(profileData.copy(emailAddress = it))
        }
        LabelAndTextField2(
            labelText = stringResource(id = R.string.phone_number),
            value = profileData.phoneNumber,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            )
        ) {
           onValueChange(profileData.copy(phoneNumber = it))
        }
        LabelAndTextField2(
            labelText = stringResource(id = R.string.password),
            value = profileData.password,
            enabled = changePassword,
            showInputValue = false,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            focusRequester = focusRequester,
            trailingIcon = {
                TextButton(onClick = {
                    changePassword = !changePassword
                    if (changePassword) focusRequester.requestFocus()
                }) {
                    ChangeTextButtonText()
                }
            }
        ) {
            onValueChange(profileData.copy(password = it))
        }
    }
}