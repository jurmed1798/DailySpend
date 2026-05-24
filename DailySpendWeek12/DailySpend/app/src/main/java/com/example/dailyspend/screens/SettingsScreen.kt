package com.example.dailyspend.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dailyspend.components.MainButtons

@Composable
fun SettingsScreen(
    onNavigateList: () -> Unit,
    onNavigateHome: () -> Unit,
    onNavigateChart: () -> Unit,
    onNavigateSettings: () -> Unit
) {
    Scaffold(
        topBar = {
            Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                Text("설정", style = MaterialTheme.typography.headlineMedium)
            }
        },
        bottomBar = {
            MainButtons(onNavigateList, onNavigateHome, onNavigateChart, onNavigateSettings)
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
            Text("준비중", modifier = Modifier.padding(16.dp))
        }
    }
}