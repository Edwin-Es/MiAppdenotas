package com.example.miappdenotas.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.miappdenotas.NoteViewModel
import com.example.miappdenotas.ui.screens.NoteDetailScreen
import com.example.miappdenotas.ui.screens.NoteEditScreen
import com.example.miappdenotas.ui.screens.NoteListScreen


@Composable
fun AppNavHost(viewModel: NoteViewModel) {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            NoteListScreen(
                viewModel = viewModel,
                onAdd = { navController.navigate("edit/0") },
                onEdit = { id -> navController.navigate("edit/$id") },
                onOpen = { id -> navController.navigate("detail/$id") }
            )
        }


        composable(
            "edit/{noteId}",
            arguments = listOf(navArgument("noteId") { type = NavType.LongType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getLong("noteId") ?: 0L
            NoteEditScreen(viewModel = viewModel, noteId = id, onBack = { navController.popBackStack() })
        }


        composable(
            "detail/{noteId}",
            arguments = listOf(navArgument("noteId") { type = NavType.LongType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getLong("noteId") ?: 0L
            NoteDetailScreen(viewModel = viewModel, noteId = id, onBack = { navController.popBackStack() })
        }
    }
}