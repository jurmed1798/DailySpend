package com.example.dadlaga.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dadlaga.data.MockDataFactory
import com.example.dadlaga.data.TaskNoteType

@Composable
fun TaskNoteItem(item: TaskNoteType,
                 toggleTaskDone: (Int)-> Unit,
                 onDeleteTask: (TaskNoteType.Task)-> Unit,
                 modifier: Modifier= Modifier
){
    when(item){
        is TaskNoteType.Task-> TaskItem(
            item=item,
            toggleTaskDone=toggleTaskDone,
            onDeleteTask=onDeleteTask,
            modifier=modifier
        )
        is TaskNoteType.Note-> NoteItem(
            item=item,
            modifier=modifier
        )
    }
}
@Preview
@Composable
private fun PreviewTaskNoteType(){
    val items= MockDataFactory.getDataList()
    Column{
        items.forEach{
            item-> TaskNoteItem(item=item, toggleTaskDone = {},{})
            Spacer(Modifier.height(5.dp))
        }
    }
}