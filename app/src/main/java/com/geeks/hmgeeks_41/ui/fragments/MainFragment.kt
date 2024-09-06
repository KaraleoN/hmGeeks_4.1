package com.geeks.hmgeeks_41.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geeks.hmgeeks_41.R
import com.geeks.hmgeeks_41.databinding.FragmentMainBinding
import com.geeks.hmgeeks_41.ui.User

class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btn.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment(
                User(
                    etName.text.toString(),
                    etEmail.text.toString(),
                    etPassword.text.toString().toInt()
                )
            ))
        }
    }
}