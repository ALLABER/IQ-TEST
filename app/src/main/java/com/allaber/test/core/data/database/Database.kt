package com.allaber.test.core.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.allaber.test.core.data.converters.Converters
import com.allaber.test.core.data.model.AnswerModel
import com.allaber.test.core.data.model.QuestionModel

@Database(
    entities = [QuestionModel::class, AnswerModel::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class Database : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
}
