package com.matsaf123.newsapiapp.ui

import androidx.lifecycle.ViewModel
import com.matsaf123.newsapiapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository : NewsRepository
) : ViewModel() {
}