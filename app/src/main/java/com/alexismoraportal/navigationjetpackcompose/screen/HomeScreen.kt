package com.alexismoraportal.navigationjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alexismoraportal.navigationjetpackcompose.components.AppScaffold
import com.alexismoraportal.navigationjetpackcompose.navigation.Screens

@Composable
fun HomeScreen(navController: NavController){

    AppScaffold(title = "Home Screen") { padding ->
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
            .fillMaxSize()
            .padding(padding)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(
                    onClick = {
                        navController.navigate(Screens.UpScreen.name)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowUp,
                        contentDescription = "Up"
                    )
                }
                Row(horizontalArrangement = Arrangement.Center){
                    IconButton(
                        onClick = {
                            navController.navigate(Screens.LeftScreen.name)
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowLeft,
                            contentDescription = "Left"
                        )
                    }

                    Spacer(Modifier.width(64.dp))

                    IconButton(
                        onClick = {
                            navController.navigate(Screens.RightScreen.name)
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowRight,
                            contentDescription = "Right"
                        )
                    }

                }
                IconButton(
                    onClick = {
                        navController.navigate(Screens.DownScreen.name)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Down"
                    )
                }
            }
        }
    }

}