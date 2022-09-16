package com.konexus.classroom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.control.RVDialogMenuHome

class AdapterRecyclerViewHome (private val supportFragmentManeger : FragmentManager,
                               private val data: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterRecyclerViewHome.ViewHolder>(){

    private val dialog : RVDialogMenuHome = RVDialogMenuHome()

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val img : ImageView
        val crv : CardView
        init {
            img = view.findViewById(R.id.imgrv)
            crv = view.findViewById(R.id.cv_menu_home)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rcview_home, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gambar : Int = data.get(position)

        holder.img.setImageResource(gambar)

        holder.crv.setOnClickListener(View.OnClickListener {
            dialog!!.show(supportFragmentManeger,"Your Class")
            dialog.activity?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        })
    }
    override fun getItemCount()= data.size
}