package com.example.firstprojectincleanarchitecture.presentation.ui.fragments.info

import android.widget.Toast
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.firstprojectincleanarchitecture.R
import com.example.firstprojectincleanarchitecture.base.BaseFragment
import com.example.firstprojectincleanarchitecture.databinding.FragmentUserInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfo : BaseFragment<FragmentUserInfoBinding, UserInfoViewModel>(R.layout.fragment_user_info) {
    override val binding by viewBinding(FragmentUserInfoBinding::bind)
    override val viewModel by viewModels<UserInfoViewModel>()

    override fun setupListeners() {
        getUserInfo()
    }

    private fun getUserInfo() {
        binding.showInfo.setOnClickListener{
            viewModel.userInfo.observe(viewLifecycleOwner){
                binding.name.text = it[0]
                binding.email.text = it[1]
                binding.password.text = it[2]
                Toast.makeText(requireContext(), it.size.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}