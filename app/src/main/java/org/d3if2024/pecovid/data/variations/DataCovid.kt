package org.d3if2024.pecovid.data.variations

import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.variations.VariationsModel

class DataCovid {
    fun loadDataCovid():List<VariationsModel>{
        return listOf<VariationsModel>(
            VariationsModel(R.string.title1,R.string.penjelasa_covid1,R.drawable.covid_alpha_img),
            VariationsModel(R.string.title2,R.string.penjelasan_covid2,R.drawable.covid_beta_img),
            VariationsModel(R.string.title3,R.string.penjelasan_covid3,R.drawable.covid_gamma_img),
            VariationsModel(R.string.title4,R.string.penjelasan_covid4,R.drawable.covid_delta_img),
            VariationsModel(R.string.title5,R.string.penjelasan_covid5,R.drawable.covid_epsilon_img),
            VariationsModel(R.string.title6,R.string.penjelasan_covid6,R.drawable.covid_zeta_img),
            VariationsModel(R.string.title7,R.string.penjelasan_covid7,R.drawable.covid_eta_img),
            VariationsModel(R.string.title8,R.string.penjelasan_covid8,R.drawable.covid_theta_img),
            VariationsModel(R.string.title9,R.string.penjelasan_covid9,R.drawable.covid_iota_img),
            VariationsModel(R.string.title10,R.string.penjelasan_covid10,R.drawable.covid_kappa_img),
        )
    }
}