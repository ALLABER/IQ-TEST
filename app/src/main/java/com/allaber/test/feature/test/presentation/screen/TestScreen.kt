package com.allaber.test.feature.test.presentation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.allaber.test.core.navigation.Routes

@Composable
fun TestScreen(navController: NavController) {
    Button(onClick = { navController.navigate(Routes.ResultScreen.route) }) {
        Text(text = "Go to result screen")
    }
}
