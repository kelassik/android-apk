package com.konexus.classroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelDiscussTeacher2

class AdapterRCDiscussTeacher2 (val context: Context, private val data : ArrayList<ModelDiscussTeacher2>?)
    : RecyclerView.Adapter<AdapterRCDiscussTeacher2.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {


        val txPosType : TextView

        init {

            txPosType = view.findViewById(R.id.txposdiscussteacher3)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rc_discuss_teacher2, parent, false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.txPosType.text = data?.get(position)?.pos
    }

    override fun getItemCount(): Int = data!!.size
}