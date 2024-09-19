package com.example.budgetapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.budgetapp.entity.Budget
import com.example.budgetapp.entity.Profile

@Database(
    entities = [Budget::class, Profile::class],
    version = 1
)

abstract class BudgetDatabase:RoomDatabase() {
    abstract fun getBudgetDao():BudgetDao
    abstract fun getProfileDao():ProfileDao
}