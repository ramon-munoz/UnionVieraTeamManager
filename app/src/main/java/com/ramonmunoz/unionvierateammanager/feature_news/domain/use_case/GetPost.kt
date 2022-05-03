package com.ramonmunoz.unionvierateammanager.feature_news.domain.use_case

import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import com.ramonmunoz.unionvierateammanager.feature_news.domain.repository.PostRepository

class GetPost(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(id: String): Post? {
        return  postRepository.getPostById(id)
    }
}