package ru.allaber.database

import androidx.room.Dao
import androidx.room.Query
import ru.allaber.model.QuestionModel

@Dao
interface QuestionDao {
    @Query("SELECT * FROM questions")
    suspend fun getAllQuestions(): List<QuestionModel>
}
