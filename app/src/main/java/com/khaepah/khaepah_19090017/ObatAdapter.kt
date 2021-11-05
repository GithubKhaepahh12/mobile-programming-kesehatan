package com.khaepah.khaepah_19090017

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ObatAdapter : RecyclerView.Adapter<ObatAdapter.Holder>() {

    private var judul = arrayOf(
        "Sirup",
        "Salep",
        "Kapsul"
    )
    private var deskripsi = arrayOf(
        "Sirup.  Obat ini berbentuk cairan. Untuk mengonsumsinya kamu perlu mengocok terlebih dahulu sebelum diminum. Pastikan kamu mengonsumsi obat cair dengan ukuran yang tepat, jangan mengira-ngira.",
        "Obat ini merupakan jenis obat luar, bentuk berupa semi padat yang bisa dioleskan pada kulit atau selaput lendir. Bahan jenis obat ini harus larut dan terdispersi pada bahan dasar salep.",
        "Jenis obat ini merupakan yang paling sering didapatkan dari farmasi atau apotek. Adapun perbedaan dari ketiganya adalah kalau jenis obat tablet bentuknya lonjong."
    )
    private var gambar = intArrayOf(
        R.drawable.obat_sirup,
        R.drawable.obat_salep,
        R.drawable.obat_kapsul
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_obat, parent, false)
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