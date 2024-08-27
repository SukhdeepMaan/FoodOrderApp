package com.example.foodorderapp.utils

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.foodorderapp.components.AppHeader
import com.example.foodorderapp.feature.auth.navigation.Auth
import com.example.foodorderapp.feature.home.screens.homeScreen.components.HomeTopBar
import com.example.foodorderapp.feature.profile.Profile
import com.example.foodorderapp.feature.profile.profileSettings.payment.PaymentMethod
import com.example.foodorderapp.typeSafeNavigation.Filter
import com.example.foodorderapp.typeSafeNavigation.Home

@Composable
fun TopBarManager(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    when (val currentRoute = navBackStackEntry?.destination?.route?.substringBefore('?')) {
        in commonTopBarScreen -> {
            AppHeader(
                modifier = modifier.background(color = Color.Gray),
                title = getTitle(currentRoute),
            ) { navController.popBackStack() }
        }
        Home::class.qualifiedName -> {
            HomeTopBar(navController = navController)
        }

        else -> {}
    }
    // TODO  there is a common top bar named AppHeader that will be used for multiple screens and everything will be based on navController destination
    //HomeTopBar(navController = navController)
}

val commonTopBarScreen = listOf(
    Auth.SignIn::class.qualifiedName,
    Auth.SignUp::class.qualifiedName,
    Auth.ForgetPasswordSetOne::class.qualifiedName,
    Auth.ForgetPasswordSetTwo::class.qualifiedName,
    Profile.ProfileInformation::class.qualifiedName,
    Profile.ChangePassword::class.qualifiedName,
    Profile.PaymentMethod::class.qualifiedName,
    PaymentMethod.DoNotHaveAnyCard::class.qualifiedName,
    PaymentMethod.AddPaymentMethod::class.qualifiedName,
    PaymentMethod.PaymentMethodList::class.qualifiedName,
    Filter::class.qualifiedName,
)

enum class TopTitle(val title: String) {
    SIGN_IN("Sign In"),
    SIGN_UP("Sign Up"),
    FORGOT_PASSWORD("Forgot Password"),
    FEATURED_PARTNER("Featured Partner"),
    LOGIN_TO_TAMAMG_FOOD_SERVERS("Login to TamAMG Food Servers"),
    FILTERS("Filters"),
    PROFILE_SETTINGS("Profile Settings"),
    PAYMENT_METHODS("Payment Methods"),
    ADD_SOCIAL_ACCOUNTS("Add Social Accounts"),
    REFER_TO_FRIENDS("Refer to Friends"),
    YOUR_ORDERS("Your Orders"),
    BURGERS("Burgers"),
    BROWSER_FOODS("Browser Foods")
}

fun getTitle(currentRoute: String?): String {
    return when (currentRoute) {
        Auth.SignIn::class.qualifiedName -> TopTitle.SIGN_IN.title
        Auth.SignUp::class.qualifiedName -> TopTitle.SIGN_UP.title
        Auth.ForgetPasswordSetOne::class.qualifiedName -> TopTitle.FORGOT_PASSWORD.title
        Auth.ForgetPasswordSetTwo::class.qualifiedName -> TopTitle.FORGOT_PASSWORD.title

        Profile.ProfileInformation::class.qualifiedName,
        Profile.ChangePassword::class.qualifiedName,
        -> TopTitle.PROFILE_SETTINGS.title

        Profile.PaymentMethod::class.qualifiedName,
        PaymentMethod.DoNotHaveAnyCard::class.qualifiedName,
        PaymentMethod.AddPaymentMethod::class.qualifiedName,
        PaymentMethod.PaymentMethodList::class.qualifiedName
        -> TopTitle.PAYMENT_METHODS.title

        Filter::class.qualifiedName -> TopTitle.FILTERS.title

        else -> {
            ""
        }
    }
}