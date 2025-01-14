package com.example.myapplication


/**
 * Created by Abhinay on 14/01/25.
 *
 *
 */
sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object DetailScreen: Screen("detail_screen")

    fun withArgs( vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }

        }

    }
}