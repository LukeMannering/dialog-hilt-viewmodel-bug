package com.example.dialogtest

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomescreenViewModel @Inject constructor(
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

