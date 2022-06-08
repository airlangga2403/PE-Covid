package org.d3if2024.pecovid.ui.home.variations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.adapter.VariationsAdapter
import org.d3if2024.pecovid.data.variations.DataCovid
import org.d3if2024.pecovid.databinding.VariationsActivityBinding

class VariationsActivity: AppCompatActivity() {
    private lateinit var binding: VariationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = VariationsActivityBinding.inflate(layoutInflater)
        val myDataSet = DataCovid().loadDataCovid()
        setContentView(binding.root)

        binding.variationActivityRecyclerview.adapter =  VariationsAdapter(this, myDataSet)
        with(binding.variationActivityRecyclerview){
            addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }


    }
}