package com.example.foodorderapp.feature.onBoarding.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.foodorderapp.R

data class OnBoardingData(
    val id: Int,
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val desc: Int,
)

val listOfOnBoardingData = listOf(
    OnBoardingData(
        id = 1,
        image = R.drawable.first_img,
        title = R.string.welcome,
        desc = R.string.it_s_a_pleasure_to_meet_you_we_are_excited_that_you_re_here_so_let_s_get_started
    ),
    OnBoardingData(
        id = 2,
        image = R.drawable.second_img,
        title = R.string.all_your_favorites,
        desc = R.string.order_from_the_best_local_restaurants_with_easy_on_demand_delivery
    ),
    OnBoardingData(
        id = 3,
        image = R.drawable.thirdimg,
        title = R.string.free_delivery_offers,
        desc = R.string.free_delivery_for_new_customers_via_apple_pay_and_others_payment_methods
    ),
    OnBoardingData(
        id = 4,
        image = R.drawable.fourth_img,
        title = R.string.choose_your_food,
        desc = R.string.easily_find_your_type_of_food_craving_and_you_ll_get_delivery_in_wide_range
    ),
)


