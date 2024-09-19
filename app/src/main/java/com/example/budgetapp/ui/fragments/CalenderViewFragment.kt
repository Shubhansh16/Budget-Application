package com.example.budgetapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.budgetapp.R
import com.example.budgetapp.databinding.FragmentCalenderViewBinding


class CalenderViewFragment : Fragment() {

    private lateinit var binding: FragmentCalenderViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding= FragmentCalenderViewBinding.inflate(inflater,container,false)
        return binding.root
    }
}