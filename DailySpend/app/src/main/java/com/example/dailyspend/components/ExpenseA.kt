package com.example.dailyspend.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyspend.util.nowDate

@Composable
fun ExpenseA() {
    var content by remember{mutableStateOf("")}
    var amount by remember{mutableStateOf("")}
    Column(
        modifier = Modifier.fillMaxSize().padding(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "날짜 🗓️",
                fontWeight = Medium,
                fontSize = 20.sp,
            )
            Text(
                text = "${nowDate()}",
                fontSize = 20.sp,
                fontWeight = ExtraBold
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "금액",
                fontWeight = Medium,
                fontSize = 20.sp
            )
            OutlinedTextField(
                value = amount,
                onValueChange = { amount = it },
                placeholder = { Text(text = "추가") },//
                modifier = Modifier.width(200.dp),//
                singleLine = true, //
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "내용",
                fontSize = 20.sp,
                fontWeight = Medium
            )
            OutlinedTextField(
                value = content,
                onValueChange = { content = it },
                placeholder = { Text(text = "추가") },
                modifier = Modifier.width(200.dp),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Categories()
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(text = "사진 추가🤳",
                fontWeight=Medium,
                fontSize=15.sp,)
        }
    }
}
@Composable
@Preview(showBackground=true)
fun PreviewExpenseA(){
    ExpenseA()
}