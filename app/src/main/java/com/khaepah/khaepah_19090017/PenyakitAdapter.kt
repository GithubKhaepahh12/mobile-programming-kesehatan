package com.khaepah.khaepah_19090017

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PenyakitAdapter : RecyclerView.Adapter<PenyakitAdapter.Holder>() {

    private var judul = arrayOf(
        "Covid 19",
        "Jantung",
        "Asam Lambung"
    )
    private var deskripsi = arrayOf(
        "COVID-19 adalah penyakit yang disebabkan oleh virus severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2). COVID-19 dapat menyebabkan gangguan sistem pernapasan, mulai dari gejala yang ringan seperti flu, hingga infeksi paru-paru, seperti pneumonia.",
        "Penyakit jantung adalah kondisi ketika jantung mengalami gangguan. Bentuk gangguan itu sendiri bermacam-macam, bisa berupa gangguan pada pembuluh darah jantung, katup jantung, atau otot jantung. Penyakit jantung juga dapat disebabkan oleh infeksi atau kelainan lahir.",
        "Penyakit asam lambung atau gastroesophageal reflux disease (GERD) adalah munculnya rasa terbakar di dada akibat asam lambung naik ke kerongkongan. Gejala penyakit asam lambung muncul minimal 2 kali dalam seminggu."
    )
    private var gambar = intArrayOf(
        R.drawable.penyakit_covid_19,
        R.drawable.penyakit_jantung,
        R.drawable.penyakit_asam_lambung
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_penyakit, parent, false)
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