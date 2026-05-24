package com.example.dadlaga.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dadlaga.component.TaskNoteTitle

@Composable
fun Week06HomeScreenA(
//    vm : TaskNoteViewModel=viewModel(),
                      modifier: Modifier= Modifier
){
    Column(
        modifier=modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        TaskNoteTitle()
    }

}