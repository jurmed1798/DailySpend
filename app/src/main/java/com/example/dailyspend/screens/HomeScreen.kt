package com.example.dailyspend.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyspend.components.MainButtons
import com.example.dailyspend.others.AppTitle

@Composable
fun HomeScreen(
    onNavigateList: () -> Unit,
    onNavigateChart: () -> Unit,
    onNavigateSettings: ()-> Unit,
    onNavigateHome: ()-> Unit,
    modifier:Modifier= Modifier
){
    Scaffold(
        topBar={
            Row(modifier=Modifier.fillMaxWidth().padding(20.dp),
                horizontalArrangement=Arrangement.Center){
                AppTitle()
            }
        },
        bottomBar={
            MainButtons({onNavigateList()},{onNavigateHome()},
                {onNavigateChart()},
                {onNavigateSettings()})
        }
    ){innerPadding->
        Column(modifier=Modifier.padding(innerPadding)
            .fillMaxSize()
            .padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment=Alignment.CenterHorizontally)
        {
            Text("준비중")
        }
    }
}
@Preview
@Composable
fun PreviewHomeScreen(){
    HomeScreen({},{},{},{})
}