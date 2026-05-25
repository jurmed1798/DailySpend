package com.example.smarttasknotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import com.example.smarttasknotes.assignment01.screen.HomeScreen
import com.example.smarttasknotes.navexample.navGraph.NavGraph
import com.example.smarttasknotes.navexample.screens.MainScreen
import com.example.smarttasknotes.navigation.TaskNoteAppNavGraph
import com.example.smarttasknotes.ui.screens.Week06HomeScreenA
import com.example.smarttasknotes.ui.theme.SmartTaskNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  enableEdgeToEdge()
        setContent {
            SmartTaskNotesTheme {
//                Week06HomeScreenA()
//                HomeScreen() //  Assignment01
//                TaskNoteAppNavGraph()
                MainScreen()

            }
        }
    }
}
