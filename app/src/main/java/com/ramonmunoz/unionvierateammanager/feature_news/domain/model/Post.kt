package com.ramonmunoz.unionvierateammanager.feature_news.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Post(
    @PrimaryKey val id: String? = null,
    val title: String,
    val body: String,
    val image: String
)

class InvalidPostException(message: String): Exception(message)

