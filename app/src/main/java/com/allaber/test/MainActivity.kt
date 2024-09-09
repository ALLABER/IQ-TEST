package com.allaber.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.allaber.test.core.navigation.NavigationScreens
import com.allaber.test.feature.age.presentation.screen.AgeScreen
import com.allaber.test.feature.instruction.presentation.screen.InstructionScreen
import com.allaber.test.feature.main.presentation.screen.MainScreen
import com.allaber.test.feature.result.presentation.screen.ResultScreen
import com.allaber.test.feature.test.presentation.screen.TestScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Application()
        }
    }
}

@Composable
fun Application() {
    val navController = rememberNavController()
    Scaffold(
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                NavHost(
                    navController = navController,
                    startDestination = NavigationScreens.MainScreen().route
                ) {
                    composable(
                        NavigationScreens.MainScreen().route
                    ) { MainScreen(navController) }

                    composable(
                        NavigationScreens.InstructionScreen().route
                    ) { InstructionScreen(navController) }

                    composable(
                        NavigationScreens.AgeScreen().route
                    ) { AgeScreen(navController) }

                    composable(
                        NavigationScreens.TestScreen().route
                    ) { TestScreen(navController) }

                    composable(
                        NavigationScreens.ResultScreen().route
                    ) { ResultScreen(navController) }
                }
            }
        }
    )
}
