package com.matsaf123.newsapiapp.ui.models

import com.matsaf123.newsapiapp.ui.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)