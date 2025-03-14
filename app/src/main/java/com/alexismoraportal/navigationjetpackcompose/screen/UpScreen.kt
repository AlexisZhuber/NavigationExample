package com.alexismoraportal.navigationjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.alexismoraportal.navigationjetpackcompose.components.AppScaffold
import com.alexismoraportal.navigationjetpackcompose.ui.theme.AquaticAwe

@Composable
fun UpScreen(navController: NavController){
    AppScaffold(title = "UpScreen") { padding ->
        Box(contentAlignment = Alignment.Center,modifier = Modifier.fillMaxSize().padding(padding).background(AquaticAwe)){
            Text(text = "Back Home", modifier = Modifier.clickable{
                navController.popBackStack()
            })
        }
    }
}