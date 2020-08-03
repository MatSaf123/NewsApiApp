package com.matsaf123.newsapiapp.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.matsaf123.newsapiapp.R
import com.matsaf123.newsapiapp.ui.NewsActivity
import com.matsaf123.newsapiapp.ui.NewsViewModel
import com.matsaf123.newsapiapp.util.Constants.Companion.CHANNEL_URL
import com.matsaf123.newsapiapp.util.Constants.Companion.SERIES_URL
import kotlinx.android.synthetic.main.fragment_about_app.*

class AboutAppFragment() : Fragment(R.layout.fragment_about_app) {
    lateinit var viewModel : NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = (activity as NewsActivity).viewModel
        super.onViewCreated(view, savedInstanceState)

        buttonChannel.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW)
            urlIntent.data = Uri.parse(CHANNEL_URL)
            super.startActivity(urlIntent)
        }

        buttonSeries.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW)
            urlIntent.data = Uri.parse(SERIES_URL)
            super.startActivity(urlIntent)
        }
    }
}

