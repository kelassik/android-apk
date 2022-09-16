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
import com.konexus.classroom.activity.CompleteActivityAssigTeacher3
import com.konexus.classroom.modeldata.ModelTaskCompleteTeacher4
import com.mikhaellopez.circularimageview.CircularImageView

class AdapterRVTaskCompleteTeacher4 (val context : Context, private var data: ArrayList<ModelTaskCompleteTeacher4>):
    RecyclerView.Adapter<AdapterRVTaskCompleteTeacher4.ViewHolder>(){


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val nama_student_complete4 : TextView
        val img_student_complete4 : CircularImageView
        val lesson_complete4 : TextView
        val class_Complete4 : TextView


        init {
            nama_student_complete4 = view.findViewById(R.id.namastudentcomplete4)
            img_student_complete4 = view.findViewById(R.id.complete_student4)
            lesson_complete4 = view.findViewById(R.id.txlessoncomplete4)
            class_Complete4 = view.findViewById(R.id.txclasscomplete4)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_complete_assig_teacher4, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val img_student : Int = data.get(position).img_student4
        val nama_student_c : String = data.get(position).namaStudent4
        val lesson_c : String = data.get(position).namaPelajaran4
        val class_c : String = data.get(position).namaClass4

        holder.img_student_complete4.setImageResource(img_student)
        holder.nama_student_complete4.text = nama_student_c
        holder.lesson_complete4.text = lesson_c
        holder.class_Complete4.text = class_c

    }

    override fun getItemCount(): Int {
        return data.size
    }
}