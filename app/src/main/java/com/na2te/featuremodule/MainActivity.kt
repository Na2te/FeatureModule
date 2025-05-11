package com.na2te.featuremodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.na2te.featuremodule.ui.theme.FeatureModuleTheme
import com.na2te.second.navigation.navigateToSecond
import com.na2te.second.navigation.secondSection
import com.na2te.start.navigation.StartBaseRoute
import com.na2te.start.navigation.navigateToStart
import com.na2te.start.navigation.startSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FeatureModuleTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        NavHost(
                            navController = navController,
                            startDestination = StartBaseRoute,
                        ) {
                            startSection(navController::navigateToSecond)
                            secondSection(navController::navigateToStart)
                        }
                    }
                }
            }
        }
    }
}