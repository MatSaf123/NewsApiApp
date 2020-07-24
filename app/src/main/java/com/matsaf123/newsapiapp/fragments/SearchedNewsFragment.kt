package com.matsaf123.newsapiapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.matsaf123.newsapiapp.R
import com.matsaf123.newsapiapp.ui.NewsActivity
import com.matsaf123.newsapiapp.ui.NewsViewModel

class SearchedNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel : NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}