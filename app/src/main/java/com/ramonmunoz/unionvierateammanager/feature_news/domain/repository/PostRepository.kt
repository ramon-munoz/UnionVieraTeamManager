package com.ramonmunoz.unionvierateammanager.feature_news.domain.repository

import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import kotlinx.coroutines.flow.Flow

interface PostRepository {

    fun getNews(): Flow<List<Post>>

    suspend fun getPostById(id: String): Post?

    suspend fun addPost(post: Post)

    suspend fun deletePost(post: Post)
}