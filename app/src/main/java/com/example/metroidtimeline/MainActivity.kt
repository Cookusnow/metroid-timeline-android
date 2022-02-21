package com.example.metroidtimeline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.metroidtimeline.timeline.MetroidTimelineScreen
import com.example.metroidtimeline.ui.theme.MetroidTimelineTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MetroidTimelineTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "metroid_timeline_screen"
                ) {
                    composable("metroid_timeline_screen") {
                        MetroidTimelineScreen(navController = navController)
                    }
                }
            }
        }
    }
}