package com.example.dialogtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import com.example.dialogtest.ui.theme.DialogtestTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            val appNavController = rememberNavController()

            DialogtestTheme {

                NavHost(
                    navController = appNavController,
                    startDestination = "homescreen",
                    modifier = Modifier.fillMaxSize()
                ) {

                    // Add normal screen destination
                    composable(
                        route ="homescreen"
                    ) {
                        Homescreen(
                            onButtonClicked = {
                                appNavController.navigate("dialog")
                            }
                        )
                    }

                    // Add dialog destination
                    dialog(
                        route = "dialog",
                        dialogProperties = DialogProperties(usePlatformDefaultWidth = false)
                    ) {

                        val dialogNavController = rememberNavController()

                        NavHost(
                            navController = dialogNavController,
                            startDestination = "dialogContent"
                        ) {

                            composable(
                                route = "dialogContent"
                            ){
                                DialogContent(
                                    onCloseClicked = { appNavController.popBackStack() }
                                )
                            }
                        }
                    }
                }

            }
        }
    }
}
