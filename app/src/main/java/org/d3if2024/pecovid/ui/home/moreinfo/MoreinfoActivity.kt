package org.d3if2024.pecovid.ui.home.moreinfo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2024.pecovid.databinding.MoreinfoActivityBinding
import org.d3if2024.pecovid.ui.home.recovery.RecoveryActivity

class MoreinfoActivity : AppCompatActivity() {
    private lateinit var binding: MoreinfoActivityBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoreinfoActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgVascularIndonesia.setOnClickListener{
            val webIntent: Intent = Uri.parse("https://www.android.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)

        }
    }
}