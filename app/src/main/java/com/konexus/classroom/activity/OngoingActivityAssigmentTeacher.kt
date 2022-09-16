package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVTaskStudent
import com.konexus.classroom.adapter.adapterRVongoingTeacher
import com.konexus.classroom.modeldata.ModelDataTaskStudent
import com.konexus.classroom.modeldata.ModelOngoingAssigTeacher

class OngoingActivityAssigmentTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ongoing_assigment_teacher)
        setSupportActionBar(findViewById(R.id.toolbarTeacherOngoing))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        var listOngoing : RecyclerView = findViewById(R.id.recycleassigongoing)
        var dataStudentOngoing : ArrayList<ModelOngoingAssigTeacher> = ArrayList()
        dataStudentOngoing.add(
            ModelOngoingAssigTeacher(
                R.drawable.men,
                "John D",
                "Stastistika")
        )
        dataStudentOngoing.add(
            ModelOngoingAssigTeacher(
                R.drawable.women,
                "Nina H",
                "Stastistika")
        )

        val adapterRvOngoing= adapterRVongoingTeacher(this, dataStudentOngoing)
        listOngoing.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        listOngoing.adapter = adapterRvOngoing


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