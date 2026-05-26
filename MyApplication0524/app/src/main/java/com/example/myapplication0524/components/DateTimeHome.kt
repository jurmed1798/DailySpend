package com.example.myapplication0524.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun DateTimeHome(){
    val CurrentTime= LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))
    Card(modifier= Modifier.fillMaxWidth().padding(10.dp),){
        Column(modifier=Modifier.padding(top=10.dp,start=15.dp)){
        Text(text=CurrentTime,
            fontSize=25.sp,
            fontWeight= FontWeight.Medium,
            color= MaterialTheme.colorScheme.onSurface)
    }
    }
}
@Composable
@Preview
fun PreviewDateTimeHome(){
    DateTimeHome()
}