package com.example.dailyspend.screens

import androidx.compose.animation.core.spring
import androidx.compose.foundation.gestures.snapping.SnapPosition
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
import androidx.compose.material3.FilledTonalButton
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
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyspend.components.ExpenseA
import com.example.dailyspend.util.nowDate
import com.example.dailyspend.util.nowText

@Composable
fun ExpenseScreen(onClickHome: ()-> Unit,
                  onClickSave: ()-> Unit){
    var amount by remember { mutableStateOf("") }
    var content by remember {mutableStateOf("")}
    Scaffold(
        topBar={
            Column(modifier= Modifier.padding(top=20.dp)) {
                Row(modifier= Modifier.fillMaxWidth().padding(start=15.dp)){
                    FilledIconButton(onClick = {onClickHome()}){
                        Icon(Icons.Default.ArrowBack, contentDescription = "BackHome")
                    }
                }
                Row(modifier=Modifier.fillMaxWidth().padding(horizontal=15.dp),
                    horizontalArrangement = Arrangement.Center){
                    Text(text="지출",
                        fontWeight = ExtraBold,
                        fontSize = 30.sp)
                }
            }
        },
        bottomBar={
            Row(modifier=Modifier.fillMaxWidth().padding(15.dp),
                Arrangement.Center) {
                Button(onClick={onClickSave()}){
                    Text(
                        text="저장",
                        fontWeight = Medium,
                    )
                }
            }
        }
    ){
        innerPadding->
        Column(modifier=Modifier.padding(innerPadding).fillMaxSize().padding(horizontal=15.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            ExpenseA()
    }
    }
}
@Preview
@Composable
fun PreviewExpenseScreen(){
    ExpenseScreen({},{})
}