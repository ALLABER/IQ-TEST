package ru.allaber.domain.repository

import ru.allaber.domain.model.Question

interface TestRepository {
    suspend fun getAllQuestions(): List<Question>
}
