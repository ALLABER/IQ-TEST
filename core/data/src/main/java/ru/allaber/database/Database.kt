package ru.allaber.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.allaber.converters.Converters
import ru.allaber.model.AnswerModel
import ru.allaber.model.QuestionModel

@Database(
    entities = [QuestionModel::class, AnswerModel::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class Database : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
}
