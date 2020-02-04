package com.example.movie_kp.data.source.remote.connet

import com.example.movie_kp.data.source.remote.api.Api.getApiKey
import okhttp3.Interceptor
import okhttp3.Response

internal class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request().let {
            it.newBuilder().url(
                    it.url().newBuilder()
                            .addQueryParameter(getApiKey(), "0d99edacbff407a1dd72981760f1163c")
                            .build()
            ).build()
        })
    }
}