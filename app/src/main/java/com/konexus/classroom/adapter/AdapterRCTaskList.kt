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
import com.konexus.classroom.activity.TaskListActivity2
import com.konexus.classroom.modeldata.ModelDataTaskList

class AdapterRCTaskList (val con : Context, private var data: ArrayList<ModelDataTaskList>) :
    RecyclerView.Adapter<AdapterRCTaskList.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val namaStudent : TextView
        val namaStudi : TextView
        val statusTask : TextView
        val cardView : CardView

        init {
            namaStudent = view.findViewById(R.id.namastudent)
            namaStudi = view.findViewById(R.id.txmateritask)
            statusTask = view.findViewById(R.id.txcomptask)
            cardView = view.findViewById(R.id.cvitemtaskstudent)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nama_student : String = data.get(position).namaMurid
        val nama_materi : String = data.get(position).namaMateri
        val status_materi : String = data.get(position).namaStatus

        holder.namaStudent.text = nama_student
        holder.namaStudi.text = nama_materi
        holder.statusTask.text = status_materi

        holder.cardView.setOnClickListener(View.OnClickListener {

            val intent = Intent(con, TaskListActivity2::class.java)
            intent.putExtra("MATERI",nama_materi)

            con.startActivity(intent)

        })
    }

    override fun getItemCount(): Int {
        return data.size
    }
}