package com.ramonmunoz.unionvierateammanager.feature_news.presentation.util

sealed class Screen(val route: String){
    object NewsScreen: Screen("news_screen")
    object AddEditScreen: Screen("add_edit_post_screen")
}
