package com.allaber.test.feature.age.presentation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.allaber.test.core.navigation.NavigationScreens

@Composable
fun AgeScreen(navController: NavController) {
    Button(onClick = { navController.navigate(NavigationScreens.TestScreen().route) }) {
        Text(text = "Go to test screen")
    }
}
