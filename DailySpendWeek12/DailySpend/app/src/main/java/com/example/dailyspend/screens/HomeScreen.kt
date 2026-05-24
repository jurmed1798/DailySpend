package com.example.dailyspend.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.dailyspend.components.MainButtons

@Composable
fun HomeScreen(
    onNavigateList: () -> Unit,
    onNavigateChart: () -> Unit,
    onNavigateSettings: () -> Unit,
    onNavigateHome: () -> Unit,
    onNavigateExpense: () -> Unit
) {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text("DailySpend", style = MaterialTheme.typography.headlineMedium)
            }
        },
        bottomBar = {
            MainButtons(onNavigateList, onNavigateHome, onNavigateChart, onNavigateSettings)
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = onNavigateExpense,
                containerColor = Color.Green,
                shape = RoundedCornerShape(20.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add", modifier = Modifier.size(28.dp))
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("준비중")
        }
    }
}