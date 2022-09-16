package com.konexus.classroom.activity

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRCDetailComment
import com.konexus.classroom.modeldata.ModelDataDetailComment
import com.mikhaellopez.circularimageview.CircularImageView

class ActivityDetailComment : AppCompatActivity(R.layout.detail_comment_activity) {

    private var listdis: ArrayList<ModelDataDetailComment>? = ArrayList()
    private var thumb : Bitmap? = null

    private lateinit var imgProfil : CircularImageView
    private lateinit var txName : TextView
    private lateinit var txTime : TextView
    private lateinit var txPost : TextView
    private lateinit var txTitle : TextView
    private lateinit var btnCmmnt : AppCompatImageButton
    private lateinit var edCmmnt : EditText
    private lateinit var listDiscussion : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.tb_commnt))

        val actionbar = supportActionBar
        actionbar!!.title = "Comment"
        actionbar.setDisplayHomeAsUpEnabled(true)
        init()
        txName.text = intent.extras?.getString("NAME")
        txTime.text = intent.extras?.getString("TIME")
        txPost.text = intent.extras?.getString("POST")
        txTitle.text = "POST'S TITLE"
//        thumb = intent.getParcelableExtra("PICTURE")
//        imgProfil.setImageBitmap(thumb)

        val adpter = AdapterRCDetailComment(this,listdis)
        listDiscussion.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        listDiscussion.adapter = adpter

        btnCmmnt.setOnClickListener {
            listdis?.add(
                ModelDataDetailComment(
                    intent.extras?.getString("NAME"),
                    edCmmnt.text.toString()
                )
            )
            adpter.notifyDataSetChanged()

            edCmmnt.text = null
            edCmmnt.isFocusableInTouchMode = false
        }
    }

    private fun init() {
        imgProfil = findViewById(R.id.img_profil_commnt)
        txName = findViewById(R.id.tx_nama_comment)
        txTime = findViewById(R.id.tx_time_comment)
        txPost = findViewById(R.id.tx_text_comment)
        txTitle = findViewById(R.id.tx_title_comment)
        btnCmmnt = findViewById(R.id.btn_post_comment)
        edCmmnt = findViewById(R.id.et_comment)
        listDiscussion = findViewById(R.id.rv_comment)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, DiscussionBoardActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}