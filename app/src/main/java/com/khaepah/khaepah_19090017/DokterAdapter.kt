package com.khaepah.khaepah_19090017

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DokterAdapter : RecyclerView.Adapter<DokterAdapter.Holder>() {

    private var judul = arrayOf(
        "Dokter Gigi",
        "Dokter Hewan",
        "Dokter Kulit"
    )
    private var deskripsi = arrayOf(
        "Dokter gigi adalah seorang dokter yang khusus mempelajari ilmu kesehatan dan penyakit pada gigi dan mulut. Seorang dokter gigi memiliki kompetensi atau keahlian dalam mendiagnosis, mengobati, dan memberikan edukasi tentang pencegahan berbagai masalah kesehatan gigi, gusi, dan mulut.",
        "Dokter hewan disebut juga dengan medik veteriner. Dokter hewan bertugas mencegah, memeriksa, mengobati, dan melakukan perawatan pada hewan dari penyakit.",
        "Dokter kulit adalah seorang dokter yang berperan dalam menangani dan mengobati berbagai kondisi atau penyakit pada kulit"
    )
    private var gambar = intArrayOf(
        R.drawable.dokter_gigi,
        R.drawable.dokter_hewan,
        R.drawable.dokter_kulit
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_dokter, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvJudul.text = judul[position]
        holder.tvDeskripsi.text = deskripsi[position]
        holder.ivGambar.setImageResource(gambar[position])
    }

    override fun getItemCount(): Int {
        return judul.size
    }
}