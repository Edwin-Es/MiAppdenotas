package com.example.miappdenotas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.miappdenotas.ui.navigation.AppNavHost


class MainActivity : ComponentActivity() {
    private val viewModel: NoteViewModel by viewModels { NoteViewModelFactory(application) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    AppNavHost(viewModel = viewModel)
                }
            }
        }
    }
}