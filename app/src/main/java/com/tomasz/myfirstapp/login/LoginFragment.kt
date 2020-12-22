package com.tomasz.myfirstapp.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.tomasz.myfirstapp.BR
import com.tomasz.myfirstapp.R
import com.tomasz.myfirstapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater,
            R.layout.fragment_login, container, false
        ).apply {
            lifecycleOwner = viewLifecycleOwner
            setVariable(BR.viewModel, this@LoginFragment.viewModel)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.onValidLoginEvent.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), "zalogowano", Toast.LENGTH_LONG).show()
        }
        viewModel.onInvalidLoginEvent.observe(viewLifecycleOwner){
            Toast.makeText(requireContext(), "nieporawane dane logowania: " +
                    "[username=${viewModel.username.value}, password=${viewModel.password.value}]",
                Toast.LENGTH_LONG).show()
        }
//      pokaż trzeci ekran
        viewModel.goToSettingsEvent.observe(viewLifecycleOwner){
            findNavController().navigate(R.id.action_loginFragment_to_settingsFragment)
        }

    }

}