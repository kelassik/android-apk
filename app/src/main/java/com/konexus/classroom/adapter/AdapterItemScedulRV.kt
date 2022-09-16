package com.konexus.classroom.adapter

import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelScedule

class AdapterItemScedulRV(val context: Context,private val data : ArrayList<ModelScedule>)
    : RecyclerView.Adapter<AdapterItemScedulRV.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val txMapel1 : TextView
        val txMapel2 : TextView
        val txMapel3 : TextView
        val txMapel4 : TextView
        val txMapel5 : TextView
        val txMapel6 : TextView
        val txMapel7 : TextView
        val txMapel8 : TextView
        val lyout : LinearLayout
        init {
            lyout = view.findViewById(R.id.ll_item_schedule)
            txMapel1 = view.findViewById(R.id.tx_mapel1)
            txMapel2 = view.findViewById(R.id.tx_mapel2)
            txMapel3 = view.findViewById(R.id.tx_mapel3)
            txMapel4 = view.findViewById(R.id.tx_mapel4)
            txMapel5 = view.findViewById(R.id.tx_mapel5)
            txMapel6 = view.findViewById(R.id.tx_mapel6)
            txMapel7 = view.findViewById(R.id.tx_mapel7)
            txMapel8 = view.findViewById(R.id.tx_mapel8)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_scedule, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txMapel1.text = data.get(position).mapel1
        holder.txMapel2.text = data.get(position).mapel2
        holder.txMapel3.text = data.get(position).mapel3
        holder.txMapel4.text = data.get(position).mapel4
        holder.txMapel5.text = data.get(position).mapel5
        holder.txMapel6.text = data.get(position).mapel6
        holder.txMapel7.text = data.get(position).mapel7
        holder.txMapel8.text = data.get(position).mapel8


        holder.txMapel1.setOnClickListener(View.OnClickListener {
            showDialog(it,position,1)
        })
        holder.txMapel2.setOnClickListener(View.OnClickListener {
            showDialog(it,position,2)
        })
        holder.txMapel3.setOnClickListener(View.OnClickListener {
            showDialog(it,position,3)
        })
        holder.txMapel4.setOnClickListener(View.OnClickListener {
            showDialog(it,position,4)
        })
        holder.txMapel5.setOnClickListener(View.OnClickListener {
            showDialog(it,position,5)
        })
        holder.txMapel6.setOnClickListener(View.OnClickListener {
            showDialog(it,position,6)
        })
        holder.txMapel7.setOnClickListener(View.OnClickListener {
            showDialog(it,position,7)
        })
        holder.txMapel8.setOnClickListener(View.OnClickListener {
            showDialog(it,position,8)
        })

    }

    override fun getItemCount()=data.size

    fun showDialog(view: View,position: Int,ind : Int){
        val editText = EditText(context)
        MaterialAlertDialogBuilder(context)
            .setTitle("Input Your Class")
            .setView(editText)
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                when(ind){
                    1->data.get(position).mapel1 = editText.text.toString()
                    2->data.get(position).mapel2 = editText.text.toString()
                    3->data.get(position).mapel3 = editText.text.toString()
                    4->data.get(position).mapel4 = editText.text.toString()
                    5->data.get(position).mapel5 = editText.text.toString()
                    6->data.get(position).mapel6 = editText.text.toString()
                    7->data.get(position).mapel7 = editText.text.toString()
                    8->data.get(position).mapel8 = editText.text.toString()

                }
                notifyDataSetChanged()
            })
            .setNegativeButton("Cancel", DialogInterface.OnClickListener{dialog, which ->
                dialog.dismiss()
            })
            .show()
    }
}