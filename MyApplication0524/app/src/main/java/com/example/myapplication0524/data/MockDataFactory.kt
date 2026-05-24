package com.example.myapplication0524.data

import com.example.myapplication0524.util.nowText

object MockDataFactory{
    fun getDataList(): List<DataType> = listOf(
        DataType.Expense(
            id=1,
            category = "식비",
            "монгол хоол ",
            12000,
            dueDate = nowText()
        ),
        DataType.Expense(
            id=2,
            category="옷",
            content="fashion newbalance",
            amount=50000,
            dueDate="2026-05-11 20:55"
        )
    )

}