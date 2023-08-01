package com.example.firstprojectincleanarchitecture.presentation.ui.fragments.register

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.firstprojectincleanarchitecture.R
import com.example.firstprojectincleanarchitecture.base.BaseFragment
import com.example.firstprojectincleanarchitecture.databinding.FragmentRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterUserFragment : BaseFragment<FragmentRegisterBinding, RegisterUserViewModel>(R.layout.fragment_register) {
    override val binding by viewBinding(FragmentRegisterBinding::bind)
    override val viewModel by viewModels<RegisterUserViewModel>()

    override fun setupListeners() {
     registerUser()
    }

    private fun registerUser() {
        binding.SingIn.setOnClickListener{
            val name = binding.name.toString().trim()
            val email = binding.email.toString().trim()
            val password = binding.password.toString().trim()
            viewModel.singUp(name,email,password)
            findNavController().navigate(R.id.userInfo)
        }
    }
}