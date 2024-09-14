package com.example.foodorderapp.feature.profile.common.navigation

import androidx.navigation.NavGraphBuilder
import com.example.foodorderapp.feature.profile.profileUi.navigation.profileSettingNavGraph
import com.example.foodorderapp.feature.profile.subFeatures.addSocialAccount.ui.navGraph.addSocialAccountNavGraph
import com.example.foodorderapp.feature.profile.subFeatures.changePassword.ui.navGraph.changePasswordNavGraph
import com.example.foodorderapp.feature.profile.subFeatures.payment.ui.navGraph.paymentNavGraph
import com.example.foodorderapp.feature.profile.subFeatures.profileInformation.ui.navGraph.profileInformationNavGraph
import com.example.foodorderapp.feature.profile.subFeatures.referToFriends.ui.navGraph.referToFriendsNavGraph
import com.example.foodorderapp.navigation.Route
import kotlinx.serialization.Serializable


fun NavGraphBuilder.profileNavGraph() {

    profileSettingNavGraph()
    profileInformationNavGraph()
    changePasswordNavGraph()
    paymentNavGraph()
    addSocialAccountNavGraph()
    referToFriendsNavGraph()


/*
    composable<Profile.ProfileSetting> {
        ProfileSettingScreen()
    }
    composable<Profile.ProfileInformation> {
        ProfileInformation()
    }
    composable<Profile.ChangePassword> {
        ChangePasswordScreen()
    }
    paymentNavGraph()

    composable<Profile.BillingAddress> {

    }

    composable<Profile.Locations> {

    }
    composable<Profile.AddSocialAccount> {
        AddSocialAccountScreen()
    }
    composable<Profile.ReferToFriends> {
        ReferToFriendScreen()
    }
    composable<Profile.RateUs> {

    }
    composable<Profile.FAQ> {
    }
    composable<Profile.Logout> {

    }*/

}


@Serializable
sealed class Profile : Route() {
    @Serializable
    data object ProfileSetting : Profile()

    @Serializable
    data object ProfileInformation : Profile()

    @Serializable
    data object ChangePassword : Profile()

    @Serializable
    data object PaymentMethod : Profile()

    @Serializable
    data object BillingAddress : Profile()

    @Serializable
    data object Locations : Profile()

    @Serializable
    data object AddSocialAccount : Profile()

    @Serializable
    data object ReferToFriends : Profile()

    // more
    @Serializable
    data object RateUs : Profile()

    @Serializable
    data object FAQ : Profile()

    @Serializable
    data object Logout : Profile()

}