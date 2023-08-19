package com.example.firstprojectincleanarchitecture.di

import com.example.firstprojectincleanarchitecture.data.repositories.UserRepositoryImpl
import com.example.firstprojectincleanarchitecture.domain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindUserRepository(repositoryImpl: UserRepositoryImpl): UserRepository
}