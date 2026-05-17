package com.example.dailyspend.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DWMButtons(onClick: ()-> Unit,modifier:Modifier= Modifier){
    Row(
        modifier=Modifier.fillMaxWidth().padding(5.dp),
        horizontalArrangement=Arrangement.SpaceEvenly
    ){
        FilledIconButton(onClick={onClick()}){
            Text("일")
        }
        FilledIconButton(onClick={onClick()}){
            Text("주")
        }
        FilledIconButton(onClick={onClick()}){
            Text("월")
        }
    }
}