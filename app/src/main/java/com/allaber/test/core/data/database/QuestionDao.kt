package com.allaber.test.core.data.database

import androidx.room.Dao
import androidx.room.Query
import com.allaber.test.core.data.model.QuestionModel

@Dao
interface QuestionDao {
    @Query("SELECT * FROM questions")
    suspend fun getAllQuestions(): List<QuestionModel>
}
