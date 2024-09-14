package com.example.foodorderapp.navigation.topBar

import com.example.foodorderapp.feature.auth.common.navigation.Auth
import com.example.foodorderapp.feature.profile.common.navigation.Profile


// All the screens that have common top bar
val commonTopBarScreen = listOf(
    Auth.SignIn::class.qualifiedName,
    Auth.SignUp::class.qualifiedName,
    Auth.ForgetPassword.ForgetPasswordStepOne::class.qualifiedName,
    Auth.ForgetPassword.ForgetPasswordStepTwo::class.qualifiedName,


    Profile.ProfileInformation::class.qualifiedName,
    Profile.ChangePassword::class.qualifiedName,
    Profile.PaymentMethod::class.qualifiedName,
   /* PaymentMethod.DoNotHaveAnyCard::class.qualifiedName,
    PaymentMethod.AddPaymentMethod::class.qualifiedName,
    PaymentMethod.PaymentMethodList::class.qualifiedName,*/
)

// All the titles of the screens that have common top bar
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

        Auth.ForgetPassword.ForgetPasswordStepOne::class.qualifiedName,
        Auth.ForgetPassword.ForgetPasswordStepTwo::class.qualifiedName
            -> TopTitle.FORGOT_PASSWORD.title

        Profile.ProfileInformation::class.qualifiedName,
        Profile.ChangePassword::class.qualifiedName,
            -> TopTitle.PROFILE_SETTINGS.title

        Profile.PaymentMethod::class.qualifiedName,
       /* PaymentMethod.DoNotHaveAnyCard::class.qualifiedName,
        PaymentMethod.AddPaymentMethod::class.qualifiedName,
        PaymentMethod.PaymentMethodList::class.qualifiedName*/
            -> TopTitle.PAYMENT_METHODS.title


        else -> {
            ""
        }
    }
}