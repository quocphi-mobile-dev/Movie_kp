package com.example.movie_kp.data.model

import android.os.Parcel
import android.os.Parcelable

data class Review(
        var id: String? = null,
        var author: String? = "",
        var content: String? = "",
        var url: String? = null
) : Parcelable {
    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.readString(),
            source.readString()) {
    }

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(id)
        writeString(author)
        writeString(content)
        writeString(url)
    }

    override fun describeContents(): Int = 0

    @JvmField
    val CREATOR: Parcelable.Creator<Review> = object : Parcelable.Creator<Review> {
        override fun createFromParcel(parcel: Parcel): Review = Review(parcel)
        override fun newArray(size: Int): Array<Review?> = arrayOfNulls(size)
    }
}
