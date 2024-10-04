package ru.allaber.repository

import javax.inject.Inject
import ru.allaber.database.QuestionDao
import ru.allaber.domain.model.Question
import ru.allaber.domain.repository.TestRepository
import ru.allaber.mapper.QuestionModelMapper

class TestRepositoryImpl @Inject constructor(
    private val questionDao: QuestionDao,
    private val questionModelMapper: QuestionModelMapper
) : TestRepository {

    override suspend fun getAllQuestions(): List<Question> {
        val questionModels = questionDao.getAllQuestions()
        return questionModelMapper.transform(questionModels)
    }
}
