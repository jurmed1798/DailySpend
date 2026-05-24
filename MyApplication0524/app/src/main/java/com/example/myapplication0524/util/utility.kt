package com.example.myapplication0524.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun nowText(): String= LocalDateTime.now()
    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))