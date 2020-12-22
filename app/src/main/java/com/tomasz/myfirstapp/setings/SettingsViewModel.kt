package com.tomasz.myfirstapp.setings

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    val isLightThemeSelected = MutableLiveData<Boolean>(true)
    val selectedThemeLabel = MutableLiveData<String>()
}