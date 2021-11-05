package com.khaepah.khaepah_19090017

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RumahSakitAdapter : RecyclerView.Adapter<RumahSakitAdapter.Holder>() {

    private var judul = arrayOf(
        "Kardinah",
        "Harapan Anda",
        "Soesilo"
    )
    private var deskripsi = arrayOf(
        "Alamat: Jalan AIP Jl. KS. Tubun No.2, Kejambon, Kec. Tegal Tim., Kota Tegal, Jawa Tengah 52124",
        "Alamat: Jl. Ababil No.42, Randugunting, Kec. Tegal Sel., Kota Tegal, Jawa Tengah 52131",
        "Jl. dr. Soetomo No. 63  Slawi, Kabupaten Tegal."
    )
    private var gambar = intArrayOf(
        R.drawable.rumah_sakit_kardinah,
        R.drawable.rumah_sakit_harapan_anda,
        R.drawable.rumah_sakit_soesilo
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_rumah_sakit, parent, false)
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