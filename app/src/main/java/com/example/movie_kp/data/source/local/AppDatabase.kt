package com.example.movie_kp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.movie_kp.data.Movie
import com.example.movie_kp.data.source.local.AppDatabase.Companion.DB_VERSION
import com.example.movie_kp.data.source.local.dao.MovieDao

@Database(entities = [(Movie::class)],version = DB_VERSION,exportSchema = false)
@TypeConverters(value = [Converters::class])
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao

    companion object {
        const val DB_VERSION = 1
    }
}