package com.example.dailyspend.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dailyspend.components.DWMButtons
import com.example.dailyspend.components.MainButtons

@Composable
fun ChartScreen(onNavigateSettings: ()-> Unit,
                onNavigateHome: () -> Unit,
                onNavigateChart: () -> Unit,
                onNavigateList: ()-> Unit,
                modifier: Modifier= Modifier
){
    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(text = "Chart")
                DWMButtons(onClick={})
            }
        },
        bottomBar={
            MainButtons({onNavigateList()},
                {onNavigateHome()},
                {onNavigateChart()},
                {onNavigateSettings()})
        }
    )
    {innerPadding->
        Column(modifier=Modifier
            .padding(innerPadding)
            .fillMaxSize()){
        }
    }
}