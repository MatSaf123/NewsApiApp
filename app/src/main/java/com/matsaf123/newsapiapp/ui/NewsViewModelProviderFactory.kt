package com.matsaf123.newsapiapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.matsaf123.newsapiapp.repository.NewsRepository

class NewsViewModelProviderFactory(
    val newsRepository : NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}