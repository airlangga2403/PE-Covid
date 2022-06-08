package org.d3if2024.pecovid.data.recovery

import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.recovery.RecoveryModel

class DataRecovery {
    fun loadDataRecovery(): List<RecoveryModel>{
        return listOf<RecoveryModel>(
            //        RecoveryModel(),
        RecoveryModel(R.string.title_recovery1,R.string.penjelasan_recovery1,R.string.penjelasan_recovery_detail1,R.drawable.gejala_ringan_img),
        RecoveryModel(R.string.title_recovery2,R.string.penjelasan_recovery2,R.string.penjelasan_recovery_detail2,R.drawable.gejala_berat_img)
        )

    }
}