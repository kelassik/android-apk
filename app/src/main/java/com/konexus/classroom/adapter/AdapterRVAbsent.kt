package com.konexus.classroom.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelAbsent

class AdapterRVAbsent(private val data: ArrayList<ModelAbsent>) :
    RecyclerView.Adapter<AdapterRVAbsent.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val img : ImageView
        val imgLine : ImageView
        val txNo : TextView
        val txName : TextView
        init {
            img = view.findViewById(R.id.img_absent)
            imgLine = view.findViewById(R.id.img_line)
            txName = view.findViewById(R.id.tx_name)
            txNo = view.findViewById(R.id.tx_no)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_absent, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("DATA ABSENT",""+data.toString())
        var no : Int = position+1
        holder.txNo.text = no.toString()
        holder.txName.text = data.get(position).name
        holder.img.setImageResource(data.get(position).image)
        holder.imgLine.setImageResource(R.drawable.ic_baseline_horizontal_rwhite)
    }

    override fun getItemCount()= data.size
}