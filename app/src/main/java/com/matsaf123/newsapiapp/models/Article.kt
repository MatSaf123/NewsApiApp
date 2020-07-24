package com.matsaf123.newsapiapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "articles"
)

data class Article(

    @PrimaryKey(autoGenerate = true)
    var id : Int? = null,       // for saved articles

    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)