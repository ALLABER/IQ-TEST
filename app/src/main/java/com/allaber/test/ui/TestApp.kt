package com.allaber.test.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.allaber.ageentry.ui.AgeEntryScreen
import ru.allaber.home.ui.HomeScreen
import ru.allaber.instructions.ui.InstructionScreen
import ru.allaber.result.ui.ResultScreen
import ru.allaber.test.ui.TestScreen

@Composable
fun TestApp(appState: TestAppState = rememberTestAppState()) {
    NavHost(
        navController = appState.navController,
        startDestination = Routes.HomeScreen.route
    ) {
        composable(Routes.HomeScreen.route) {
            HomeScreen(
                navigateToInstructionScreen = {
                    appState.navigateToInstructionScreen()
                }
            )
        }

        composable(
            Routes.InstructionScreen.route
        ) {
            InstructionScreen(
                navigateToAgeScreen = {
                    appState.navigateToAgeScreen()
                }
            )
        }

        composable(
            Routes.AgeScreen.route
        ) {
            AgeEntryScreen(
                navigateToTestScreen = {
                    appState.navigateToTestScreen()
                }
            )
        }

        composable(
            Routes.TestScreen.route
        ) {
            TestScreen(
                navigateToResultScreen = {
                    appState.navigateToResultScreen()
                }
            )
        }

        composable(
            Routes.ResultScreen.route
        ) {
            ResultScreen()
        }
    }
}
