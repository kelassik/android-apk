package com.konexus.classroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelDataDetailComment

class AdapterRCDetailComment(val context: Context, private val data : ArrayList<ModelDataDetailComment>?)
    : RecyclerView.Adapter<AdapterRCDetailComment.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txName : TextView
        val txPosType : TextView

        init {
            txName = view.findViewById(R.id.tx_nama_detail_comment)
            txPosType = view.findViewById(R.id.tx_pos_detail_comment)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_detail_comment, parent, false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.txName.text = data?.get(position)?.name
        holder.txPosType.text = data?.get(position)?.pos
    }

    override fun getItemCount(): Int = data!!.size
}