package com.example.dailyspend.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DailySpendDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(spend: DailySpend): Long

    @Query("SELECT * FROM daily_spend_table ORDER BY date DESC")
    fun getAllSpends(): Flow<List<DailySpend>>

    @Query("DELETE FROM daily_spend_table WHERE id = :id")
    suspend fun deleteById(id: Int)
}