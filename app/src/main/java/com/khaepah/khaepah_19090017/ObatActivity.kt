package com.khaepah.khaepah_19090017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_obat.*

class ObatActivity : AppCompatActivity() {

    private lateinit var adapter: ObatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obat)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = ObatAdapter()

        rv_obat.layoutManager = layoutManager
        rv_obat.adapter = adapter
    }

}