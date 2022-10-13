package com.example.entrepreneurshipbooks.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class EntrepreneurshipBook(
@StringRes val stringResourceId: Int,
@StringRes val stringResourceId2: Int,
@DrawableRes  val imageResourceId: Int
)