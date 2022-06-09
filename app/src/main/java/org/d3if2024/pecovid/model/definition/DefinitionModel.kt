package org.d3if2024.pecovid.model.definition

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DefinitionModel(
    @StringRes val stringTitleId: Int,
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)