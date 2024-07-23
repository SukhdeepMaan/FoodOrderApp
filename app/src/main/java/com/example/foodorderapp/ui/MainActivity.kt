package com.example.foodorderapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.foodorderapp.feature.filters.screens.FilterScreen
import com.example.foodorderapp.feature.referToFriends.screen.ReferToFriendScreen
import com.example.foodorderapp.ui.theme.FoodOrderAppTheme
import com.example.foodorderapp.utils.rememberWindowInfo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            val windowInfo = rememberWindowInfo()
            FoodOrderAppTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    //SignInScreen()
                    //ForgetPasswordStepOne()
                    //ForgetPasswordStepTwo()
                    //SignUpScreen()
                    //OnBoardingScreen()
                    //SingInByNumberScreen()
                    //OtpVerificationScreen()
                    //FindRestaurantScreen()
                    //ProfileSettingsScreen()
                    //ChangePasswordScreen()
                    //DoNotHaveAnyCardScreen(windowInfo = windowInfo)
                    //AddPaymentMethodScreen(windowInfo = windowInfo)
                    //PaymentMethodListScreen()
                    //AddSocialAccountScreen(windowInfo = windowInfo)
                    //ReferToFriendScreen( windowInfo = windowInfo)
                    FilterScreen()
                }
            }
        }
    }
}
