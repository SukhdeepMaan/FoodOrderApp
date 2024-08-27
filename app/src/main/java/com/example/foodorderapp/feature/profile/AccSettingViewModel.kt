package com.example.foodorderapp.feature.profile

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.feature.profile.data.NotificationSetting
import com.example.foodorderapp.feature.profile.data.SettingType
import com.example.foodorderapp.feature.profile.data.settingList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class SelectedItem (
    val id: Int,
    val title: String,
)

class AccSettingViewModel : ViewModel() {
    private val _settingList = MutableStateFlow<List<Pair<String, List<Any>>>>(settingList)
    var settingsList = _settingList.asStateFlow()
        private set

    fun updatePushNotification(value: Boolean, id: Int){
        val updatedList = _settingList.value.map { (title, list) ->
            if (title == SettingType.NOTIFICATION.naming) {
                // Map list
                val updatedNotificationList = list.map { item ->
                    if (item is NotificationSetting && item.id == id ) {
                        item.copy(isEnabled = value)
                    }
                    else {
                        item
                    }
                }
                title to updatedNotificationList
            } else {
                title to list
            }
        }
        _settingList.value = updatedList
    }
}