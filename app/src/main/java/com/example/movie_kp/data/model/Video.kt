package com.example.movie_kp.data.model

import android.os.Parcel
import android.os.Parcelable

data class Video(
        val id: String? = null,
        val name: String? = "",
        val site: String? = "",
        val key: String? = "",
        val size: Int,
        val type: String? = ""
) : Parcelable {

    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.readString(),
            source.readString(),
            source.readInt(),
            source.readString()) {
    }

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(id)
        writeString(key)
        writeString(name)
        writeString(site)
        writeInt(size)
        writeString(type)
    }

    override fun describeContents(): Int = 0

    companion object {
        @JvmField
        var CREATOR: Parcelable.Creator<Video> = object : Parcelable.Creator<Video> {
            override fun createFromParcel(source: Parcel): Video = Video(source)
            override fun newArray(size: Int): Array<Video?> = arrayOfNulls(size)

        }
    }
}