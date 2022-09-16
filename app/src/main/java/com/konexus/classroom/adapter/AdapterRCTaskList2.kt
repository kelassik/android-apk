package com.konexus.classroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelDataTaskList2

class AdapterRCTaskList2 (val context: Context, private val data : ArrayList<ModelDataTaskList2>?)
    : RecyclerView.Adapter<AdapterRCTaskList2.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txMateri : TextView
        val txStatus : TextView
        val btncor : Button

        init {
            txMateri = view.findViewById(R.id.txmateritask2)
            txStatus = view.findViewById(R.id.txcomptask2)
            btncor = view.findViewById(R.id.tscorrection)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tak_list2, parent, false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.txMateri.text = data?.get(position)?.namaMateri
        holder.txStatus.text = data?.get(position)?.namaStatus
    }

    override fun getItemCount(): Int = data!!.size
}