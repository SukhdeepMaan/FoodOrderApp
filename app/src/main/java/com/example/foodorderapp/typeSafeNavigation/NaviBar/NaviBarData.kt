package com.example.foodorderapp.typeSafeNavigation.NaviBar

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.R
import kotlinx.coroutines.flow.MutableStateFlow


data class NaviItem(
    val id: Int,
    val name: String,
    val icon: Int
)

val naviItems = listOf(
    NaviItem(1, "Home", R.drawable.home),
    NaviItem(2, "Search", R.drawable.search),
    NaviItem(3, "Orders", R.drawable.orders),
    NaviItem(4, "Profile", R.drawable.profile)
)

class NaviViewModel : ViewModel() {
    var selectedIndex = MutableStateFlow(0)
        private set

    fun setSelectedIndex(index: Int) {
        selectedIndex.value = index
    }


}