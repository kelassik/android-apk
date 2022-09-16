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
import com.konexus.classroom.modeldata.ModelOngoingAssigTeacher

class adapterRVongoingTeacher (val context : Context, private var data: ArrayList<ModelOngoingAssigTeacher>):
    RecyclerView.Adapter<adapterRVongoingTeacher.ViewHolder>(){


        class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

            val img_student_ongoing : ImageView
            val nama_student_ongoing : TextView
            val task_student_ongoing : TextView
            val cardView : CardView

            init {
                img_student_ongoing = view.findViewById(R.id.ongoing_student)
                nama_student_ongoing = view.findViewById(R.id.namastudentongoing)
                task_student_ongoing = view.findViewById(R.id.txlesson)
                cardView = view.findViewById(R.id.cvitemassigteacher)
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_assigment_ongoing, parent, false)

            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val image_student : Int = data.get(position).imgOngoing
            val nama_murid : String = data.get(position).nameOngoing
            val task : String = data.get(position).lessonOngoing

            holder.img_student_ongoing.setImageResource(image_student)
            holder.nama_student_ongoing.text = nama_murid
            holder.task_student_ongoing.text = task
        }

        override fun getItemCount(): Int {
            return data.size
        }
}