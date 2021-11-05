package com.khaepah.khaepah_19090017

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PasienAdapter : RecyclerView.Adapter<PasienAdapter.Holder>() {

    private var judul = arrayOf(
        "Fahrizal Aditia",
        "Rani Agustine",
        "Desi Purwitasari"
    )
    private var deskripsi = arrayOf(
        "Penyakit Jantung",
        "Penyakit Asam Lambung",
        "Anemia"
    )
    private var gambar = intArrayOf(
        R.drawable.pasien_fahrizal,
        R.drawable.pasien_rani,
        R.drawable.pasien_desi
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_pasien, parent, false)
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