package ru.allaber.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class QuestionModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val imageName: String,
    val points: Int,
    val answers: List<AnswerModel>
)
