package com.tomasz.myfirstapp.setings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import com.tomasz.myfirstapp.BR
import com.tomasz.myfirstapp.R
import com.tomasz.myfirstapp.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    val viewModel: SettingsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentSettingsBinding>(
            inflater,
            R.layout.fragment_settings, container, false
        ).apply {
            lifecycleOwner = viewLifecycleOwner
            setVariable(BR.viewModel, this@SettingsFragment.viewModel)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        obserwujemy
        viewModel.isLightThemeSelected.observe(viewLifecycleOwner){
            if (it) {
//                zmiana textu na jasny
                viewModel.selectedThemeLabel.value = getString(R.string.settings_fragment_theme_light)
            } else {
                viewModel.selectedThemeLabel.value = getString(R.string.settings_fragment_theme_dark)
            }

//            W javie mozna tak
//            viewModel.selectedThemeLabel.value = it ? getString(R.string.settings_fragment_theme_light) : getString(R.string.settings_fragment_theme_dark)

        }
    }
}