package com.example.smarttasknotes

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.smarttasknotes.ui.screens.Week05HomeScreenB
import com.example.smarttasknotes.ui.screens.Week05HomeScreenC
import com.example.smarttasknotes.ui.theme.SmartTaskNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.i(tag = "greenjoa",msg = "onCreate")
        Log.i("greenjoa","onCreate")
        enableEdgeToEdge()
        setContent {
            SmartTaskNotesTheme {
                Week05HomeScreenC()
//                Scaffold(modifier = Modifier.fillMaxSize()) {
//                    Week05HomeScreenB()
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
//                }
            }
        }

        }
    override fun onStart() {
        super.onStart()
        Log.i("greenjoa","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("greenjoa","onResume")

    }
    override fun onPause() {
        super.onPause()
        Log.i("greenjoa","onPause")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SmartTaskNotesTheme {
        Greeting("Android")
    }
}