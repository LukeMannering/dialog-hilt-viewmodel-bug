package com.example.dialogtest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun DialogContent(
    onCloseClicked: () -> Unit,
    viewModel: DialogViewModel = hiltViewModel()
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentSize()
            .background(Color.White)
            .padding(20.dp)
    ) {

        Button(onClick = onCloseClicked) {
            Text(text = "Close")
        }

        Button(onClick = {
            viewModel.setValue()
        }) {
            Text(text = "Set Value")
        }
    }
}