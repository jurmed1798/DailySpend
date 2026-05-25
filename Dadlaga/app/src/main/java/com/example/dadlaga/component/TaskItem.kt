package com.example.dadlaga.component

import android.widget.CheckBox
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dadlaga.data.MockDataFactory
import com.example.dadlaga.data.TaskNoteType

@Composable
fun TaskItem(item: TaskNoteType.Task,
             toggleTaskDone: (Int)-> Unit,
             onDeleteTask: (TaskNoteType.Task)-> Unit,
             modifier: Modifier =Modifier){
    Card{
        Row(modifier=Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment=Alignment.CenterVertically){
            Column(
                modifier=Modifier.weight(1f).padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)){
                Row(verticalAlignment = Alignment.CenterVertically){
                    Checkbox(
                        checked=item.done,
                        onCheckedChange={toggleTaskDone(item.id)}
                    )
                    Text(
                        text="${item.title}",
                        textDecoration=if(item.done) TextDecoration.LineThrough else TextDecoration.None,
                        style=MaterialTheme.typography.bodyLarge,
                        fontWeight= FontWeight.SemiBold
                    )
                }
                Text(
                    text="📅${item.dueDate}",
                    style=MaterialTheme.typography.bodyMedium,
                    color= MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier=Modifier.padding(start=16.dp)
                )
                }
            IconButton(onClick={onDeleteTask(item)}){
                Icon(
                    imageVector = Icons.Default.Delete,
                    tint=MaterialTheme.colorScheme.primary,
                    contentDescription = "Delete Item")

            }
        }
    }
}
@Preview (showBackground = true )
@Composable
fun PreviewTaskItem(){
    val items= MockDataFactory.getDataList().filterIsInstance<TaskNoteType.Task>()
    Column(modifier=Modifier.fillMaxWidth()){
        TaskItem(
            item=items[0],{},{}
        )
        Spacer(modifier=Modifier.padding(10.dp))
        TaskItem(
            item=items[1],{},{}
        )
    }
}