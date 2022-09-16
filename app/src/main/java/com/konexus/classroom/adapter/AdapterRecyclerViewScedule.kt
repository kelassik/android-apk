package com.konexus.classroom.adapter

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelHari

class AdapterRecyclerViewScedule (private val req : Activity,private val hari : ArrayList<ModelHari>)
    : RecyclerView.Adapter<AdapterRecyclerViewScedule.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val txHari : TextView
        val listRV : RecyclerView
        init {
            txHari = view.findViewById(R.id.tx_hari_scedule)
            listRV = view.findViewById(R.id.rv_scedule_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hari_scedule, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val adapterSceduleTime = AdapterItemScedulRV(req,hari.get(position).scedule)
        Log.e("DATA SCEDULE",""+hari.get(position).scedule)
        holder.txHari.text = hari.get(position).hari
        holder.listRV.layoutManager = LinearLayoutManager(req, RecyclerView.VERTICAL,false)
        holder.listRV.adapter = adapterSceduleTime
    }

    override fun getItemCount()= hari.size
}