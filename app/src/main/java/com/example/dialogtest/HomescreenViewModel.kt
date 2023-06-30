package com.example.dialogtest

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class HomescreenViewModel constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    private val key = "foo"

    val foo = savedStateHandle.getStateFlow<String?>(key, savedStateHandle[key])

    init {
        savedStateHandle.log("HomescreenViewModel")
    }

    fun setValue(value: String){
        savedStateHandle[key] = value
        savedStateHandle.log("HomescreenViewModel")
    }
}

