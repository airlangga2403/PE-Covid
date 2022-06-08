package org.d3if2024.pecovid.ui.home.preventions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.adapter.PreventionsAdapter
import org.d3if2024.pecovid.data.preventions.DataPrevention
import org.d3if2024.pecovid.databinding.PreventionsActivityBinding

class PreventionsActivity : AppCompatActivity() {
    private lateinit var binding: PreventionsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PreventionsActivityBinding.inflate(layoutInflater)
        val myDataSet = DataPrevention().loadDataPrevention()
        setContentView(binding.root)

        binding.preventionActivityRecyclerview.adapter = PreventionsAdapter(this, myDataSet)
        with(binding.preventionActivityRecyclerview){
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }

}