package com.alexismoraportal.navigationjetpackcompose.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexismoraportal.navigationjetpackcompose.screen.DownScreen
import com.alexismoraportal.navigationjetpackcompose.screen.HomeScreen
import com.alexismoraportal.navigationjetpackcompose.screen.LeftScreen
import com.alexismoraportal.navigationjetpackcompose.screen.RightScreen
import com.alexismoraportal.navigationjetpackcompose.screen.UpScreen

/**
 * Duration (in milliseconds) for all transition animations.
 */
private const val ANIMATION_DURATION = 800

/**
 * NavManager is the central navigation component that manages the navigation graph for the application.
 * It uses Jetpack Compose's Navigation library to define composable destinations and their transitions.
 */
@Composable
fun NavManager() {
    // Create a NavController to manage the navigation state
    val navController = rememberNavController()

    // Set up the NavHost with the starting destination set to HomeScreen.
    NavHost(navController = navController, startDestination = Screens.HomeScreen.name) {

        // HomeScreen route without custom transitions.
        composable(
            route = Screens.HomeScreen.name
        ) {
            // Display HomeScreen and pass the NavController for navigation actions.
            HomeScreen(navController)
        }

        // UpScreen route with custom enter and exit animations.
        composable(
            route = Screens.UpScreen.name,
            enterTransition = {
                // The screen slides into view from the top.
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(ANIMATION_DURATION)  // Animation duration of 500ms.
                )
            },
            exitTransition = {
                // The screen slides out of view upward.
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            }
        ) {
            // Display UpScreen and pass the NavController.
            UpScreen(navController)
        }

        // DownScreen route with custom enter and exit animations.
        composable(
            route = Screens.DownScreen.name,
            enterTransition = {
                // The screen slides into view from the bottom.
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            },
            exitTransition = {
                // The screen slides out of view downward.
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            }
        ) {
            // Display DownScreen and pass the NavController.
            DownScreen(navController)
        }

        // LeftScreen route with custom enter and exit animations.
        composable(
            route = Screens.LeftScreen.name,
            enterTransition = {
                // The screen slides into view from the right.
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            },
            exitTransition = {
                // The screen slides out of view to the left.
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            }
        ) {
            // Display LeftScreen and pass the NavController.
            LeftScreen(navController)
        }

        // RightScreen route with custom enter and exit animations.
        composable(
            route = Screens.RightScreen.name,
            enterTransition = {
                // The screen slides into view from the left.
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            },
            exitTransition = {
                // The screen slides out of view to the right.
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(ANIMATION_DURATION)
                )
            }
        ) {
            // Display RightScreen and pass the NavController.
            RightScreen(navController)
        }
    }
}
