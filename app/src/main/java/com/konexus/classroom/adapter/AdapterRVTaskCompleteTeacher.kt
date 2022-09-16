package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.AssigmentActivity
import com.konexus.classroom.activity.CompleteActivityAssigTeacher2
import com.konexus.classroom.activity.TaskListActivity2
import com.konexus.classroom.modeldata.ModelTaskCompleteTeacher

class AdapterRVTaskCompleteTeacher (val context : Context, private var data: ArrayList<ModelTaskCompleteTeacher>):
    RecyclerView.Adapter<AdapterRVTaskCompleteTeacher.ViewHolder>(){


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val nama_lesson_complete : TextView
        val status_lesson: TextView
        val btn_complete : AppCompatButton


        init {
            nama_lesson_complete = view.findViewById(R.id.lessoncomplete)
            status_lesson = view.findViewById(R.id.txcompetencetest)
            btn_complete = view.findViewById(R.id.btncompleteassigtecher)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_complete_assig_teacher, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nama_lesson : String = data.get(position).lessonTask
        val status : String = data.get(position).lessonStatus

        holder.nama_lesson_complete.text = nama_lesson
        holder.status_lesson.text = status

        holder.btn_complete.setOnClickListener {

            val intent = Intent(context, CompleteActivityAssigTeacher2::class.java)
            intent.putExtra("Lesson",nama_lesson)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}