package com.khaepah.khaepah_19090017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_dokter.*
import kotlinx.android.synthetic.main.activity_pasien.*

class PasienActivity : AppCompatActivity() {

    private lateinit var adapter: PasienAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasien)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = PasienAdapter()

        rv_pasien.layoutManager = layoutManager
        rv_pasien.adapter = adapter
    }

}