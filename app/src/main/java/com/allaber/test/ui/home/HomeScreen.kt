package com.allaber.test.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.window.core.layout.WindowSizeClass
import com.allaber.test.R

@Composable
fun HomeScreen(
    windowSizeClass: WindowSizeClass,
    navigateToInstructionScreen: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(modifier.fillMaxSize()) {
        Box {
            TextButton(
                onClick = { navigateToInstructionScreen() },
                modifier = Modifier.align(Alignment.Center)
            ) {
                Text(text = stringResource(id = R.string.start_testing))
            }
        }
    }
}
