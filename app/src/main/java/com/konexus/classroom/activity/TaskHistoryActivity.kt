package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRecyclerViewTask
import com.konexus.classroom.modeldata.ModelDataTask

class TaskHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_history)
        setSupportActionBar(findViewById(R.id.tbtask))

        val actionbar = supportActionBar
        actionbar!!.title = "Task"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list : RecyclerView = findViewById(R.id.rv_task_history)
        var data: ArrayList<ModelDataTask> = ArrayList()
        data.add(
            ModelDataTask(
                "Task History",
                "4 Agustus",
                "12-15 WIB")
        )
        data.add(
            ModelDataTask(
                "Task History",
                "5 Agustus",
                "10-13 WIB")
        )
        data.add(
            ModelDataTask(
                "Task History",
                "6 Agustus",
                "10-13 WIB")
        )

        val adapterRvTask = AdapterRecyclerViewTask(this,data,this)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvTask
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
        return true
    }
}