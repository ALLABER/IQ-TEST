package ru.allaber.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import ru.allaber.database.Database
import ru.allaber.database.QuestionDao
import ru.allaber.domain.preferenceStorage.PreferenceStorage
import ru.allaber.preferenceStorage.PreferenceStorageImpl

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

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

    @Provides
    @Singleton
    fun providePreferenceStorage(@ApplicationContext context: Context): PreferenceStorage {
        return PreferenceStorageImpl(context)
    }
}
