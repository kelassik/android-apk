package com.konexus.classroom.adapter

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.MaterialActivity
import com.konexus.classroom.modeldata.ModelSubMaterial

class AdapterRVSubMaterial (val con : Context, private var data: ArrayList<ModelSubMaterial>) :
    RecyclerView.Adapter<AdapterRVSubMaterial.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txNama : TextView
        val imgAction : ImageView

        init {
            txNama = view.findViewById(R.id.tx_submaterial)
            imgAction = view.findViewById(R.id.img_submaterial)
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_submaterial, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nama : String = data.get(position).nameMaterial
        val image : Int = data.get(position).imgMat
        val link : String = data.get(position).linkMaterial

        holder.txNama.text = nama
        holder.imgAction.setImageResource(image)
    }

    override fun getItemCount(): Int = data.size
}