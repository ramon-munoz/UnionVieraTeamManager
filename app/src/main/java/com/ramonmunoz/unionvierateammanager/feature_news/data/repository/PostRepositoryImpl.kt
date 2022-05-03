package com.ramonmunoz.unionvierateammanager.feature_news.data.repository

import com.ramonmunoz.unionvierateammanager.feature_news.data.data_source.PostDao
import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import com.ramonmunoz.unionvierateammanager.feature_news.domain.repository.PostRepository
import kotlinx.coroutines.flow.Flow

class PostRepositoryImpl(
    private val postDao: PostDao
): PostRepository {
    override fun getNews(): Flow<List<Post>> {
        return postDao.getNews()
    }

    override suspend fun getPostById(id: String): Post? {
        return postDao.getPostById(id)
    }

    override suspend fun addPost(post: Post) {
        return addPost(post)
    }

    override suspend fun deletePost(post: Post) {
        return deletePost(post)
    }

}