package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVTaskCompleteTeacher
import com.konexus.classroom.modeldata.ModelTaskCompleteTeacher

class CompleteActivityAssigTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_assig_teacher)
        setSupportActionBar(findViewById(R.id.toolbarTeacherComplete))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list : RecyclerView = findViewById(R.id.recyclecompleteteacher)
        var dataStudentComplete: ArrayList<ModelTaskCompleteTeacher> = ArrayList()
        dataStudentComplete.add(
            ModelTaskCompleteTeacher(
                "Statistika",
                "competence test 1")
        )
        dataStudentComplete.add(
            ModelTaskCompleteTeacher(
                "Statistika",
                "competence test 2")
        )
        dataStudentComplete.add(
            ModelTaskCompleteTeacher(
                "Statistika",
                "competence test 3")
        )
        dataStudentComplete.add(
            ModelTaskCompleteTeacher(
                "Statistika",
                "competence test 4")
        )

        val adapterRvTaskStudentComplete = AdapterRVTaskCompleteTeacher(this, dataStudentComplete)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvTaskStudentComplete

    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, AssigmentActivityTeacher::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this, AssigmentActivityTeacher::class.java)
        startActivity(intent)
        finish()
        return true
    }
}