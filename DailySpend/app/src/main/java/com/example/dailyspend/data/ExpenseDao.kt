package com.example.dailyspend.data

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao{
    @Insert
    suspend fun insertExpense(espense: Expense)
    @Query("SELECT * FROM expenses ORDER BY date DESC ")
    fun getAllExpenses(): Flow<List<Expense>>
}
