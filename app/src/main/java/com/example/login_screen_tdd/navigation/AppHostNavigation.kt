package com.example.login_screen_tdd.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dashboardscren.DashboardScreen
import com.example.feature_login.LoginScreen

@Composable
fun AppHostNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "LoginScreen"
    ) {
        composable(route = "LoginScreen") {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate("DashboardScreen") {
                        popUpTo("LoginScreen") { inclusive = true }
                        launchSingleTop = true
                    }
                },
            )
        }

        composable(route = "DashboardScreen") {
            DashboardScreen()
        }
    }
}
