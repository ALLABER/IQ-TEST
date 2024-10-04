package ru.allaber.domain.usecase

import javax.inject.Inject
import ru.allaber.domain.model.Question
import ru.allaber.domain.repository.TestRepository

class GetAllQuestionsUseCase @Inject constructor(
    private val repository: TestRepository
) {
    suspend operator fun invoke(): List<Question> {
        return repository.getAllQuestions()
    }
}
