package com.allaber.test.core.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.allaber.test.core.data.model.QuestionModel

@Database(
    entities = [QuestionModel::class],
    version = 1
)
abstract class Database : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
}
