package com.tomasz.myfirstapp

import com.hadilq.liveevent.LiveEvent

fun LiveEvent<Unit>.fireEvent() {
    value = Unit
}
