package org.d3if2024.pecovid.ui.home.definitionandhistory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.adapter.DefinitionAdapter
import org.d3if2024.pecovid.data.definition.DataDefinition
import org.d3if2024.pecovid.databinding.DefinitionActivityBinding

class DefinitionHistory : AppCompatActivity() {
    private lateinit var binding: DefinitionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DefinitionActivityBinding.inflate(layoutInflater)
        val myDataSet = DataDefinition().loadDataDefinition()
        setContentView(binding.root)
        binding.definitionActivityRecyclerview.adapter = DefinitionAdapter(this, myDataSet)
        with(binding.definitionActivityRecyclerview){
            addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }
}