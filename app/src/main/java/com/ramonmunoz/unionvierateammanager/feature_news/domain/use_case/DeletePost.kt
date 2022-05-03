package com.ramonmunoz.unionvierateammanager.feature_news.domain.use_case

import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import com.ramonmunoz.unionvierateammanager.feature_news.domain.repository.PostRepository

class DeletePost(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(post: Post) {
        postRepository.deletePost(post)
    }
}