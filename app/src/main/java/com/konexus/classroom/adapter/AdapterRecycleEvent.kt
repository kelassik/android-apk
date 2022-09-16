package com.konexus.classroom.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R

class AdapterRecycleEvent (val con : Context,private val data: ArrayList<String>, val onClick : ViewOnClick ) :
    RecyclerView.Adapter<AdapterRecycleEvent.ViewHolder>(){

    private var pos : Int = 0

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txevent : TextView
        val rel : RelativeLayout
        init {
            txevent = view.findViewById(R.id.tx_event2)
            rel = view.findViewById(R.id.relevent)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rc_event, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val text : String = data.get(position)

        holder.txevent.text = text

        holder.rel.setOnClickListener(View.OnClickListener {
            onClick.onItemClick(position+1)
//            setBG(position,holder)

        })

    }

    override fun getItemCount(): Int {
        return data.size
    }

    @SuppressLint("ResourceAsColor")
    private fun setBG(position : Int, hol: ViewHolder){
        setBGAll(hol)
        Log.e("POS/POSISI",""+pos.toString()+"/"+position.toString())

        if (position != pos){
            pos = position
            hol.rel.setBackgroundResource(R.drawable.bg_card_blue)
            hol.txevent.setTextColor(R.color.white)
            notifyItemChanged(position)
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun setBGAll(hol: ViewHolder){
        hol.rel.setBackgroundResource(R.drawable.bg_card_white)
        hol.txevent.setTextColor(R.color.black)
        notifyDataSetChanged()
    }

}