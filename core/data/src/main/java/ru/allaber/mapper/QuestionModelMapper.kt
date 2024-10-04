package ru.allaber.mapper

import javax.inject.Inject
import ru.allaber.domain.model.Answer
import ru.allaber.domain.model.Question
import ru.allaber.model.AnswerModel
import ru.allaber.model.QuestionModel
import ru.allaber.utils.common.Mapper

class QuestionModelMapper @Inject constructor() : Mapper<List<QuestionModel>, List<Question>> {
    override fun transform(data: List<QuestionModel>): List<Question> {
        return data.mapNotNull { question ->
            question.id?.let {
                Question(
                    id = question.id,
                    imageName = question.imageName,
                    points = question.points,
                    answers = transformAnswers(question.answers)
                )
            }
        }
    }

    private fun transformAnswers(answers: List<AnswerModel>): List<Answer> {
        return answers.mapNotNull { answer ->
            answer.id?.let {
                Answer(
                    id = answer.id,
                    imageName = answer.imageName,
                    isCorrect = answer.isCorrect
                )
            }
        }
    }
}
