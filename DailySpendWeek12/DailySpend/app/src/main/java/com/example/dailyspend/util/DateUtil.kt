package com.example.dailyspend.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun nowDate(): String = LocalDateTime.now()
    .format(DateTimeFormatter.ofPattern("yyyy.MM.dd(E)", Locale.KOREAN))
