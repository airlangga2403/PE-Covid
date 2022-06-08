package org.d3if2024.pecovid.model.recovery

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecoveryModel(
    @StringRes val stringTitleId: Int,
    @StringRes val stringResourceId: Int,
    @StringRes val stringContentRecovery: Int,
    @DrawableRes val imageResourceId: Int
)