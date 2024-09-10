package com.allaber.test.core.navigation

sealed class Routes(val route: String) {
    data object MainScreen : Routes(route = "mainScreen")
    data object InstructionScreen : Routes(route = "instructionScreen")
    data object AgeScreen : Routes(route = "ageScreen")
    data object TestScreen : Routes(route = "testScreen")
    data object ResultScreen : Routes(route = "resultScreen")
}
