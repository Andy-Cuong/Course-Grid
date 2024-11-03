package com.example.coursegrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameId: Int,
    val numOfParticipants: Int,
    @DrawableRes val imageId: Int
)
