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
import com.konexus.classroom.activity.CompleteActivityAssigTeacher2
import com.konexus.classroom.activity.CompleteActivityAssigTeacher3
import com.konexus.classroom.modeldata.ModelTaskCompleteTeacher2
import com.mikhaellopez.circularimageview.CircularImageView

class AdapterRVTaskCompleteTeacher2 (val context : Context, private var data: ArrayList<ModelTaskCompleteTeacher2>):
    RecyclerView.Adapter<AdapterRVTaskCompleteTeacher2.ViewHolder>(){


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val nama_student_complete : TextView
        val img_student_complete : CircularImageView
        val lesson_complete : TextView
        val class_Complete : TextView
        val btn_coreecction_complete : AppCompatButton


        init {
            img_student_complete = view.findViewById(R.id.complete_student2)
            nama_student_complete = view.findViewById(R.id.namastudentcomplete)
            lesson_complete = view.findViewById(R.id.txlessoncomplete)
            class_Complete = view.findViewById(R.id.txclasscomplete)
            btn_coreecction_complete = view.findViewById(R.id.btncompleteassigtechercorection)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_complete_assig_teacher2, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val img_student : Int = data.get(position).img_student
        val nama_student_c : String = data.get(position).namaStudent
        val lesson_c : String = data.get(position).namaPelajaran
        val class_c : String = data.get(position).namaClass

        holder.img_student_complete.setImageResource(img_student)
        holder.nama_student_complete.text = nama_student_c
        holder.lesson_complete.text = lesson_c
        holder.class_Complete.text = class_c

        holder.btn_coreecction_complete.setOnClickListener {

            val intent = Intent(context, CompleteActivityAssigTeacher3::class.java)
            intent.putExtra("Lesson",lesson_c)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}