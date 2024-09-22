package com.allaber.test.core.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "answers")
data class AnswerModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val imageName: String,
    val isCorrect: Boolean
)
