package com.example.myapplication0524.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication0524.components.DateTimeHome
import com.example.myapplication0524.components.MainButtons

@Composable
fun HomeScreen(onNavigateExpense: ()-> Unit){
    Scaffold(
        topBar={
            Row(
                modifier = Modifier.fillMaxWidth().padding(15.dp),
                Arrangement.Center
            ) {
                Text(text="DailySpend",
                    fontSize=24.sp,
                    fontWeight=ExtraBold)
            }
        },
        bottomBar={
            Row(modifier=Modifier.fillMaxWidth().padding(15.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly){
                MainButtons({},{})
            }
        },
        floatingActionButton={
            Row(modifier=Modifier.padding(10.dp)){
                FilledIconButton({onNavigateExpense()}) {
                    Icon(Icons.Default.Add, "Expense")
                }
            }
        }

    ){
        inner->
        Column(modifier=Modifier.fillMaxSize().padding(inner).padding(15.dp)){
            DateTimeHome()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreViewHome(){
    HomeScreen({})
}