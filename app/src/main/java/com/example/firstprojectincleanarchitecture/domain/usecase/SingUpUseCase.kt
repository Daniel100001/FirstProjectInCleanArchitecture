package com.example.firstprojectincleanarchitecture.domain.usecase

import com.example.firstprojectincleanarchitecture.domain.repositories.UserRepository
import javax.inject.Inject

class SingUpUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke(name: String, email: String, password: String){
        userRepository.singUp(name, email, password)
    }
}