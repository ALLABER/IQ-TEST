package com.allaber.test.ui.age

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AgeScreen(navigateToTestScreen: () -> Unit) {
    Button(onClick = { navigateToTestScreen() }) {
        Text(text = "Go to test screen")
    }
}
