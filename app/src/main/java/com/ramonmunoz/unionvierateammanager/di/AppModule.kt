package com.ramonmunoz.unionvierateammanager.di

import android.app.Application
import androidx.room.Room
import com.ramonmunoz.unionvierateammanager.feature_news.data.data_source.NewsDatabase
import com.ramonmunoz.unionvierateammanager.feature_news.data.repository.PostRepositoryImpl
import com.ramonmunoz.unionvierateammanager.feature_news.domain.repository.PostRepository
import com.ramonmunoz.unionvierateammanager.feature_news.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NewsDatabase {
        return Room.databaseBuilder(
            app,
            NewsDatabase::class.java,
            NewsDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providePostRepository(db: NewsDatabase): PostRepository {
        return PostRepositoryImpl(db.postDao)
    }

    @Provides
    @Singleton
    fun providePostUseCases(repository: PostRepository): PostUseCases {
        return PostUseCases(
            getNews = GetNews(repository),
            getPost = GetPost(repository),
            addPost = AddPost(repository),
            deletePost = DeletePost(repository)

        )
    }
}