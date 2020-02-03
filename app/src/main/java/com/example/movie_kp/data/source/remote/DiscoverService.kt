package com.example.movie_kp.data.source.remote

import com.example.movie_kp.data.network.MovieResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DiscoverService {
    @GET("trending/movie/day")
    fun fetchMoviesTrendingByDay(): Flowable<MovieResponse>

    @GET("movie/{type}?language=en&sort_by=popularity.desc")
    fun fetchMoviesCategory(@Path("type") @CategoryKey categoryKey: String?, @Query("page") page: Int): Flowable<MovieResponse>
}