package com.example.myapplication0524.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ExpenseViewModel : ViewModel(){
    var content1 by mutableStateOf("")
    val onChangeContent:(String)-> Unit={content1=it}
    var amount1 by mutableStateOf("")
    val onChangeAmount1:(String)->Unit={amount1=it}
    fun
}