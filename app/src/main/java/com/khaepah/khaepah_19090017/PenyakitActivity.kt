package com.khaepah.khaepah_19090017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_dokter.*
import kotlinx.android.synthetic.main.activity_penyakit.*

class PenyakitActivity : AppCompatActivity() {

    private lateinit var adapter: PenyakitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penyakit)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = PenyakitAdapter()

        rv_penyakit.layoutManager = layoutManager
        rv_penyakit.adapter = adapter
    }

}