package com.example.dadlaga.data
import com.example.dadlaga.utility.nowText

object MockDataFactory{
    fun getDataList(): List<TaskNoteType> = listOf(
        TaskNoteType.Task(
            id=1,
            title="모바일 과제 ",
            dueDate=nowText(),
            done=false
        ),
        TaskNoteType.Note(
            id=2,
            title="봄",
            content="한강 런닝 참 좋🍎"
        )
    )
}