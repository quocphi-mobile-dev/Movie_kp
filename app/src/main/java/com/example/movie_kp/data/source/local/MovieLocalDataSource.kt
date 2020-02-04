package com.example.movie_kp.data.source.local

import com.example.movie_kp.data.source.local.database.AppDatabase
import com.example.movie_kp.data.source.remote.MovieDataSource

class MovieLocalDataSource(
        private val database: AppDatabase
) : MovieDataSource.Local {

    companion object {

        private var sInstance: MovieLocalDataSource? = null

        @JvmStatic
        fun getInstance(database: AppDatabase): MovieLocalDataSource {
            if (sInstance == null) {
                synchronized(MovieLocalDataSource::javaClass) {

                    sInstance = MovieLocalDataSource(database)
                }
            }
            return sInstance!!
        }

        fun clearInstance() {
            sInstance = null
        }
    }
}