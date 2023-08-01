package com.example.firstprojectincleanarchitecture.presentation.ui.fragments.register

import androidx.lifecycle.ViewModel
import com.example.firstprojectincleanarchitecture.domain.usecase.SingUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterUserViewModel @Inject constructor(
    private val singUpUseCase: SingUpUseCase
): ViewModel() {

     fun singUp(name: String, email: String, password: String){
         singUpUseCase(name, email, password)
    }
}