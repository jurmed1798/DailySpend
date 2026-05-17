package com.example.dailyspend.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dailyspend.screens.ChartScreen
import com.example.dailyspend.screens.HomeScreen
import com.example.dailyspend.screens.ListScreen
import com.example.dailyspend.screens.SettingsScreen
import kotlinx.serialization.Serializable

@Serializable object Home
@Serializable object List
@Serializable object Chart
@Serializable object Settings
@Composable
fun AppNavigation(){
    val navController: NavHostController =rememberNavController()
    NavHost(
        navController=navController,
        startDestination= Home
    ){
        composable<Home>{
            HomeScreen(
                onNavigateSettings = {
                    navController.navigate(Settings)
                },
                onNavigateList = {
                    navController.navigate(List)
                },
                onNavigateChart = {
                    navController.navigate(Chart)
                },
                onNavigateHome = {
                    navController.navigate(Home)
                }
            )
        }
        composable<List>{
            ListScreen(
            onNavigateSettings = {
                navController.navigate(Settings)
            },
            onNavigateList = {
                navController.navigate(List)
            },
            onNavigateChart = {
                navController.navigate(Chart)
            },
            onNavigateHome = {
                navController.navigate(Home)
            }
            )
        }
        composable<Chart> {
            ChartScreen(
                onNavigateSettings = {
                    navController.navigate(Settings)
                },
                onNavigateList = {
                    navController.navigate(List)
                },
                onNavigateChart = {
                    navController.navigate(Chart)
                },
                onNavigateHome = {
                    navController.navigate(Home)
                }
            )
        }
        composable <Settings>{
            SettingsScreen(
                onNavigateHome = {
                    navController.navigate(Home)
                },
                onNavigateSettings = {
                    navController.navigate(Settings)
                },
                onNavigateList = {
                    navController.navigate(List)
                },
                onNavigateChart = {
                    navController.navigate(Chart)
                }
            )
        }
    }
}