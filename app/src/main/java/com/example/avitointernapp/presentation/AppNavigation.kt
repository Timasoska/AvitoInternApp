package com.example.avitointernapp.presentation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.avitointernapp.presentation.home.HomeScreen
import com.example.avitointernapp.presentation.home.PlayerScreenPlaceHolder
import com.example.avitointernapp.util.Routes

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            HomeScreen(rootNavController = navController) // Передаем основной контроллер для навигации на Player
        }
        composable(Routes.PLAYER) { backStackEntry ->
            val trackId = backStackEntry.arguments?.getString("trackId") ?: "unknown"
            PlayerScreenPlaceHolder(trackId = trackId) //Заглушка
        }

    }

}