package com.tomasz.myfirstapp.register

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
import com.tomasz.myfirstapp.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    val viewModel: RegisterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(
            inflater,
            R.layout.fragment_register, container, false
        ).apply {
            lifecycleOwner = viewLifecycleOwner
            setVariable(BR.viewModel, this@RegisterFragment.viewModel)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.okButtonClickEvent.observe(viewLifecycleOwner) {
            goToSecondScreen()
        }
    }

    private fun goToSecondScreen() {
        Toast.makeText(requireContext(), "Twoje imię to: ${viewModel.firstName.value}", Toast.LENGTH_SHORT).show()
        findNavController().navigate(R.id.action_registerFragment_to_secondFragment)
    }
}