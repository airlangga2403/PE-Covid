package org.d3if2024.pecovid.model.preventions

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class PreventionsModel(
    @StringRes val stringTitleId: Int,
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)