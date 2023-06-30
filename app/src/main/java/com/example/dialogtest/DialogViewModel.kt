package com.example.dialogtest

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DialogViewModel constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    val key = "bar"

    val bar: String? = savedStateHandle[key]

    init {
        savedStateHandle.log("DialogViewModel")
    }

    fun setValue(){
        savedStateHandle[key] = "b"
        savedStateHandle.log("DialogViewModel")
    }
}
