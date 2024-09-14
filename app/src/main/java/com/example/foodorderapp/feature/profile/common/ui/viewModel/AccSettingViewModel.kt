package com.example.foodorderapp.feature.profile.common.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.feature.profile.domain.NotificationSetting
import com.example.foodorderapp.feature.profile.domain.SettingType
import com.example.foodorderapp.feature.profile.domain.settingList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AccSettingViewModel @Inject constructor() : ViewModel() {
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