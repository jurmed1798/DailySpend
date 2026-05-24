package com.example.dailyspend

import android.app.Application
import com.example.dailyspend.data.DailySpendDatabase
import com.example.dailyspend.data.DailySpendRepository

class DailySpendApplication : Application() {
    val database by lazy { DailySpendDatabase.getDatabase(this) }
    val repository by lazy { DailySpendRepository(database.dailySpendDao()) }
}