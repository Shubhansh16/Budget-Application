package com.example.budgetapp.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgetapp.entity.Profile
import com.example.budgetapp.repository.ProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModels @Inject constructor(
    val profileRepository: ProfileRepository
) :ViewModel(){

    val profileLiveData: LiveData<List<Profile>> = profileRepository.getProfile()

    fun insertProfileData(profile: Profile) = viewModelScope.launch {
        profileRepository.insertProfileData(profile)
    }
}