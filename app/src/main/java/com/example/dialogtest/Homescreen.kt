package com.example.dialogtest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun Homescreen(
    onButtonClicked: () -> Unit,
    viewModel: HomescreenViewModel = hiltViewModel()
) {
    // A surface container using the 'background' color from the theme
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = onButtonClicked,
            modifier = Modifier.wrapContentSize()
        ) {
            Text(text = "Open Dialog")
        }

        Button(onClick = {
            viewModel.setValue()
        }) {
            Text(text = "Set Value")
        }
    }
}