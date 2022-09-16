package com.konexus.classroom.activity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRCDiscussTeacher2
import com.konexus.classroom.modeldata.ModelDiscussTeacher2
import com.mikhaellopez.circularimageview.CircularImageView

class DiscussActivityTeacher3 : AppCompatActivity() {

    private var listdis: ArrayList<ModelDiscussTeacher2>? = ArrayList()
    private var thumb : Bitmap? = null

    private lateinit var imgProfil : CircularImageView
    private lateinit var txName : TextView
    private lateinit var txTime : TextView
    private lateinit var txPost : TextView
    private lateinit var txTitle : TextView
    private lateinit var btnCmmnt : AppCompatButton
    private lateinit var edCmmnt : EditText
    private lateinit var listDiscussion : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discuss_teacher3)
        setSupportActionBar(findViewById(R.id.toolbarTeacherDiscussion3))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)
        init()
        txName.text = intent.extras?.getString("NAME")
        txTime.text = intent.extras?.getString("TIME")
        txPost.text = intent.extras?.getString("POST")
        txTitle.text = "POST'S TITLE"
//        thumb = intent.getParcelableExtra("PICTURE")
//        imgProfil.setImageBitmap(thumb)

        val adpter = AdapterRCDiscussTeacher2(this,listdis)
        listDiscussion.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        listDiscussion.adapter = adpter

        btnCmmnt.setOnClickListener {
            listdis?.add(
                ModelDiscussTeacher2(
                    edCmmnt.text.toString()
                )
            )
            adpter.notifyDataSetChanged()

            edCmmnt.text = null
            edCmmnt.isFocusableInTouchMode = false
        }
    }

    private fun init() {
        imgProfil = findViewById(R.id.img_comment_disscusionteacher3)
        txName = findViewById(R.id.tx_nama_comment)
        txTime = findViewById(R.id.tx_time_comment)
        txPost = findViewById(R.id.tx_text_comment)
        txTitle = findViewById(R.id.tx_title_comment)
        btnCmmnt = findViewById(R.id.btn_post_comment)
        edCmmnt = findViewById(R.id.et_comment)
        listDiscussion = findViewById(R.id.rv_discussionteacher3)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, DiscussActivityTeacher::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}