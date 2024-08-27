package com.example.foodorderapp.feature.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.foodorderapp.feature.addSocialAccount.screens.screenAddSocialAccount.AddSocialAccountScreen
import com.example.foodorderapp.feature.profile.profileSettings.profileInformation.ProfileInformation
import com.example.foodorderapp.feature.profile.profileSettings.changePassword.ChangePasswordScreen
import com.example.foodorderapp.feature.profile.profileSettings.payment.paymentNavGraph
import com.example.foodorderapp.feature.profile.screen.ProfileSettingScreen
import com.example.foodorderapp.feature.profile.profileSettings.referToFriends.screen.ReferToFriendScreen
import com.example.foodorderapp.utils.WindowInfo
import kotlinx.serialization.Serializable

@Serializable
object Profile {
    @Serializable
    object ProfileSetting
    @Serializable
    object ProfileInformation
    @Serializable
    object ChangePassword
    @Serializable
    object PaymentMethod
    @Serializable
    object BillingAddress
    @Serializable
    object Locations
    @Serializable
    object AddSocialAccount
    @Serializable
    object ReferToFriends

    // more
    @Serializable
    object RateUs
    @Serializable
    object FAQ
    @Serializable
    object Logout

}

fun NavGraphBuilder.profileNavGraph(navController: NavHostController, windowInfo: WindowInfo) {
    navigation<Profile>(startDestination = Profile.ProfileSetting) {

        composable<Profile.ProfileSetting> {
            ProfileSettingScreen(navController = navController)
        }
        composable<Profile.ProfileInformation> {
            ProfileInformation(navController = navController)
        }
        composable<Profile.ChangePassword> {
            ChangePasswordScreen(navController = navController)
        }
        paymentNavGraph(navController = navController, windowInfo = windowInfo)

        composable<Profile.BillingAddress> {

        }

        composable<Profile.Locations> {

        }
        composable<Profile.AddSocialAccount> {
            AddSocialAccountScreen(navController = navController, windowInfo = windowInfo)
        }
        composable<Profile.ReferToFriends> {
            ReferToFriendScreen( navController = navController, windowInfo = windowInfo)
        }
        composable<Profile.RateUs> {

        }
        composable<Profile.FAQ> {
        }
        composable<Profile.Logout> {

        }
    }
}