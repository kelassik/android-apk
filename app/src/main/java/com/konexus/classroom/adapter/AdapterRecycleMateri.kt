package com.konexus.classroom.adapter

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.MaterialActivity
import com.konexus.classroom.modeldata.ModelDataMateri

class AdapterRecycleMateri (val con : Context, private var data: ArrayList<ModelDataMateri>) :
    RecyclerView.Adapter<AdapterRecycleMateri.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txNama : TextView
        val imgTeacher : ImageView
        val txPel : TextView
        val imgTime : ImageView
        val imageAdd : ImageView
        val txtgl : TextView
        val rvMat : RecyclerView

        init {
            txNama = view.findViewById(R.id.txitemmateri)
            imgTeacher = view.findViewById(R.id.activdiscircleimage_view1)
            txPel = view.findViewById(R.id.txitemmateri1)
            imgTime = view.findViewById(R.id.imgitemmateri)
            imageAdd = view.findViewById(R.id.imgitemAdd)
            txtgl = view.findViewById(R.id.tglitemmateri)
            rvMat = view.findViewById(R.id.rv_submaterial)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_material, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val namaTeach : String = data.get(position).nameTeacher
        val imageTeach : Int = data.get(position).imageTeacher
        val pelajaran : String = data.get(position).les
        val imageWaktu : Int = data.get(position).imageTime
        val tanggal : String = data.get(position).tgl
        var expandView : Boolean = data.get(position).expandView
        val adap = data.get(position).list?.let { AdapterRVSubMaterial(con, it) }

        holder.txNama.text = namaTeach
        holder.imgTeacher.setImageResource(imageTeach)
        holder.txPel.text = pelajaran
        holder.imgTime.setImageResource(imageWaktu)
        holder.txtgl.text = tanggal

        holder.rvMat.layoutManager = LinearLayoutManager(con, RecyclerView.VERTICAL, false)
        holder.rvMat.adapter = adap

        if (!expandView == false){
            holder.rvMat.visibility = View.VISIBLE
            holder.imageAdd.setImageResource(R.drawable.ic_baseline_close)
        }else{
            holder.rvMat.visibility = View.GONE
            holder.imageAdd.setImageResource(R.drawable.ic_baseline_add_circle)
        }

        holder.imageAdd.setOnClickListener {
            data.get(position).expandView = !expandView

            notifyItemChanged(position)
        }
    }
    override fun getItemCount(): Int {
        return data.size
    }

}