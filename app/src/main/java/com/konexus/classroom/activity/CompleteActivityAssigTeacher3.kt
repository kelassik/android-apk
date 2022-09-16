package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.konexus.classroom.R

class CompleteActivityAssigTeacher3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_assig_teacher3)
        setSupportActionBar(findViewById(R.id.toolbarTeacherComplete3))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)
        val btn = findViewById<AppCompatButton>(R.id.btncomplete3)

        btn.setOnClickListener {
            val intent = Intent(this, CompleteActivityAssigTeacher4::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, CompleteActivityAssigTeacher2::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this, CompleteActivityAssigTeacher2::class.java)
        startActivity(intent)
        finish()
        return true
    }
}