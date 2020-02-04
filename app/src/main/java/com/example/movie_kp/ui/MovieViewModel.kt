package com.example.movie_kp.ui

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.movie_kp.data.model.entity.Movie

class MovieViewModel : BaseObservable() {

    private lateinit var movie: Movie

    fun setMovie(movie: Movie) {
        this.movie = movie
        notifyChange()
    }

    @Bindable
    fun getMovie() = movie
}