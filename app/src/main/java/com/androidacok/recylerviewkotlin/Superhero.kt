package com.androidacok.recylerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val titleSuperhero: String,
    val descSuperhero: String,
) : Parcelable {

}
