package com.example.myapplication0524.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainButtons(onNavigateGoList: ()-> Unit,
                onNavigateHome: ()-> Unit){
    Row(
        modifier=Modifier.fillMaxWidth(),
        Arrangement.SpaceEvenly
    ){
        FilledIconButton(onClick={onNavigateGoList()}){
            Icon(Icons.Default.List, "GoList")
        }
        FilledIconButton(onClick={onNavigateHome()}){
            Icon(Icons.Default.Home,"Home")
        }
    }
}