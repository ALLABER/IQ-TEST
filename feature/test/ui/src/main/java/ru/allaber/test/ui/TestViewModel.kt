package ru.allaber.test.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch
import ru.allaber.domain.model.Question
import ru.allaber.domain.usecase.GetAllQuestionsUseCase

@HiltViewModel
class TestViewModel @Inject constructor(
    private val getAllQuestionsUseCase: GetAllQuestionsUseCase
) : ViewModel() {
    val questions = mutableStateOf(emptyList<Question>())

    init {
        getAllQuestions()
    }

    private fun getAllQuestions() {
        viewModelScope.launch {
            questions.value = getAllQuestionsUseCase()
        }
    }
}
