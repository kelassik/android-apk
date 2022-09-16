package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.konexus.classroom.R

class DiscussActivityTeacher2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discuss_teacher2)
        setSupportActionBar(findViewById(R.id.toolbarTeacherDiscussion))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, DiscussActivityTeacher::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this, DiscussActivityTeacher::class.java)
        startActivity(intent)
        finish()
        return true

    }
}