package com.example.movie_kp.data.source.remote

import com.example.movie_kp.data.source.remote.api.MovieService
import com.example.movie_kp.data.source.remote.connet.RetrofitClient
import com.example.movie_kp.data.source.remote.response.MovieResponse
import io.reactivex.Observable

class MovieRemoteDataSource private constructor(
        retrofitClient: RetrofitClient
) : MovieDataSource.Remote {
    private var requestService: MovieService = retrofitClient.getMovieService()!!

    override fun getMoviesTrendingByDay(): Observable<MovieResponse> =
            requestService.getMoviesTrendingByDay()

    override fun getMoviesCategory(category: String?, page: Int): Observable<MovieResponse> =
            requestService.getMoviesCategory(category, page)

    companion object {
        private var sInstance: MovieRemoteDataSource? = null

        @JvmStatic

        fun getInstance(retrofitClient: RetrofitClient): MovieRemoteDataSource {
            if (sInstance == null) {
                synchronized(MovieRemoteDataSource::javaClass) {
                    sInstance = MovieRemoteDataSource(retrofitClient)
                }
            }
            return sInstance!!

        }
        fun clearInstance() { sInstance = null }
    }
}