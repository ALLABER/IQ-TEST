package com.allaber.test.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.allaber.ResultRoute
import ru.allaber.ageentry.AgeEntryRoute
import ru.allaber.instructions.InstructionsRoute
import ru.allaber.test.TestRoute

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
        navController.navigate(InstructionsRoute.toString())
    }

    fun navigateToAgeScreen() {
        navController.navigate(AgeEntryRoute.toString())
    }

    fun navigateToTestScreen() {
        navController.navigate(TestRoute.toString())
    }

    fun navigateToResultScreen() {
        navController.navigate(ResultRoute.toString())
    }

    fun navigateBack() {
        navController.popBackStack()
    }
}
