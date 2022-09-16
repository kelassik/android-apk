package com.konexus.classroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelNotifTeacher

class AdapterRecycleNotifTeacher (val con : Context, private var data: ArrayList<ModelNotifTeacher>) :
    RecyclerView.Adapter<AdapterRecycleNotifTeacher.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {


        val imgNotification : ImageView
        val notifMsg : ImageView
        val namaNotif : TextView
        val isiNotification : TextView
        val isiNotification1 : TextView


        init {

            imgNotification = view.findViewById(R.id.imgnotif)
            notifMsg = view.findViewById(R.id.notifm)
            namaNotif = view.findViewById(R.id.namenotif)
            isiNotification = view.findViewById(R.id.txmsgnotif)
            isiNotification1 = view.findViewById(R.id.txmsgnotif1)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_notif_teacher, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val imgNotifi : Int = data.get(position).imgnotif
        val msgnotif : Int = data.get(position).notifMsg
        val nama : String = data.get(position).namaNotif
        val isinotif : String = data.get(position).isiNotif
        var isinotif1 : String = data.get(position).isiNotif1


        holder.imgNotification.setImageResource(imgNotifi)
        holder.notifMsg.setImageResource(msgnotif)
        holder.namaNotif.text = nama
        holder.isiNotification.text = isinotif
        holder.isiNotification1.text = isinotif1


    }
    override fun getItemCount(): Int {
        return data.size
    }

}