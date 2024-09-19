package com.example.budgetapp.repository

import com.example.budgetapp.db.BudgetDao
import javax.inject.Inject

class BudgetRepository @Inject constructor(
    val budgetDao: BudgetDao
) {
}