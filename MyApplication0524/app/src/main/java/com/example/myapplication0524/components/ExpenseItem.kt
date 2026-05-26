package com.example.myapplication0524.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication0524.util.nowDate
import com.example.myapplication0524.util.nowText

@Composable
fun ExpenseItem() {
    var content by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "날짜", fontSize = 15.sp)
            Text(text = nowDate())
        }
        Row(modifier=Modifier.fillMaxWidth(),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text="금액", fontSize = 15.sp)
            TextField(
                value=amount,
                onValueChange={amount=it},
                label={Text("입력")},
                modifier=Modifier.fillMaxWidth().padding(start=30.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "내용", fontSize = 15.sp)
            TextField(
                value = content,
                onValueChange = { content = it },
                label = { Text("입력") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp)
            )
        }
    }
}
@Composable
@Preview (showBackground = true )
fun PreviewExpenseItem(){
    ExpenseItem()
}