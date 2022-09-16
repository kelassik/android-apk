package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVTaskCompleteTeacher2
import com.konexus.classroom.modeldata.ModelTaskCompleteTeacher2

class CompleteActivityAssigTeacher2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_assig_teacher2)
        setSupportActionBar(findViewById(R.id.toolbarTeacherComplete2))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list : RecyclerView = findViewById(R.id.recyclecompleteteacher2)
        var dataStudentComplete2: ArrayList<ModelTaskCompleteTeacher2> = ArrayList()
        dataStudentComplete2.add(
            ModelTaskCompleteTeacher2(
                R.drawable.men,
                "John D",
                "Statistika",
                "XII-4")
        )
        dataStudentComplete2.add(
            ModelTaskCompleteTeacher2(
                R.drawable.women,
                "Nina",
                "Statistika",
                "XII-4")
        )
        dataStudentComplete2.add(
            ModelTaskCompleteTeacher2(
                R.drawable.women2,
                "Lina",
                "Statistika",
                "XII-4")
        )

        val adapterRvTaskStudentComplete2 = AdapterRVTaskCompleteTeacher2(this, dataStudentComplete2)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvTaskStudentComplete2

    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, CompleteActivityAssigTeacher::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this, CompleteActivityAssigTeacher::class.java)
        startActivity(intent)
        finish()
        return true

    }
}