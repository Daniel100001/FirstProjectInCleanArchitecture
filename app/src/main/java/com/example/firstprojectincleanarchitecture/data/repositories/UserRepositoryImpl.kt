package com.example.firstprojectincleanarchitecture.data.repositories

import com.example.firstprojectincleanarchitecture.data.local.sharedpreferences.UserPreferencesHelper
import com.example.firstprojectincleanarchitecture.domain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val preferencesHelper: UserPreferencesHelper
): UserRepository {

    override fun singUp(name: String, email: String, password: String) {
        preferencesHelper.apply {
            this.name = name
            this.email = email
            this.password = password
        }
    }

    override fun getUserInfo() = listOf(preferencesHelper.name.toString(),preferencesHelper.email.toString(),preferencesHelper.password.toString())
}