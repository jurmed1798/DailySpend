package com.example.dailyspend.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DailySpend::class], version = 1, exportSchema = false)
abstract class DailySpendDatabase : RoomDatabase() {
    abstract fun dailySpendDao(): DailySpendDao

    companion object {
        @Volatile
        private var INSTANCE: DailySpendDatabase? = null

        fun getDatabase(context: Context): DailySpendDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DailySpendDatabase::class.java,
                    "daily_spend_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}