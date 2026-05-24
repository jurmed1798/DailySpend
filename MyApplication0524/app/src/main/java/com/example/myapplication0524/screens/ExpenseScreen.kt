package com.example.myapplication0524.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpenseScreen(onNavigateHome: ()-> Unit,
                  onSave:()-> Unit){
    Scaffold(
topBar={
    Column(
        modifier = Modifier.fillMaxWidth().padding(15.dp),
        Arrangement.Center
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(start=10.dp)) {
            FilledIconButton({onNavigateHome()}) {
                Icon(Icons.Default.ArrowBack,"GoHome")
            }
        }
        Row(  modifier = Modifier.fillMaxWidth().padding(15.dp),
            Arrangement.Center) {
            Text(
                text = "ExpenseScreen",
                fontSize = 24.sp,
                fontWeight = ExtraBold
            )
        }
    }
},
bottomBar={
    Row(modifier=Modifier.fillMaxWidth().padding(15.dp),
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly){
        Button({onSave()}){
            Text(text="저장",
                fontStyle=Italic)
        }
    }
},
){
    inner->
    Column(modifier=Modifier.fillMaxSize().padding(inner).padding(15.dp)){

    }
}
}
@Preview(showBackground = true)
@Composable
fun PreViewExpenseScreen(){
    ExpenseScreen({},{})
}