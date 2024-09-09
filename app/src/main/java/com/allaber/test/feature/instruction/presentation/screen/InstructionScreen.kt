package com.allaber.test.feature.instruction.presentation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.allaber.test.core.navigation.NavigationScreens

@Composable
fun InstructionScreen(navController: NavController) {
    Button(onClick = { navController.navigate(NavigationScreens.AgeScreen().route) }) {
        Text(text = "Go to age screen")
    }
}
