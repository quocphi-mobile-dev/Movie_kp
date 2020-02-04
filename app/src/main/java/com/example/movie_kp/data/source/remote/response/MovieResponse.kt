package com.example.movie_kp.data.source.remote.response

import com.example.movie_kp.data.model.entity.Movie
import com.google.gson.annotations.SerializedName

data class MovieResponse(
        val page: Int,
        val result: List<Movie>,
        @SerializedName("total_results")
        val totalResults: Int,
        @SerializedName("total_pages")
        val totalPage: Int
)