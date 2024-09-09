package com.allaber.test.feature.instruction.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.allaber.test.R
import com.allaber.test.core.navigation.NavigationScreens

@Composable
fun InstructionScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Column {
            Text(text = stringResource(id = R.string.instructions))
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = stringResource(id = R.string.test_description))
        }

        Button(
            onClick = { navController.navigate(NavigationScreens.AgeScreen().route) },
            modifier = Modifier
                .align(Alignment.BottomEnd)
        ) {
            Text(text = stringResource(id = R.string.next))
        }
    }
}
