package com.example.movie_kp.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import com.example.movie_kp.data.model.Keyword
import com.example.movie_kp.data.model.Review
import com.example.movie_kp.data.model.Video
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies", primaryKeys = [("id")])
data class Movie(
        var id: Int,
        var page: Int,
        var title: String?,
        var video: Boolean,
        var adult: Boolean,
        var popularity: Float,
        var overview: String? = "",
        var videos: List<Video>? = ArrayList(),
        var reviews: List<Review>? = ArrayList(),
        var keywords: List<Keyword>? = ArrayList(),
        @SerializedName("poster_path")
        var posterPath: String? = null,
        @SerializedName("release_date")
        var releaseDate: String? = "",
        @SerializedName("genre_ids")
        var genreIds: List<Int>? = ArrayList(),
        @SerializedName("original_title")
        var originalTitle: String? = "",
        @SerializedName("original_language")
        var originalLanguage: String? = "",
        @SerializedName("backdrop_path")
        var backdropPath: String? = null,
        @SerializedName("vote_count")
        var voteCount: Int,
            @SerializedName("vote_average")
            var voteAverage: Float
) : Parcelable {

    constructor(source: Parcel) : this(
            source.readInt(),
            source.readInt(),
            source.readString(),
            1 == source.readInt(),
            1 == source.readInt(),
            source.readFloat(),
            source.readString(),
            ArrayList<Video>().apply { source.readList(this as List<*>, Video::class.java.classLoader) },
            ArrayList<Review>().apply { source.readList(this as List<*>, Review::class.java.classLoader) },
            ArrayList<Keyword>().apply { source.readList(this as List<*>, Keyword::class.java.classLoader) },
            source.readString(),
            source.readString(),
            ArrayList<Int>().apply { source.readList(this as List<*>, Int::class.java.classLoader) },
            source.readString(),
            source.readString(),
            source.readString(),
            source.readInt(),
            source.readFloat()) {
    }

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeInt(id)
        writeInt(page)
        writeString(title)
        writeByte(if (adult) 1 else 0)
        writeByte(if (video) 1 else 0)
        writeFloat(popularity)
        writeString(overview)
        writeList(videos)
        writeList(reviews)
        writeList(keywords)
        writeString(posterPath)
        writeString(releaseDate)
        writeString(originalTitle)
        writeString(originalLanguage)
        writeString(backdropPath)
        writeInt(voteCount)
        writeFloat(voteAverage)
    }
    override fun describeContents() = 0

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Movie> = object : Parcelable.Creator<Movie> {
            override fun createFromParcel(source: Parcel): Movie = Movie(source)
            override fun newArray(size: Int): Array<Movie?> = arrayOfNulls(size)
        }
    }
}