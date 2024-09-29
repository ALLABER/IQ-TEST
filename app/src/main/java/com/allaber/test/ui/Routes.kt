package com.allaber.test.ui

sealed class Routes(val route: String) {
    data object HomeScreen : Routes(route = "homeScreen")
    data object InstructionScreen : Routes(route = "instructionScreen")
    data object AgeScreen : Routes(route = "ageScreen")
    data object TestScreen : Routes(route = "testScreen")
    data object ResultScreen : Routes(route = "resultScreen")
}
