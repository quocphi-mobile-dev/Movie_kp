package com.example.movie_kp.data.source.remote.connet


interface InternetConnectionListener {
    fun onInternetAvailable()
    fun onInternetUnavailable()
}