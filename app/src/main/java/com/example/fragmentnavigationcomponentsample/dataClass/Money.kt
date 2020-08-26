package com.example.fragmentnavigationcomponentsample.dataClass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Money(val amount: Int) : Parcelable