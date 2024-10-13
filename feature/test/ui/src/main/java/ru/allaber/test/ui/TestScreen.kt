package ru.allaber.test.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import ru.allaber.components.imagefromassets.ImageFromAssets

@Composable
fun TestScreen(
    navigateToResultScreen: () -> Unit,
    viewModel: TestViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    val questions = viewModel.questions

    Surface(modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                LazyColumn {
                    items(questions.value) { item ->
                        ImageFromAssets(item.imageName)
                    }
                }

                Button(onClick = { navigateToResultScreen() }) {
                    Text(text = "Go to result screen")
                }
            }
        }
    }
}
