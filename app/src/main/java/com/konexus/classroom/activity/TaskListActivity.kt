package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRCTaskList
import com.konexus.classroom.adapter.AdapterRVTaskStudent
import com.konexus.classroom.modeldata.ModelDataTaskList
import com.konexus.classroom.modeldata.ModelDataTaskStudent

class TaskListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_list)
        setSupportActionBar(findViewById(R.id.toolbarTaskTeacher))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list : RecyclerView = findViewById(R.id.recytasklist)
        var dataTaskList: ArrayList<ModelDataTaskList> = ArrayList()
        dataTaskList.add(
            ModelDataTaskList(
                "John D",
                "Statistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "Nina H",
                "Satistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "Dida",
                "Statistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "Nana",
                "Satistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "John D",
                "Statistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "Nina H",
                "Satistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "Dida",
                "Statistika",
                "XII-4")
        )
        dataTaskList.add(
            ModelDataTaskList(
                "Nana",
                "Satistika",
                "XII-4")
        )

        val adapterRvTaskStudent = AdapterRCTaskList(this, dataTaskList)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvTaskStudent

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, AssigmentActivityTeacher::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this,AssigmentActivityTeacher::class.java)
        startActivity(intent)
        finish()
        return true
    }
}