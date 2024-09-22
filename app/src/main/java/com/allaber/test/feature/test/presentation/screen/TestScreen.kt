package com.allaber.test.feature.test.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.allaber.test.core.navigation.Routes
import com.allaber.test.feature.test.presentation.viewModel.TestViewModel
import com.allaber.test.ui.components.ImageFromAssets

@Composable
fun TestScreen(navController: NavController, viewModel: TestViewModel = hiltViewModel()) {
    val questions = viewModel.questions

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            LazyColumn {
                items(questions.value) { item ->
                    ImageFromAssets(item.imageName)
                }
            }

            Button(onClick = { navController.navigate(Routes.ResultScreen.route) }) {
                Text(text = "Go to result screen")
            }
        }
    }
}
