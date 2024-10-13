package ru.allaber.ageentry.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AgeEntryScreen(navigateToTestScreen: () -> Unit, modifier: Modifier = Modifier) {
    Surface(modifier.fillMaxSize()) {
        Box {
            Button(
                onClick = { navigateToTestScreen() },
                modifier = Modifier.align(Alignment.Center)
            ) {
                Text(text = "Go to test screen")
            }
        }
    }
}
