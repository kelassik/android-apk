package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVTaskCompleteTeacher4
import com.konexus.classroom.modeldata.ModelTaskCompleteTeacher4

class CompleteActivityAssigTeacher4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_assig_teacher4)
        setSupportActionBar(findViewById(R.id.toolbarTeacherComplete4))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list : RecyclerView = findViewById(R.id.recyclecompleteteacher4)
        var dataStudentComplete4: ArrayList<ModelTaskCompleteTeacher4> = ArrayList()
        dataStudentComplete4.add(
            ModelTaskCompleteTeacher4(
                R.drawable.men,
                "John D",
                "Statistika",
                "XII-4")
        )
        dataStudentComplete4.add(
            ModelTaskCompleteTeacher4(
                R.drawable.women,
                "Nina",
                "Statistika",
                "XII-4")
        )
        dataStudentComplete4.add(
            ModelTaskCompleteTeacher4(
                R.drawable.men,
                "John D",
                "Statistika",
                "XII-4")
        )
        dataStudentComplete4.add(
            ModelTaskCompleteTeacher4(
                R.drawable.women,
                "Nina",
                "Statistika",
                "XII-4")
        )

        val adapterRvTaskStudentComplete4 = AdapterRVTaskCompleteTeacher4(this, dataStudentComplete4)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvTaskStudentComplete4

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