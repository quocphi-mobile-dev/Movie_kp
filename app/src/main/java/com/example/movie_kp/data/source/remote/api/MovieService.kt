package com.example.movie_kp.data.source.remote.api

import com.example.movie_kp.data.source.remote.response.MovieResponse
import com.example.movie_kp.data.source.remote.ApiResponse
import com.example.movie_kp.data.annotation.CategoryKey
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("trending/movie/day")
    fun getMoviesTrendingByDay(): Observable<MovieResponse>

    @GET("movie/{type}?language=en&sort_by=popularity.desc")
    fun getMoviesCategory(@Path("type") @CategoryKey categoryKey: String?, @Query("page") page: Int):
            Observable<MovieResponse>
}