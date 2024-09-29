package com.allaber.test.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.allaber.test.ui.age.AgeScreen
import com.allaber.test.ui.home.HomeScreen
import com.allaber.test.ui.instruction.InstructionScreen
import com.allaber.test.ui.result.ResultScreen
import com.allaber.test.ui.test.TestScreen

@Composable
fun TestApp() {
    val navController = rememberNavController()
    Scaffold(
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                NavHost(
                    navController = navController,
                    startDestination = Routes.HomeScreen.route
                ) {
                    composable(
                        Routes.HomeScreen.route
                    ) { HomeScreen(navController) }

                    composable(
                        Routes.InstructionScreen.route
                    ) { InstructionScreen(navController) }

                    composable(
                        Routes.AgeScreen.route
                    ) { AgeScreen(navController) }

                    composable(
                        Routes.TestScreen.route
                    ) { TestScreen(navController) }

                    composable(
                        Routes.ResultScreen.route
                    ) { ResultScreen(navController) }
                }
            }
        }
    )
}
