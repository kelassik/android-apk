package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRCDiscussTeacher
import com.konexus.classroom.modeldata.ModelDiscussTeacher


class DiscussActivityTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discuss_teacher)
        setSupportActionBar(findViewById(R.id.toolbarTeacherDiscussion))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        val relitem : RelativeLayout = findViewById(R.id.relposdiscuss)
        var rvdiscuss : RecyclerView = findViewById(R.id.recyclediscussteacher)
        var datadiscuss: ArrayList<ModelDiscussTeacher> = ArrayList()

        datadiscuss.add(
            ModelDiscussTeacher(
                "Kevin Ryan",
                "4 Hours",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Non pellentesque turpis quam cursus. Purus diam amet non odio ac. Cras egestas bibendum cursus varius tempus iaculis eget arcu nulla. Ornare euismod facilisi arcu id feugiat lacinia eleifend.",
                R.drawable.bg_line_cross
            )
        )
        datadiscuss.add(
            ModelDiscussTeacher(
                "Kevin Ryan",
                "9 Hours",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Non pellentesque turpis quam cursus.",
                R.drawable.imgdiscussteacher
            )
        )

        val adapter = AdapterRCDiscussTeacher(this,datadiscuss)
        rvdiscuss.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvdiscuss.adapter = adapter

        relitem.setOnClickListener {

            val intent = Intent(this, DiscussActivityTeacher2::class.java)
            this.startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("THIS",this.localClassName)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}