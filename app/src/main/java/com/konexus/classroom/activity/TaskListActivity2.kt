package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRCTaskList2
import com.konexus.classroom.modeldata.ModelDataTaskList2

class TaskListActivity2 : AppCompatActivity(R.layout.activity_task_list2) {

    private var listTask2: ArrayList<ModelDataTaskList2>? = ArrayList()
//    private var thumb : Bitmap? = null

    private lateinit var taskListcomplete : RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.toolbarTaskTeacher2))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)
        taskListcomplete = findViewById(R.id.recytasklist2)

        listTask2?.add(ModelDataTaskList2(
            intent.extras?.getString("MATERI"),
            "Competence 1")
        )
        listTask2?.add(ModelDataTaskList2(
            intent.extras?.getString("MATERI"),
            "Competence 2")
        )
        listTask2?.add(ModelDataTaskList2(
            intent.extras?.getString("MATERI"),
            "Competence 3")
        )

        val adpter = AdapterRCTaskList2(this,listTask2)
        taskListcomplete.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        taskListcomplete.adapter = adpter
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, TaskListActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}