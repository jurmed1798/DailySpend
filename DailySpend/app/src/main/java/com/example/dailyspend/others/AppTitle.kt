package com.example.dailyspend.others

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.unit.sp

@Composable
fun AppTitle(){
    Text(
        text="DAILYSPEND",
        fontSize = 24.sp,
        fontWeight=ExtraBold,
        fontStyle=Italic
    )
}