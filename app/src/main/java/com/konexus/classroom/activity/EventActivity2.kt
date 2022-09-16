package com.konexus.classroom.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.konexus.classroom.R

class EventActivity2 : AppCompatActivity() {

    private lateinit var imgView : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event2)
        setSupportActionBar(findViewById(R.id.tb_event2))

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Event"
        actionbar.setDisplayHomeAsUpEnabled(true)
        init()

//        var img : Int = intent?.extras?.getInt("EVENTIMAGE") as Int
//        imgView.setImageResource(img)
    }

    fun init(){
        imgView = findViewById(R.id.img_even2)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
        finish()
    }
}