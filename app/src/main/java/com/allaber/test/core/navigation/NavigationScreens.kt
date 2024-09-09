package com.allaber.test.core.navigation

sealed class NavigationScreens(open val route: String) {
    data class MainScreen(
        override val route: String = "mainScreen"
    ) : NavigationScreens(route = route)

    data class InstructionScreen(
        override val route: String = "instructionScreen"
    ) : NavigationScreens(route = route)

    data class AgeScreen(
        override val route: String = "ageScreen"
    ) : NavigationScreens(route = route)

    data class TestScreen(
        override val route: String = "testScreen"
    ) : NavigationScreens(route = route)

    data class ResultScreen(
        override val route: String = "resultScreen"
    ) : NavigationScreens(route = route)
}
