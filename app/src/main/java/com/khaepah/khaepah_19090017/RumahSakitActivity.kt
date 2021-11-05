package com.khaepah.khaepah_19090017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rumah_sakit.*

class RumahSakitActivity : AppCompatActivity() {

    private lateinit var adapter: RumahSakitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumah_sakit)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = RumahSakitAdapter()

        rv_rumah_sakit.layoutManager = layoutManager
        rv_rumah_sakit.adapter = adapter
    }

}