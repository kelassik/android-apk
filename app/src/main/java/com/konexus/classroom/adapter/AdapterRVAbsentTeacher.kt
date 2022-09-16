package com.konexus.classroom.adapter

import android.app.AlertDialog
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelAbsentTeacher

class AdapterRVAbsentTeacher (val context: Context, private val data: ArrayList<ModelAbsentTeacher>) :
    RecyclerView.Adapter<AdapterRVAbsentTeacher.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val img : ImageView
        val imgLine : ImageView
        val txNo : TextView
        val txName : TextView
        init {
            img = view.findViewById(R.id.img_absent_teacher)
            imgLine = view.findViewById(R.id.img_line)
            txName = view.findViewById(R.id.tx_name)
            txNo = view.findViewById(R.id.tx_no)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_teacher_absent, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("DATA ABSENT",""+data.toString())
        var no : Int = position+1
        holder.txNo.text = no.toString()
        holder.txName.text = data.get(position).name
        holder.img.setImageResource(data.get(position).image)
        holder.imgLine.setImageResource(R.drawable.ic_baseline_horizontal_rwhite)

        holder.img.setOnClickListener(View.OnClickListener {
           val builder = AlertDialog.Builder(context)
            builder.setTitle("Absen Murid")
            val absen = arrayOf("Hadir", "Sakit", "Absen", "Izin")
            var checkedItem = 0
            builder.setSingleChoiceItems(absen, checkedItem){ dialog, which ->
                when (which){

                    0 -> checkedItem = 0
                    1 -> checkedItem = 1
                    2 -> checkedItem = 2
                    3 -> checkedItem = 3
                }
            }
            builder.setPositiveButton("OK") { dialog, which ->
                if (checkedItem == 0) {
                    data.get(position).image = R.drawable.ic_baseline_done
                } else if (checkedItem == 1) {
                    data.get(position).image = R.drawable.ic_baseline_medical
                } else if (checkedItem == 2) {
                    data.get(position).image = R.drawable.ic_baseline_close
                } else if (checkedItem == 3) {
                    data.get(position).image = R.drawable.ic_arrow_back
                } else {
                    data.get(position).image = R.drawable.no_image
                }
                notifyDataSetChanged()
            }
            builder.setNegativeButton("Cancel", null)
            val dialog = builder.create()
            dialog.show()
        })
    }
    override fun getItemCount()= data.size
}