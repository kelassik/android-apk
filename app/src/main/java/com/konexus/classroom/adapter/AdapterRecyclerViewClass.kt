package com.konexus.classroom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentManager
import com.konexus.classroom.R
import com.konexus.classroom.control.JoinDialogSekolah
import com.konexus.classroom.modeldata.ModelDataRecycleClass

class AdapterRecyclerViewClass (val supportFragment: FragmentManager, private val data: ArrayList<ModelDataRecycleClass>) :
    RecyclerView.Adapter<AdapterRecyclerViewClass.ViewHolder>(){

    private val dialog : JoinDialogSekolah = JoinDialogSekolah()

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txClassName : TextView
        val txClassType : TextView
        val txStudentSize : TextView
        val txTeacherName : TextView
        val btnJoin : AppCompatButton

        init {
            txClassName = view.findViewById(R.id.txtsclass)
            txClassType = view.findViewById(R.id.txtsclass2)
            txStudentSize = view.findViewById(R.id.txtsclass4)
            txTeacherName = view.findViewById(R.id.txrcv2)
            btnJoin = view.findViewById(R.id.btnrvjoin)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rcview_class, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student_size : Int = data.get(position).studentSize
        val class_name : String = data.get(position).className
        val class_type : String = data.get(position).classType
        val teacher_name : String = data.get(position).teacherName

        holder.txClassName.text = class_name
        holder.txClassType.text = class_type
        holder.txStudentSize.text = student_size.toString()
        holder.txTeacherName.text = teacher_name

        holder.btnJoin.setOnClickListener(View.OnClickListener {

            dialog!!.show(supportFragment,"Join Class")
            dialog.activity?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        })
    }

    override fun getItemCount(): Int {
        return data.size
    }
}