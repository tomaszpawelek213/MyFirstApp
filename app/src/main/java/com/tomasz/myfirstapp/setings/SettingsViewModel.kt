package com.tomasz.myfirstapp.setings

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hadilq.liveevent.LiveEvent
import com.tomasz.myfirstapp.R

class SettingsViewModel : ViewModel() {

    val isLightThemeSelected = MutableLiveData<Boolean>(true)
    val selectedThemeLabel = MutableLiveData<String>()
    val selectedSwitchColor = MutableLiveData<Boolean>(false)
    val switchColorText = MutableLiveData<String>()


}