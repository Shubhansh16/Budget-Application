package com.example.budgetapp.di

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.budgetapp.db.BudgetDatabase
import com.example.budgetapp.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBudgetDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        BudgetDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun providesProfileDao(db:BudgetDatabase) = db.getProfileDao()

    @Provides
    @Singleton
    fun providesBudgetDao(db:BudgetDatabase) = db.getBudgetDao()
}