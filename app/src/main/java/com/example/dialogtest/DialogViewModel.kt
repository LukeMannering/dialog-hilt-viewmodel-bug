package com.example.dialogtest

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DialogViewModel @Inject constructor(
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
