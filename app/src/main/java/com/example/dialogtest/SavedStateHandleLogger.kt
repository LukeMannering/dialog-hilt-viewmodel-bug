package com.example.dialogtest

import android.util.Log
import androidx.lifecycle.SavedStateHandle


fun SavedStateHandle.log(owner: String) {
    Log.d("SavedStateHandleLog",
        buildString {
            append("$owner SavedStateHandle -> ")
            keys().map { key ->
                append("[$key] = ${this@log.get<String?>(key).toString()}")
            }
        }
    )
}