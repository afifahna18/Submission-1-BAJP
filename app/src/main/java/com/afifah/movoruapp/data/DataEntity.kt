package com.afifah.movoruapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataEntity(
    var name: String,
    var date: String,
    var duration: String,
    var genre: String,
    var rate: String,
    var poster: Int,
    var storyline: String

): Parcelable
