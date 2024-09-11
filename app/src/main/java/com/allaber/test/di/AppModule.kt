package com.allaber.test.di

import android.content.Context
import androidx.room.Room
import com.allaber.test.core.data.database.Database
import com.allaber.test.core.data.database.QuestionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): Database {
        return Room.databaseBuilder(
            context = context,
            klass = Database::class.java,
            name = "database.db"
        ).createFromAsset("database/database.db").build()
    }

    @Provides
    fun provideQuestionDao(database: Database): QuestionDao {
        return database.questionDao()
    }
}
