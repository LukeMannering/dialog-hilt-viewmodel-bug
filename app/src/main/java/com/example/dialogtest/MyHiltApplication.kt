package com.example.dialogtest

import android.annotation.SuppressLint
import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyHiltApplication : Application() {

    @SuppressLint("LogNotTimber")
    override fun onCreate() {
        super.onCreate()
    }
}