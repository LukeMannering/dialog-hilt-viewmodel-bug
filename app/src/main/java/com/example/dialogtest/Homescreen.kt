package com.example.dialogtest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun Homescreen(
    onButtonClicked: () -> Unit,
    viewModel: HomescreenViewModel = viewModel()
) {

    val saveable = rememberSaveable { mutableStateOf("a") }

    val foo by viewModel.foo.collectAsStateWithLifecycle()

    // A surface container using the 'background' color from the theme
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text = "rememberSaveable = ${saveable.value}")

        Text(text = "SavedStateHandle value = $foo")

        Button(
            onClick = onButtonClicked,
            modifier = Modifier.wrapContentSize()
        ) {
            Text(text = "Open Dialog")
        }

        Button(onClick = {
            saveable.value = "b"
            viewModel.setValue(saveable.value)
        }) {
            Text(text = "Set Value")
        }
    }
}