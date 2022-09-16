package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVTaskStudent
import com.konexus.classroom.modeldata.ModelDataTaskStudent

class AssigmentActivityTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assigment_teacher)
        setSupportActionBar(findViewById(R.id.toolbarTeacher))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        val task : CardView = findViewById(R.id.waiting)
        val task2 : RelativeLayout = findViewById(R.id.ongoing)
        val task3 : RelativeLayout = findViewById(R.id.inprogress)
        val task4 : RelativeLayout = findViewById(R.id.complete)
        var list : RecyclerView = findViewById(R.id.rctaskstudent)
        var dataStudent: ArrayList<ModelDataTaskStudent> = ArrayList()
        dataStudent.add(
            ModelDataTaskStudent(
                R.drawable.men,
                "John D",
                "Submit task now")
        )
        dataStudent.add(
            ModelDataTaskStudent(
                R.drawable.women,
                "Nina H",
                "Submit task 2s")
        )

        val adapterRvTaskStudent = AdapterRVTaskStudent(this, dataStudent)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvTaskStudent

        task.setOnClickListener {
            val intent = Intent(this, UploadMateriActivity::class.java)
            startActivity(intent)
            finish()

         }
        task2.setOnClickListener {
            val intent = Intent(this, OngoingActivityAssigmentTeacher::class.java)
            startActivity(intent)
            finish()
        }
        task3.setOnClickListener {
            val intent = Intent(this, InprogressActivityTeacher::class.java)
            startActivity(intent)
            finish()
        }
        task4.setOnClickListener {
            val intent = Intent(this, CompleteActivityAssigTeacher::class.java)
            startActivity(intent)
            finish()
        }
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