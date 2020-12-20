package com.tomasz.myfirstapp

import androidx.lifecycle.LiveData
import com.hadilq.liveevent.LiveEvent

fun LiveEvent<Unit>.fireEvent() {
    value = Unit
}

inline val <T> LiveData<T>.valueNN
    get() = value!!