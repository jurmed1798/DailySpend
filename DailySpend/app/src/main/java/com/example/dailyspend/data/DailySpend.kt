package com.example.dailyspend.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_spend_table")
data class DailySpend(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: String,
    val amount: Long,
    val category: String,
    val note: String
)