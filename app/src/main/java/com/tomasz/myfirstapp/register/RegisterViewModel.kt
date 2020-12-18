package com.tomasz.myfirstapp.register

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {

    val firstName = MutableLiveData<String>()
    val okButtonClickEvent = MutableLiveData<Unit>()

    fun okButtonClicked(view: View) {
        println("DEBUG: $firstName")

        okButtonClickEvent.postValue(Unit)
    }

}