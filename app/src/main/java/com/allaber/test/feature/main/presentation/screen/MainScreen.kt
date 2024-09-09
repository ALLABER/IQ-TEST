package com.allaber.test.feature.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.allaber.test.R
import com.allaber.test.core.navigation.NavigationScreens

@Composable
fun MainScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        TextButton(
            onClick = { navController.navigate(NavigationScreens.InstructionScreen().route) },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = stringResource(id = R.string.start_testing))
        }
    }
}
