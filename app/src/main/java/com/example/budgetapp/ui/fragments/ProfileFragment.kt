package com.example.budgetapp.ui.fragments

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.media.Image
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.example.budgetapp.R
import com.example.budgetapp.databinding.FragmentProfileBinding
import com.example.budgetapp.ui.viewmodels.ProfileViewModels
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private val profileViewModel : ProfileViewModels by viewModels()
    private lateinit var filePath : Uri
    private lateinit var bitmap:Bitmap

    private val takePhoto = registerForActivityResult(ActivityResultContracts.GetContent()){result->
        if (result != null) {
            filePath = result
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P){
            val source = ImageDecoder.createSource(requireContext().contentResolver!!, filePath)
            bitmap = ImageDecoder.decodeBitmap(source)
        }
        saveImageToInternalStorage() 
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }
}