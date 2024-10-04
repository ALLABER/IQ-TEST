package ru.allaber.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import ru.allaber.domain.repository.TestRepository
import ru.allaber.repository.TestRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindTestRepository(testRepositoryImpl: TestRepositoryImpl): TestRepository
}
