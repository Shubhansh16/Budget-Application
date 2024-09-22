package com.example.budgetapp.repository

import com.example.budgetapp.db.ProfileDao
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    val profileDao: ProfileDao
){

    fun getProfile() = profileDao.getProfileData()
}