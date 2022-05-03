package com.ramonmunoz.unionvierateammanager.feature_news.data.data_source

import androidx.room.*
import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post
import kotlinx.coroutines.flow.Flow

@Dao
interface PostDao {

    @Query("SELECT * FROM post")
    fun getNews(): Flow<List<Post>>

    @Query("SELECT * FROM post WHERE id = :id")
    suspend fun getPostById(id: String): Post?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPost(post: Post)

    @Delete
    suspend fun deletePost(post: Post)
}