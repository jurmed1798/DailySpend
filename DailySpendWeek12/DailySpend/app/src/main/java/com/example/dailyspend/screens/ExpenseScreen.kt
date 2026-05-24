package com.example.dailyspend.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyspend.components.Categories
import com.example.dailyspend.data.DailySpend
import com.example.dailyspend.data.DailySpendViewModel
import com.example.dailyspend.util.nowDate

@Composable
fun ExpenseScreen(
    onClickHome: () -> Unit,
    onClickSave: () -> Unit,
    viewModel: DailySpendViewModel
) {
    var amount by remember { mutableStateOf("") }
    var note by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("식비") }

    Scaffold(
        topBar = {
            Column(modifier = Modifier.padding(top = 20.dp)) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 15.dp)) {
                    FilledIconButton(onClick = onClickHome) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("지출 추가", fontWeight = FontWeight.ExtraBold, fontSize = 28.sp)
                }
            }
        },
        bottomBar = {
            Row(
                modifier = Modifier.fillMaxWidth().padding(15.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (amount.isNotBlank()) {
                            viewModel.insertSpend(
                                DailySpend(
                                    date = nowDate(),
                                    amount = amount.toLongOrNull() ?: 0L,
                                    category = selectedCategory,
                                    note = note
                                )
                            )
                            onClickSave()
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("저장", fontWeight = FontWeight.Medium, fontSize = 16.sp)
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxSize().padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("날짜 🗓️", fontSize = 18.sp, fontWeight = FontWeight.Medium)
                Text(nowDate(), fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            HorizontalDivider()
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("금액", fontSize = 18.sp, fontWeight = FontWeight.Medium)
                OutlinedTextField(
                    value = amount,
                    onValueChange = { amount = it },
                    placeholder = { Text("0") },
                    modifier = Modifier.width(200.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    suffix = { Text("원") }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("내용", fontSize = 18.sp, fontWeight = FontWeight.Medium)
                OutlinedTextField(
                    value = note,
                    onValueChange = { note = it },
                    placeholder = { Text("메모") },
                    modifier = Modifier.width(200.dp),
                    singleLine = true
                )
            }
            Categories(selected = selectedCategory, onSelect = { selectedCategory = it })
        }
    }
}