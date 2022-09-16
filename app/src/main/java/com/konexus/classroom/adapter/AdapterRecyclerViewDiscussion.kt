package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.ActivityDetailComment
import com.konexus.classroom.modeldata.ModelDataDiscussion

class AdapterRecyclerViewDiscussion (private val con: Context, private val data: ArrayList<ModelDataDiscussion>) :
    RecyclerView.Adapter<AdapterRecyclerViewDiscussion.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txJudulpos : TextView
        val txtimepos : TextView
        val txisipos : TextView
        val imgpos : ImageView
        val btnCmmnt : ImageButton

        init {
            txJudulpos = view.findViewById(R.id.txnamaitemdis)
            txtimepos = view.findViewById(R.id.txjamitem)
            txisipos = view.findViewById(R.id.txitempost)
            imgpos = view.findViewById(R.id.imgitemdis)
            btnCmmnt = view.findViewById(R.id.imgbutitemdis)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_discuccion_board, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val judul_discussion : String = data.get(position).disjudul
        val waktu_post : String = data.get(position).timepos
        val isi_post : String = data.get(position).posti
        val foto_post : Bitmap? = data.get(position).ppost

        holder.txJudulpos.text = judul_discussion
        holder.txtimepos.text = waktu_post
        holder.txisipos.text = isi_post
        holder.imgpos.setImageBitmap(foto_post)

        holder.btnCmmnt.setOnClickListener {

            val intent = Intent(con, ActivityDetailComment::class.java)
            intent.putExtra("NAME", judul_discussion)
            intent.putExtra("TIME", waktu_post)
            intent.putExtra("POST", isi_post)
            intent.putExtra("PICTURE", foto_post)

            con.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}