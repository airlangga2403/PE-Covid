package org.d3if2024.pecovid.ui.home.recovery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.adapter.RecoveryAdapter
import org.d3if2024.pecovid.data.recovery.DataRecovery
import org.d3if2024.pecovid.databinding.RecoveryActivityBinding

class RecoveryActivity : AppCompatActivity() {
    private lateinit var binding: RecoveryActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecoveryActivityBinding.inflate(layoutInflater)
        val myDataSet = DataRecovery().loadDataRecovery()
        setContentView(binding.root)

        binding.recoveryActivityRecyclerview.adapter = RecoveryAdapter(this, myDataSet)
        with(binding.recoveryActivityRecyclerview){
            addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }
}