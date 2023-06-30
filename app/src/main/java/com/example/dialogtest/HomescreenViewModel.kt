package com.example.dialogtest

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class HomescreenViewModel constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    val key = "foo"

    val foo: String? = savedStateHandle[key]

    init {
        savedStateHandle.log("HomescreenViewModel")
    }

    fun setValue(){
        savedStateHandle[key] = "a"
        savedStateHandle.log("HomescreenViewModel")
    }
}

