package com.khaepah.khaepah_19090017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_alat_kesehatan.*

class AlatKesehatanActivity : AppCompatActivity() {

    private lateinit var adapter: AlatKesehatanAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alat_kesehatan)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = AlatKesehatanAdapter()

        rv_alat_kesehatan.layoutManager = layoutManager
        rv_alat_kesehatan.adapter = adapter
    }

}