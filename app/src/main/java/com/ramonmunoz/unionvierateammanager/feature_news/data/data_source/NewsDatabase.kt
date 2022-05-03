package com.ramonmunoz.unionvierateammanager.feature_news.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ramonmunoz.unionvierateammanager.feature_news.domain.model.Post

@Database(
    entities = [Post::class],
    version = 1
)
abstract class NewsDatabase: RoomDatabase() {

    abstract val postDao: PostDao

    companion object {
        const val DATABASE_NAME = "news_db"
    }
}