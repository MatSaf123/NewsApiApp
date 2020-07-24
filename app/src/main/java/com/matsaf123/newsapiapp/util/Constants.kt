package com.matsaf123.newsapiapp.util

import com.matsaf123.newsapiapp.R

class Constants {
    companion object {
        const val API_KEY = R.string.API_KEY_s.toString()  //  it's safer than putting the API key directly in here (?)
        const val BASE_URL = "https://newsapi.org"
    }
}