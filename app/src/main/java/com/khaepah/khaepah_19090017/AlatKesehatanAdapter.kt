package com.khaepah.khaepah_19090017

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlatKesehatanAdapter : RecyclerView.Adapter<AlatKesehatanAdapter.Holder>() {

    private var judul = arrayOf(
        "Stetoskop",
        "Termometer",
        "Suntik"
    )
    private var deskripsi = arrayOf(
        "Stetoskop adalah alat kesehatan yang paling sering dijumpai. Stetoskop merupakan alat akustik yang fungsinya memeriksa suara di dalam tubuh, seperti detak jantung, suara pergerakan usus dan lambung, dan lainnya. Suara tidak normal yang terdengar lewat stetoskop berguna untuk mendiagnosis penyakit.",
        "Keberadaan termometer hampir selalu dibutuhkan dalam segala situasi medis. Alat ini berfungsi untuk mengukur suhu tubuh dan memiliki beberapa jenis, seperti termometer air raksa (merkuri), termometer digital, dan yang terbaru termometer inframerah.",
        "Dalam istilah medis, alat suntik dikenal dengan nama syringe, spet, atau spuit. Mungkin semua orang pernah melihatnya. Alat ini berbentuk pompa piston sederhana dan berfungsi untuk memasukkan cairan/gas ke dalam tubuh pasien langsung ke pembuluh darah."
    )
    private var gambar = intArrayOf(
        R.drawable.alat_kesehatan_stetoskop,
        R.drawable.alat_kesehatan_termometer,
        R.drawable.alat_kesehatan_suntik
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_alat_kesehatan, parent, false)
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