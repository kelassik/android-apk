package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.TaskHistoryActivity
import com.konexus.classroom.activity.ViewMaterialActivity
import com.konexus.classroom.modeldata.ModelSubMaterialTeacher

class AdapterRVSubMaterialTeacher (val con : Context, private var data: ArrayList<ModelSubMaterialTeacher>) :
    RecyclerView.Adapter<AdapterRVSubMaterialTeacher.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txNamaDownload : TextView
        val imgActionDownload : ImageView
        val txNamaView : TextView
        val imgActionView : ImageView

        init {
            txNamaDownload = view.findViewById(R.id.tx_submaterialteacher)
            imgActionDownload = view.findViewById(R.id.img_submaterialteacher)
            txNamaView = view.findViewById(R.id.tx_submaterialteacher1)
            imgActionView = view.findViewById(R.id.img_submaterialteacher1)
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv_sub_material, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nama : String = data.get(position).nameMaterialDownload
        val image : Int = data.get(position).imgMaterialDownload
        val link : String = data.get(position).linkMaterial
        val nama2 : String = data.get(position).nameMaterialView
        val image2 : Int = data.get(position).imgMaterialView

        holder.txNamaDownload.text = nama
        holder.imgActionDownload.setImageResource(image)
        holder.txNamaView.text = nama2
        holder.imgActionView.setImageResource(image2)


        holder.imgActionView.setOnClickListener{
            val intent = Intent(con, ViewMaterialActivity::class.java)
            con.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = data.size
}