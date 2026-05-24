package com.example.dailyspend.data

import kotlinx.coroutines.flow.Flow

class DailySpendRepository(private val dao: DailySpendDao) {
    val allSpends: Flow<List<DailySpend>> = dao.getAllSpends()

    suspend fun insert(spend: DailySpend): Long = dao.insert(spend)

    suspend fun delete(spend: DailySpend) = dao.deleteById(spend.id)
}