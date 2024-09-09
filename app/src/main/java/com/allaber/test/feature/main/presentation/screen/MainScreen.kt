package com.allaber.test.feature.main.presentation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.allaber.test.core.navigation.NavigationScreens

@Composable
fun MainScreen(navController: NavController) {
    Button(onClick = { navController.navigate(NavigationScreens.InstructionScreen().route) }) {
        Text(text = "Go to instruction screen")
    }
}
