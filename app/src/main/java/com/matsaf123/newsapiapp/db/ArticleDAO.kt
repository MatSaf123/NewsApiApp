package com.matsaf123.newsapiapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.matsaf123.newsapiapp.models.Article

@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article : Article) : Long       // Long = id

    @Query("SELECT * FROM articles")
    fun getAllArticles() : LiveData<List<Article>>

    @Delete
    suspend fun delete(article: Article)
}