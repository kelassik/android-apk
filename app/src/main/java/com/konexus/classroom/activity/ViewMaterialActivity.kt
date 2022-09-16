package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.konexus.classroom.R

class ViewMaterialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_material)
        setSupportActionBar(findViewById(R.id.tb_viewMaterial))


        val actionbar = supportActionBar
        actionbar!!.title = "View Material"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MaterialActivityTeacher::class.java)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}