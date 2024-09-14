package com.example.foodorderapp.feature.onBoarding.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.foodorderapp.feature.onBoarding.domain.repository.OnBoardingData
import com.example.foodorderapp.feature.onBoarding.domain.repository.listOfOnBoardingData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor() : ViewModel(){
    private val _onBoardingList = MutableStateFlow<List<OnBoardingData>>(emptyList())
    var onBoardingList : StateFlow<List<OnBoardingData>> = _onBoardingList
        private set

    init {
        _onBoardingList.value = listOfOnBoardingData
    }
}