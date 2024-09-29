package com.allaber.test.ui.test

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.allaber.test.core.data.database.Database
import com.allaber.test.core.data.model.QuestionModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class TestViewModel @Inject constructor(
    private val database: Database
) : ViewModel() {
    val questions = mutableStateOf(emptyList<QuestionModel>())

    init {
        getAllQuestions()
    }

    private fun getAllQuestions() {
        viewModelScope.launch {
            questions.value = database.questionDao().getAllQuestions()
        }
    }
}
