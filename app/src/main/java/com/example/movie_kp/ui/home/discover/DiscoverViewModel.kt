package com.example.movie_kp.ui.home.discover

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import com.example.movie_kp.data.annotation.CategoryDef
import com.example.movie_kp.data.model.entity.Movie
import com.example.movie_kp.data.repository.MovieRepository

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DiscoverViewModel constructor(
        private val movieRepository: MovieRepository
) : BaseObservable() {

    val     topTrendingMoviesObservable: ObservableList<Movie> = ObservableArrayList()
    val popularMoviesObservable: ObservableList<Movie> = ObservableArrayList()
    val nowPlayingMoviesObservable: ObservableList<Movie> = ObservableArrayList()
    val upComingMoviesObservable: ObservableList<Movie> = ObservableArrayList()
    val topRateMoviesObservable: ObservableList<Movie> = ObservableArrayList()
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

//    init {
//        loadData()
//    }
//
//    fun loadData() {
//        loadTrendingMovies()
//        loadMovies(CategoryDef.TOP_RATED)
//        loadMovies(CategoryDef.NOW_PLAYING)
//        loadMovies(CategoryDef.POPULAR)
//        loadMovies(CategoryDef.UPCOMING)
//    }
//
//    fun loadTrendingMovies() {
//        val disposable = movieRepository.getMoviesTrendingByDay()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                        {
//                            topTrendingMoviesObservable.clear()
//                            topTrendingMoviesObservable.addAll(it.results.subList(FIRST_INDEX, LAST_INDEX))
//                        }
//                        ,
//                        { throwable -> handleError(throwable) })
//        compositeDisposable.add(disposable)
//    }
//
//    fun loadMovies(category: String = CategoryDef.DEFAULT, page: Int = DEFAULT_PAGE) {
//        val disposable = movieRepository.getMoviesCategory(category, page)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                        {
//                            when (category) {
//                                CategoryDef.TOP_RATED -> {
//                                    topRateMoviesObservable.clear()
//                                    topRateMoviesObservable.addAll(it.results)
//                                }
//                                CategoryDef.NOW_PLAYING -> {
//                                    nowPlayingMoviesObservable.clear()
//                                    nowPlayingMoviesObservable.addAll(it.results)
//                                }
//                                CategoryDef.POPULAR -> {
//                                    popularMoviesObservable.clear()
//                                    popularMoviesObservable.addAll(it.results)
//                                }
//                                CategoryDef.UPCOMING -> {
//                                    upComingMoviesObservable.clear()
//                                    upComingMoviesObservable.addAll(it.results)
//                                }
//                            }
//                        },
//                        { throwable -> handleError(throwable) })
//        compositeDisposable.add(disposable)
//    }
//
//    fun handleError(t: Throwable) {
//
//    }
//
//    fun onCleared() {
//        compositeDisposable.clear()
//    }

    companion object {
        private const val DEFAULT_PAGE = 1
        private const val FIRST_INDEX = 0
        private const val LAST_INDEX = 5
    }
}