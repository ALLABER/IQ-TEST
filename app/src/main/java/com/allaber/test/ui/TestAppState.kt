package com.allaber.test.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun rememberTestAppState(
    navController: NavHostController = rememberNavController(),
    context: Context = LocalContext.current
) = remember(navController, context) {
    TestAppState(navController, context)
}

class TestAppState(
    val navController: NavHostController,
    private val context: Context
) {

    fun navigateToInstructionScreen() {
        navController.navigate(Routes.InstructionScreen.route)
    }

    fun navigateToAgeScreen() {
        navController.navigate(Routes.AgeScreen.route)
    }

    fun navigateToTestScreen() {
        navController.navigate(Routes.TestScreen.route)
    }

    fun navigateToResultScreen() {
        navController.navigate(Routes.ResultScreen.route)
    }

    fun navigateBack() {
        navController.popBackStack()
    }
}
