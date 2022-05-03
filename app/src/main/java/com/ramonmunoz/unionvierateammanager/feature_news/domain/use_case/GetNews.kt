package com.ramonmunoz.unionvierateammanager.feature_news.domain.use_case

import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import com.ramonmunoz.unionvierateammanager.feature_news.domain.repository.PostRepository
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val postRepository: PostRepository
) {
    operator fun invoke(): Flow<List<Post>> {
        return postRepository.getNews()
    }
}