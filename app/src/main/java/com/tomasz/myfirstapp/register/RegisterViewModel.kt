package com.tomasz.myfirstapp.register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hadilq.liveevent.LiveEvent
import com.tomasz.myfirstapp.fireEvent

class RegisterViewModel : ViewModel() {

    val firstName = MutableLiveData<String>()
    val okButtonClickEvent = LiveEvent<Unit>()

    fun okButtonClicked() {
        okButtonClickEvent.fireEvent()
    }
}