package org.d3if2024.pecovid.model.variations

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class VariationsModel(
    @StringRes val stringTitleId: Int,
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)