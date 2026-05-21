package com.example.dailyspend.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Categories(){
    var categories by remember{mutableStateOf(listOf("식비","교통","옷","기타"))}
    var categorySelected by remember{mutableStateOf((""))}
    Row(modifier=Modifier.fillMaxWidth(),
        verticalAlignment=Alignment.CenterVertically,
        horizontalArrangement=Arrangement.SpaceBetween){
        Text(text="분류", fontSize = 20.sp, fontWeight = Medium)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)
        ){
            items(categories){category->
                OutlinedButton(
                    onClick={categorySelected=category},
                    border= BorderStroke(1.dp,if(categorySelected==category) Color.Cyan else Color.Gray),
                    colors= ButtonDefaults.outlinedButtonColors
                        (containerColor=(if (categorySelected== category) Color.Cyan.copy(0.05f) else Color.Transparent)
                    ) ){
                    Text(
                        text=category,
                        color=if(categorySelected==category) Color.Cyan else Color.Gray,
                        fontSize=12.sp
                    )
                }
            }
        }
    }
}