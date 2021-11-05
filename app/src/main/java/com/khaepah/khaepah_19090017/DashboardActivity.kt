package com.khaepah.khaepah_19090017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        setMenu()
    }

    fun setMenu() {
        cv_dokter.setOnClickListener {
            startActivity(Intent(this, DokterActivity::class.java))
        }
        cv_pasien.setOnClickListener {
            startActivity(Intent(this, PasienActivity::class.java))
        }
        cv_penyakit.setOnClickListener {
            startActivity(Intent(this, PenyakitActivity::class.java))
        }
        cv_obat.setOnClickListener {
            startActivity(Intent(this, ObatActivity::class.java))
        }
        cv_alat_kesehatan.setOnClickListener {
            startActivity(Intent(this, AlatKesehatanActivity::class.java))
        }
        cv_rumah_sakit.setOnClickListener {
            startActivity(Intent(this, RumahSakitActivity::class.java))
        }
    }
}