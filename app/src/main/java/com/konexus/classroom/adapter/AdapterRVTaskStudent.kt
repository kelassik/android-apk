package com.konexus.classroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelDataTaskStudent

class AdapterRVTaskStudent (val context : Context, private var data: ArrayList<ModelDataTaskStudent>):
    RecyclerView.Adapter<AdapterRVTaskStudent.ViewHolder>(){


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val img_student : ImageView
        val nama_student : TextView
        val task_student : TextView
        val cardView : CardView

        init {
            img_student = view.findViewById(R.id.circleimage_view_student)
            nama_student = view.findViewById(R.id.namastudent)
            task_student = view.findViewById(R.id.txsubmittask)
            cardView = view.findViewById(R.id.cvitemtaskstudent)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task_student, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image_student : Int = data.get(position).imgStudent
        val nama_murid : String = data.get(position).namaStudent
        val submit_task : String = data.get(position).taskStudent

        holder.img_student.setImageResource(image_student)
        holder.nama_student.text = nama_murid
        holder.task_student.text = submit_task
    }

    override fun getItemCount(): Int {
        return data.size
    }
}