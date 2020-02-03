package com.example.movie_kp.data.source.remote

import androidx.annotation.StringDef
import com.example.movie_kp.data.source.remote.CategoryDef.NOW_PLAYING
import com.example.movie_kp.data.source.remote.CategoryDef.POPULAR
import com.example.movie_kp.data.source.remote.CategoryDef.TOP_RATED
import com.example.movie_kp.data.source.remote.CategoryDef.UPCOMING

object CategoryDef{
    const val TOP_RATED ="top_rated"
    const val NOW_PLAYING ="now_playing"
    const val POPULAR ="popular"
    const val UPCOMING ="upcoming"
}
@Retention(AnnotationRetention.SOURCE)
@StringDef(TOP_RATED,NOW_PLAYING,POPULAR,UPCOMING)

annotation class CategoryKey