package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.ActivityDetailComment
import com.konexus.classroom.activity.DiscussActivityTeacher2
import com.konexus.classroom.activity.DiscussActivityTeacher3
import com.konexus.classroom.modeldata.ModelDiscussTeacher

class AdapterRCDiscussTeacher (private val con: Context, private var data: ArrayList<ModelDiscussTeacher>) :
    RecyclerView.Adapter<AdapterRCDiscussTeacher.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txJudulpos : TextView
        val txtimepos : TextView
        val txisipos : TextView
        val imgpos : ImageView
        val comen : ImageView

        init {
            txJudulpos = view.findViewById(R.id.nameuserdiscuss)
            txtimepos = view.findViewById(R.id.timeuserdiscuss)
            txisipos = view.findViewById(R.id.isiuserdiscuss)
            imgpos = view.findViewById(R.id.imgdiscusteacher)
            comen = view.findViewById(R.id.commentdiscusteacher)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rc_discuss_teacher, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val judul_discussion : String = data.get(position).disjudul
        val waktu_post : String = data.get(position).timepos
        val isi_post : String = data.get(position).posti
        val foto_post : Int = data.get(position).ppost

        holder.txJudulpos.text = judul_discussion
        holder.txtimepos.text = waktu_post
        holder.txisipos.text = isi_post
        holder.imgpos.setImageResource(foto_post)

        holder.comen.setOnClickListener {

            val intent = Intent(con, DiscussActivityTeacher3::class.java)
            intent.putExtra("NAME", judul_discussion)
            intent.putExtra("TIME", waktu_post)
            intent.putExtra("POST", isi_post)

            con.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}