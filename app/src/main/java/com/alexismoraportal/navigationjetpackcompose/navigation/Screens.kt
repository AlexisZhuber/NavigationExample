package com.alexismoraportal.navigationjetpackcompose.navigation

sealed class Screens(val name: String) {
    object HomeScreen: Screens("home")
    object UpScreen: Screens("upscreen")
    object DownScreen: Screens("downscreen")
    object LeftScreen: Screens("leftscreen")
    object RightScreen: Screens("rightscreen")
}