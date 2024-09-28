package com.example.budgetapp.repository

import com.example.budgetapp.db.ProfileDao
import com.example.budgetapp.entity.Profile
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    val profileDao: ProfileDao
){

    fun getProfile() = profileDao.getProfileData()

    suspend fun insertProfileData(profile: Profile) = profileDao.insertProfileData(profile)
}