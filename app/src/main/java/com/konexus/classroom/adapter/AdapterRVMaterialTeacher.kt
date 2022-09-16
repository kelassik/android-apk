package com.konexus.classroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelMaterialTeacher

class AdapterRVMaterialTeacher (val context : Context, private var data: ArrayList<ModelMaterialTeacher>) :
    RecyclerView.Adapter<AdapterRVMaterialTeacher.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txNama : TextView
        val imgTeacher : ImageView
        val txPel : TextView
        val imgTime : ImageView
        val imageAdd : ImageView
        val txtgl : TextView
        val rvMaterial : RecyclerView

        init {
            txNama = view.findViewById(R.id.txitemmateriteacher)
            imgTeacher = view.findViewById(R.id.imgmaterialteacher)
            txPel = view.findViewById(R.id.txitemmateriteacher1)
            imgTime = view.findViewById(R.id.imgitemmateri)
            imageAdd = view.findViewById(R.id.imgitemAddteacher)
            txtgl = view.findViewById(R.id.tglitemmateri)
            rvMaterial = view.findViewById(R.id.rv_submaterialteacher)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv_material, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val namaTeach : String = data.get(position).nameMaterialTeacher
        val imageTeach : Int = data.get(position).imageMaterialTeacher
        val pelajaran : String = data.get(position).lesMaterial
        val imageWaktu : Int = data.get(position).imageTimeMaterial
        val tanggal : String = data.get(position).tglMaterial
        var expandView : Boolean = data.get(position).expandViewMaterial
        val adapte = data.get(position).listMaterial?.let { AdapterRVSubMaterialTeacher(context, it) }

        holder.txNama.text = namaTeach
        holder.imgTeacher.setImageResource(imageTeach)
        holder.txPel.text = pelajaran
        holder.imgTime.setImageResource(imageWaktu)
        holder.txtgl.text = tanggal

        holder.rvMaterial.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        holder.rvMaterial.adapter = adapte

        if (!expandView == false){
            holder.rvMaterial.visibility = View.VISIBLE
            holder.imageAdd.setImageResource(R.drawable.ic_close)
        }else{
            holder.rvMaterial.visibility = View.GONE
            holder.imageAdd.setImageResource(R.drawable.ic_baseline_add_circle)
        }

        holder.imageAdd.setOnClickListener {
            data.get(position).expandViewMaterial = !expandView

            notifyItemChanged(position)
        }
    }
    override fun getItemCount(): Int {
        return data.size
    }
}