package com.example.movie_kp.data.source.remote

import com.example.movie_kp.BuildConfig
import com.example.movie_kp.data.source.remote.Api.getApiKey
import okhttp3.Interceptor
import okhttp3.Response

internal class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request().let {
            it.newBuilder().url(
                    it.url().newBuilder()
                            .addQueryParameter(getApiKey(), BuildConfig.MOVIE_DB_API_KEY)
                            .build()
            ).build()
        })
    }
}