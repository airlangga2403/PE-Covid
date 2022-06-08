package org.d3if2024.pecovid.data.preventions

import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.preventions.PreventionsModel

class DataPrevention {
    fun loadDataPrevention(): List<PreventionsModel> {
        return listOf<PreventionsModel>(
            PreventionsModel(
                R.string.title_preventions1,
                R.string.penjelasan_preventions1,
                R.drawable.prevention_mencuci_img
            ),
            PreventionsModel(
                R.string.title_preventions2,
                R.string.penjelasan_preventions2,
                R.drawable.prevention_menggunakanmasker_img
            ),
            PreventionsModel(
                R.string.title_preventions3,
                R.string.penjelasan_preventions3,
                R.drawable.prevention_jagatubuh_img
            ),
            PreventionsModel(
                R.string.title_preventions4,
                R.string.penjelasan_preventions4,
                R.drawable.prevention_distancing_img
            ),
            PreventionsModel(
                R.string.title_preventions5,
                R.string.penjelasan_preventions5,
                R.drawable.prevention_membersihkanrumah_img
            )

        )
    }
}