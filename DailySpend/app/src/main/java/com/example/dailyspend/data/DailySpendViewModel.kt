package com.example.dailyspend.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class DailySpendViewModel(private val repository: DailySpendRepository) : ViewModel() {
    val allSpends: Flow<List<DailySpend>> = repository.allSpends

    fun insertSpend(spend: DailySpend) {
        viewModelScope.launch { repository.insert(spend) }
    }

    fun deleteSpend(spend: DailySpend) {
        viewModelScope.launch { repository.delete(spend) }
    }
}

class DailySpendViewModelFactory(private val repository: DailySpendRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DailySpendViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DailySpendViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}