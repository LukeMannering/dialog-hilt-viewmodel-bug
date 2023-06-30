package com.example.dialogtest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DialogContent(
    onCloseClicked: () -> Unit,
    viewModel: DialogViewModel = viewModel()
) {

    val saveable = rememberSaveable { mutableStateOf("a") }

    val bar by viewModel.bar.collectAsStateWithLifecycle()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentSize()
            .background(Color.White)
            .padding(20.dp)
    ) {

        Text(text = "rememberSaveable = ${saveable.value}")

        Text(text = "SavedStateHandle value = $bar")

        Button(onClick = onCloseClicked) {
            Text(text = "Close")
        }

        Button(onClick = {
            saveable.value = "b"
            viewModel.setValue(saveable.value)
        }) {
            Text(text = "Set Value")
        }
    }
}