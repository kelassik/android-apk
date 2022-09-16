package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.AssigmentActivity
import com.konexus.classroom.activity.TaskHistoryActivity
import com.konexus.classroom.modeldata.ModelDataTask

class AdapterRecyclerViewTask (val con : Context, private var data: ArrayList<ModelDataTask>,
                               val activity: TaskHistoryActivity) :
    RecyclerView.Adapter<AdapterRecyclerViewTask.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txJudul : TextView
        val txCal : TextView
        val txTime : TextView
        val cardView : CardView

        init {
            txJudul = view.findViewById(R.id.txitemtask)
            txCal = view.findViewById(R.id.txitemtask2)
            txTime = view.findViewById(R.id.txitemtask3)
            cardView = view.findViewById(R.id.cvitemtask)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycleview_task, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val judul_task : String = data.get(position).judulTask
        val calender : String = data.get(position).CalTask
        val time : String = data.get(position).TimeTask

        holder.txJudul.text = judul_task
        holder.txCal.text = calender
        holder.txTime.text = time

        holder.cardView.setOnClickListener {

            val intent: Intent = Intent(con, AssigmentActivity::class.java)
            intent.putExtra("POSISI", position + 1)
            con.startActivity(intent)
            activity.finish()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}