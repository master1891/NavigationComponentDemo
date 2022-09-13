package com.nels.navigationcomponentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nels.navigationcomponentdemo.R
import com.nels.navigationcomponentdemo.databinding.FragmentGameBinding

class WelcomeFragment : Fragment() {

    lateinit var _binding:FragmentGameBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGameBinding.inflate(layoutInflater,container,false)

        return _binding.root
    }



}