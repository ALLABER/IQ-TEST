package com.allaber.test.ui.home

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
import com.allaber.test.ui.Routes

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        TextButton(
            onClick = { navController.navigate(Routes.InstructionScreen.route) },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = stringResource(id = R.string.start_testing))
        }
    }
}
