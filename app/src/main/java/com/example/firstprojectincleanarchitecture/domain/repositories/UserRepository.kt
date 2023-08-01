package com.example.firstprojectincleanarchitecture.domain.repositories

interface UserRepository {

    fun singUp(name: String, email: String, password: String)

    fun getUserInfo() : List<String>
}