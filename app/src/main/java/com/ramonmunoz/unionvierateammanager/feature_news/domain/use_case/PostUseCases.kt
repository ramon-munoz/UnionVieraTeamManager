package com.ramonmunoz.unionvierateammanager.feature_news.domain.use_case

data class PostUseCases(
    val getNews: GetNews,
    val getPost: GetPost,
    val addPost: AddPost,
    val deletePost: DeletePost
)
