package com.matsaf123.newsapiapp.repository

import com.matsaf123.newsapiapp.api.RetrofitInstance
import com.matsaf123.newsapiapp.db.ArticleDatabase
import com.matsaf123.newsapiapp.models.Article

class NewsRepository(
    val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode : String, pageNumber : Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsertArticle(article: Article) = db.getArticleDAO().upsert(article)

    suspend fun deleteArticle(article: Article) = db.getArticleDAO().delete(article)

    fun getSavedNews() = db.getArticleDAO().getAllArticles()


}