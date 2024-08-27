package com.example.foodorderapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.foodorderapp.components.NewCustomScaffold
import com.example.foodorderapp.feature.home.screens.homeScreen.HomeScreen
import com.example.foodorderapp.ui.theme.FoodOrderAppTheme
import com.example.foodorderapp.utils.NaviBar.NavigationBarManager
import com.example.foodorderapp.utils.TopBarManager
import com.example.foodorderapp.utils.rememberWindowInfo
import com.example.foodorderapp.typeSafeNavigation.AppNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val windowInfo = rememberWindowInfo()
            FoodOrderAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NewCustomScaffold(
                        topBar = {
                            TopBarManager(
                                navController = navController,
                            )
                        },
                        navigationBar = {
                            // TODO crate a list of screens that need a navigationBar otherwise pass null if you want to check condition inside the NavigationBarManager that is also possible but null value will have to be passed by callback function
                            NavigationBarManager(
                                navController = navController,
                                windowInfo = windowInfo
                            )
                        }

                    ) {
                        AppNavGraph(navController = navController, windowInfo = windowInfo)
                        //HomeScreen(navController = navController)
                    }
                }
            }
        }
    }
}


/*  //SignInScreen()
                    //ForgetPasswordStepOne()
                    //ForgetPasswordStepTwo()
                  //  SignUpScreen()
                   // OnBoardingScreen()
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
                    //FilterScreen()
                    */

/*//SearchScreen(windowInfo = windowInfo)
                     //FeaturedPartnersScreen(windowInfo = windowInfo)
                     //HomeScreen()
                     //AccountSettingScreen()*/