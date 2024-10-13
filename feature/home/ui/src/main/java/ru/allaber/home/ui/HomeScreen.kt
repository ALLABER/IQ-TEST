package ru.allaber.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import ru.allaber.localization.R.string as Localization

@Composable
fun HomeScreen(navigateToInstructionScreen: () -> Unit, modifier: Modifier = Modifier) {
    Surface(modifier.fillMaxSize()) {
        Box {
            TextButton(
                onClick = { navigateToInstructionScreen() },
                modifier = Modifier.align(Alignment.Center)
            ) {
                Text(text = stringResource(id = Localization.start_testing))
            }
        }
    }
}
