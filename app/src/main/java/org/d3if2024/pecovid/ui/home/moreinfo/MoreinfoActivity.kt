package org.d3if2024.pecovid.ui.home.moreinfo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2024.pecovid.databinding.MoreinfoActivityBinding
import org.d3if2024.pecovid.ui.home.recovery.RecoveryActivity

class MoreinfoActivity : AppCompatActivity() {
    private lateinit var binding: MoreinfoActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoreinfoActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgVascularIndonesia.setOnClickListener{
            webIntent("https://www.vascularindonesia.com/#home")
        }
        binding.imgSehatqIndonesia.setOnClickListener{
            webIntent("https://www.sehatq.com/")
        }
        binding.imgMilvikDokterIndonesia.setOnClickListener {
            webIntent("https://milvik.id/")
        }
        binding.imgProSehat.setOnClickListener {
            webIntent("https://www.prosehat.com/")
        }
        binding.imgYesdok.setOnClickListener {
            webIntent("https://www.yesdok.com/")
        }
        binding.imgLinksehat.setOnClickListener {
            webIntent("https://linksehat.com/")
        }
        binding.imgGoodDoctor.setOnClickListener {
            webIntent("https://www.gooddoctor.co.id/")
        }
        binding.imgGetWell.setOnClickListener {
            webIntent("https://getwell.co.id/")
        }
        binding.imgHaloDoctor.setOnClickListener {
            webIntent("https://www.halodoc.com/")
        }
        binding.imgAlodok.setOnClickListener {
            webIntent("https://www.alodokter.com/")
        }
        binding.imgAidohelth.setOnClickListener {
            webIntent("https://aido.id/")
        }
        binding.imgKliklikdokter.setOnClickListener {
            webIntent("https://www.klikdokter.com/")
        }
    }

    private fun webIntent(uri: String){
        val webIntent: Intent = Uri.parse(uri).let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)
    }
}