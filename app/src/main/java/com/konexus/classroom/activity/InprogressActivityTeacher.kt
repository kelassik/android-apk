package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.konexus.classroom.R

class InprogressActivityTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inprogress_teacher)
        setSupportActionBar(findViewById(R.id.toolbarTeacherInprogress))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)
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