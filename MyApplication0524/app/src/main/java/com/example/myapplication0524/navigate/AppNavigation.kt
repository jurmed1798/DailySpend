//package com.example.myapplication0524.navigate
//
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.myapplication0524.screens.HomeScreen
//import kotlinx.serialization.Serializable
//
//@Serializable object GoList
//@Serializable object Home
//@Serializable object Expense
//@Composable
//fun AppNavigation(){
//    val navController : NavHostController = rememberNavController()
//    NavHost(navController=navController, startDestination= Home){
//        composable<Home> {
//            HomeScreen(
//                navController.navigate(Expense)
//            )
//
//        }
//    }
//
//}