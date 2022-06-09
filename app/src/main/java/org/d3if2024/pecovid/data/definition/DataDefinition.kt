package org.d3if2024.pecovid.data.definition

import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.definition.DefinitionModel

class DataDefinition {
    fun loadDataDefinition(): List<DefinitionModel> {
        return listOf<DefinitionModel>(
           DefinitionModel(R.string.title_def,R.string.penjelasan_def,R.drawable.history_img)
        )
    }
}