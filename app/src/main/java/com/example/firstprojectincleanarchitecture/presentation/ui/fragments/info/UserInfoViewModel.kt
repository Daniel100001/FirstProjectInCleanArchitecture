package com.example.firstprojectincleanarchitecture.presentation.ui.fragments.info

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firstprojectincleanarchitecture.domain.usecase.GetUserInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserInfoViewModel @Inject constructor(
    private val getUserInfoUseCase: GetUserInfoUseCase
): ViewModel() {

    private val _userInfo = MutableLiveData<List<String>>()
    val userInfo: LiveData<List<String>> get() = _userInfo

    init {
        getUserInfo()
    }

    fun getUserInfo(){
        _userInfo.value = getUserInfoUseCase()
    }
}