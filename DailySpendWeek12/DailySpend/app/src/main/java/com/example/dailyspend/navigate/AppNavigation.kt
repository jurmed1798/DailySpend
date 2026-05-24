package com.example.dailyspend.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dailyspend.data.DailySpendViewModel
import com.example.dailyspend.screens.ChartScreen
import com.example.dailyspend.screens.ExpenseScreen
import com.example.dailyspend.screens.HomeScreen
import com.example.dailyspend.screens.ListScreen
import com.example.dailyspend.screens.SettingsScreen
import kotlinx.serialization.Serializable

@Serializable object Home
@Serializable object SpendList
@Serializable object Chart
@Serializable object Settings
@Serializable object Expense

@Composable
fun AppNavigation(viewModel: DailySpendViewModel) {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen(
                onNavigateList = { navController.navigate(SpendList) },
                onNavigateChart = { navController.navigate(Chart) },
                onNavigateSettings = { navController.navigate(Settings) },
                onNavigateHome = { navController.navigate(Home) },
                onNavigateExpense = { navController.navigate(Expense) }
            )
        }
        composable<SpendList> {
            ListScreen(
                viewModel = viewModel,
                onNavigateList = { navController.navigate(SpendList) },
                onNavigateHome = { navController.navigate(Home) },
                onNavigateChart = { navController.navigate(Chart) },
                onNavigateSettings = { navController.navigate(Settings) }
            )
        }
        composable<Chart> {
            ChartScreen(
                onNavigateList = { navController.navigate(SpendList) },
                onNavigateHome = { navController.navigate(Home) },
                onNavigateChart = { navController.navigate(Chart) },
                onNavigateSettings = { navController.navigate(Settings) }
            )
        }
        composable<Settings> {
            SettingsScreen(
                onNavigateList = { navController.navigate(SpendList) },
                onNavigateHome = { navController.navigate(Home) },
                onNavigateChart = { navController.navigate(Chart) },
                onNavigateSettings = { navController.navigate(Settings) }
            )
        }
        composable<Expense> {
            ExpenseScreen(
                onClickHome = { navController.navigate(Home) },
                onClickSave = { navController.navigate(Home) },
                viewModel = viewModel
            )
        }
    }
}