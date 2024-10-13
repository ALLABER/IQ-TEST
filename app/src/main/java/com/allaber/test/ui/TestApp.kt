package com.allaber.test.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.allaber.ResultRoute
import ru.allaber.ageentry.AgeEntryRoute
import ru.allaber.ageentry.ui.AgeEntryScreen
import ru.allaber.home.HomeRoute
import ru.allaber.home.ui.HomeScreen
import ru.allaber.instructions.InstructionsRoute
import ru.allaber.instructions.ui.InstructionScreen
import ru.allaber.result.ui.ResultScreen
import ru.allaber.test.TestRoute
import ru.allaber.test.ui.TestScreen

@Composable
fun TestApp(appState: TestAppState = rememberTestAppState()) {
    NavHost(
        navController = appState.navController,
        startDestination = HomeRoute.toString()
    ) {
        composable(HomeRoute.toString()) {
            HomeScreen(
                navigateToInstructionScreen = {
                    appState.navigateToInstructionScreen()
                }
            )
        }

        composable(
            InstructionsRoute.toString()
        ) {
            InstructionScreen(
                navigateToAgeScreen = {
                    appState.navigateToAgeScreen()
                }
            )
        }

        composable(
            AgeEntryRoute.toString()
        ) {
            AgeEntryScreen(
                navigateToTestScreen = {
                    appState.navigateToTestScreen()
                }
            )
        }

        composable(
            TestRoute.toString()
        ) {
            TestScreen(
                navigateToResultScreen = {
                    appState.navigateToResultScreen()
                }
            )
        }

        composable(
            ResultRoute.toString()
        ) {
            ResultScreen()
        }
    }
}
