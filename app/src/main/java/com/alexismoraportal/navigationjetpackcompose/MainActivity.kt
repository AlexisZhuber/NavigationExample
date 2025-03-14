package com.alexismoraportal.navigationjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alexismoraportal.navigationjetpackcompose.navigation.NavManager
import com.alexismoraportal.navigationjetpackcompose.ui.theme.NavigationJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationJetpackComposeTheme {
                NavManager()
            }
        }
    }
}

