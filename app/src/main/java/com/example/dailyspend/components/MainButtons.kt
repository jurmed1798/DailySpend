package com.example.dailyspend.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainButtons(onListClick: ()-> Unit,
                onHomeClick: ()-> Unit,
                onChartClick: () -> Unit,
                onSettingClick: ()-> Unit,
                modifier:Modifier= Modifier
){
    Row(modifier=Modifier.fillMaxWidth().padding(start=15.dp,end=16.dp,bottom=10.dp),
        Arrangement.SpaceEvenly) {
        FilledTonalButton(onClick = { onListClick() }) {
            Icon(Icons.Default.List, contentDescription = "List")
        }
        FilledTonalButton(onClick = { onHomeClick() }) {
            Icon(Icons.Default.Home, contentDescription = "Home")
        }
        FilledTonalButton(onClick = { onChartClick() }) {
            Icon(Icons.Default.Info, contentDescription = "Chart")
        }
        FilledTonalButton(onClick = { onSettingClick() }) {
            Icon(Icons.Default.Settings, contentDescription = "Setting")
        }
    }
}