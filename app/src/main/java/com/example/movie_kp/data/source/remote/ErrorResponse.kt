package com.example.movie_kp.data.source.remote

data class ErrorResponse(
        val statusCode: Int,
        val statusMessage: String,
        val success: Boolean
)