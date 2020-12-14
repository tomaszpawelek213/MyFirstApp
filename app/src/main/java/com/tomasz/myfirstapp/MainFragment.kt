package com.tomasz.myfirstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tomasz.myfirstapp.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(layoutInflater)
        binding.okButton.setOnClickListener {
            Toast.makeText(requireContext(), "Button click", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }

        return binding.root
    }
}