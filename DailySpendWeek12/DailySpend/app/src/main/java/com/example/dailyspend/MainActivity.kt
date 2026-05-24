package com.example.dailyspend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.example.dailyspend.data.DailySpendViewModel
import com.example.dailyspend.data.DailySpendViewModelFactory
import com.example.dailyspend.navigate.AppNavigation
import com.example.dailyspend.ui.theme.DailySpendTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = (application as DailySpendApplication).repository
        val viewModel = ViewModelProvider(
            this, DailySpendViewModelFactory(repository)
        )[DailySpendViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            DailySpendTheme {
                AppNavigation(viewModel)
            }
        }
    }
}