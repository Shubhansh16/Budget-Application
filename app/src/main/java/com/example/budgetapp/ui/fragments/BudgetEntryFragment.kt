package com.example.budgetapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.budgetapp.R
import com.example.budgetapp.databinding.FragmentBudgetEntryBinding


class BudgetEntryFragment : Fragment() {

    private lateinit var binding: FragmentBudgetEntryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentBudgetEntryBinding.inflate(inflater,container,false)
        return binding.root
    }
}