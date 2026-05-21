package com.example.dailyspend.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun nowText(): String =
    LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("MM-dd HH:mm"))
fun nowDate(): String= LocalDateTime.now()
    .format(DateTimeFormatter.ofPattern("yyyy.MM.dd(E)",Locale.KOREA))
//enum class HomeTab {
//    TASK, NOTE
//}