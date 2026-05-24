package com.example.myapplication0524.data

import com.example.myapplication0524.util.nowText

sealed class DataType {
    abstract val id: Int
    abstract val category: String
    abstract val content: String
    abstract val amount: Long

    class Expense(
        override val id: Int,
        override val category: String,
        override val content: String,
        override val amount: Long,
        val dueDate: String=nowText()
    ): DataType()
}