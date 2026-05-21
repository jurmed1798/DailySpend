package com.example.dailyspend.data

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: String,        // "2026.05.11" хэлбэртэй
    val amount: Long,        // Мөнгөн дүн
    val category: String,    // Төрөл
    val note: String         // 내용
)