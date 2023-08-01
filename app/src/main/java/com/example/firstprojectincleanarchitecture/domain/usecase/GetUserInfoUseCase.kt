package com.example.firstprojectincleanarchitecture.domain.usecase

import com.example.firstprojectincleanarchitecture.domain.repositories.UserRepository
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val userRepository: UserRepository
){

   operator fun invoke() = userRepository.getUserInfo()
}