package com.example.dialogtest

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DialogViewModel constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    private val key = "bar"

    val bar = savedStateHandle.getStateFlow<String?>(key, savedStateHandle[key])

    init {
        savedStateHandle.log("DialogViewModel")
    }

    fun setValue(value: String){
        savedStateHandle[key] = value
        savedStateHandle.log("DialogViewModel")
    }
}
