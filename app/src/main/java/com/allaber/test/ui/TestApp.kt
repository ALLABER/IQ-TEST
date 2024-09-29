package com.allaber.test.ui

import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.allaber.test.ui.age.AgeScreen
import com.allaber.test.ui.home.HomeScreen
import com.allaber.test.ui.instruction.InstructionScreen
import com.allaber.test.ui.result.ResultScreen
import com.allaber.test.ui.test.TestScreen

@Composable
fun TestApp(appState: TestAppState = rememberTestAppState()) {
    val adaptiveInfo = currentWindowAdaptiveInfo()

    NavHost(
        navController = appState.navController,
        startDestination = Routes.HomeScreen.route
    ) {
        composable(Routes.HomeScreen.route) {
            HomeScreen(
                windowSizeClass = adaptiveInfo.windowSizeClass,
                navigateToInstructionScreen = {
                    appState.navigateToInstructionScreen()
                }
            )
        }

        composable(
            Routes.InstructionScreen.route
        ) {
            InstructionScreen(
                windowSizeClass = adaptiveInfo.windowSizeClass,
                navigateToAgeScreen = {
                    appState.navigateToAgeScreen()
                }
            )
        }

        composable(
            Routes.AgeScreen.route
        ) {
            AgeScreen(
                navigateToTestScreen = {
                    appState.navigateToTestScreen()
                }
            )
        }

        composable(
            Routes.TestScreen.route
        ) {
            TestScreen(
                windowSizeClass = adaptiveInfo.windowSizeClass,
                navigateToResultScreen = {
                    appState.navigateToResultScreen()
                }
            )
        }

        composable(
            Routes.ResultScreen.route
        ) {
            ResultScreen(
                windowSizeClass = adaptiveInfo.windowSizeClass
            )
        }
    }
}
