package com.example.dailyspend.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyspend.components.MainButtons
import com.example.dailyspend.data.DailySpend
import com.example.dailyspend.data.DailySpendViewModel

@Composable
fun ListScreen(
    viewModel: DailySpendViewModel,
    onNavigateList: () -> Unit,
    onNavigateHome: () -> Unit,
    onNavigateChart: () -> Unit,
    onNavigateSettings: () -> Unit
) {
    var selectedFilter by remember { mutableStateOf("일") }
    val allSpends by viewModel.allSpends.collectAsState(initial = emptyList())
    Scaffold(
        topBar = {
            Column(modifier = Modifier.fillMaxWidth().padding(top = 20.dp, start = 16.dp, end = 16.dp)) {
                Text("지출 목록", fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(8.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf("일", "주", "월").forEach { filter ->
                        FilterChip(
                            selected = selectedFilter == filter,
                            onClick = { selectedFilter = filter },
                            label = { Text(filter) }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                HorizontalDivider()
            }
        },
        bottomBar = {
            MainButtons(onNavigateList, onNavigateHome, onNavigateChart, onNavigateSettings)
        }
    ) { innerPadding ->
        if (allSpends.isEmpty()) {
            Box(
                modifier = Modifier.padding(innerPadding).fillMaxSize(),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Text("저장된 지출이 없습니다", color = MaterialTheme.colorScheme.outline)
            }
        } else {
            LazyColumn(
                modifier = Modifier.padding(innerPadding).fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(allSpends) { spend ->
                    SpendItem(spend = spend, onDelete = { viewModel.deleteSpend(spend) })
                }
            }
        }
    }
}

@Composable
fun SpendItem(spend: DailySpend, onDelete: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(spend.date, fontSize = 12.sp, color = MaterialTheme.colorScheme.outline)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "${spend.amount}원",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(spend.category, fontSize = 13.sp)
                if (spend.note.isNotBlank()) {
                    Text(spend.note, fontSize = 12.sp, color = MaterialTheme.colorScheme.outline)
                }
            }
            TextButton(onClick = onDelete) {
                Text("삭제", color = MaterialTheme.colorScheme.error)
            }
        }
    }
}