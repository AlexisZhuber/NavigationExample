package com.alexismoraportal.navigationjetpackcompose.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.alexismoraportal.navigationjetpackcompose.ui.theme.FutureDusk

/**
 * A reusable scaffold component for the application.
 *
 * This component encapsulates the common Scaffold layout with a top app bar,
 * which can be used across all screens to provide a consistent look and feel.
 *
 * @param title The title to be displayed in the top app bar.
 * @param modifier The modifier to be applied to the scaffold.
 * @param containerColor The background color for the top app bar.
 * @param content The main content of the screen. This lambda receives [PaddingValues] from the scaffold.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(
    title: String,
    modifier: Modifier = Modifier,
    containerColor: Color = FutureDusk,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = title, color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = containerColor
                )
            )
        }
    ) { padding ->
        Box(modifier = Modifier
            .fillMaxSize()
        ) {
            content(padding)
        }
    }
}
