package com.ramonmunoz.unionvierateammanager.feature_news.domain.use_case

import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.InvalidPostException
import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import com.ramonmunoz.unionvierateammanager.feature_news.domain.repository.PostRepository

class AddPost(
    private val postRepository: PostRepository
) {

    @Throws(InvalidPostException::class)
    suspend operator fun invoke(post: Post) {
        if(post.title.isBlank()) {
            throw InvalidPostException("The title of the post can't be empty.")
        }
        if(post.body.isBlank()) {
            throw InvalidPostException("The content of the post can't be empty.")
        }
        postRepository.addPost(post)
    }
}