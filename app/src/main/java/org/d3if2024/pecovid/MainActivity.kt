package org.d3if2024.pecovid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2024.pecovid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}