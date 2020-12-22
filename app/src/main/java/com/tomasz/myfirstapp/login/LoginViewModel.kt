package com.tomasz.myfirstapp.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hadilq.liveevent.LiveEvent
import com.tomasz.myfirstapp.fireEvent
import com.tomasz.myfirstapp.valueNN

class LoginViewModel : ViewModel() {
    val username = MutableLiveData<String>("")
    val password = MutableLiveData<String>("")

    val onValidLoginEvent = LiveEvent<Unit>()
    val onInvalidLoginEvent = LiveEvent<Unit>()
    val goToSettingsEvent = LiveEvent<Unit>()

    fun onLoginButtonClick() {
        if (username.value == "admin" && password.value == "Admin123" && isPasswordValid()) {
            onValidLoginEvent.fireEvent()
        } else {
            onInvalidLoginEvent.fireEvent()
        }

        goToSettingsEvent.fireEvent()
    }

    fun isPasswordValid(): Boolean {
        if (password.valueNN.length < 8) {
            return false
        }

//        for (c in password.valueNN.toCharArray()) {
//            if (c.isUpperCase()) {
//                return true
//            }
//        }

        return false;
    }

}

