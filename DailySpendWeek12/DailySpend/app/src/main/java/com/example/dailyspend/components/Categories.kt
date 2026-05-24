package com.example.dailyspend.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Categories(selected: String, onSelect: (String) -> Unit) {
    val categories = listOf("식비", "교통", "옷", "기타")
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("분류", fontSize = 18.sp, fontWeight = FontWeight.Medium)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            items(categories) { category ->
                OutlinedButton(
                    onClick = { onSelect(category) },
                    border = BorderStroke(1.dp, if (selected == category) Color.Cyan else Color.Gray),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = if (selected == category) Color.Cyan.copy(0.1f) else Color.Transparent
                    )
                ) {
                    Text(
                        text = category,
                        color = if (selected == category) Color.Cyan else Color.Gray,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}