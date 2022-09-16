package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRecycleNotifTeacher
import com.konexus.classroom.modeldata.ModelNotifTeacher

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        setSupportActionBar(findViewById(R.id.toolbarNotifTeacher))

        val actionbar = supportActionBar
        actionbar!!.title = ""
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list : RecyclerView = findViewById(R.id.recycle_notif_teacher)
        var data: ArrayList<ModelNotifTeacher> = ArrayList()
        data.add(
            ModelNotifTeacher(

                R.drawable.women2,
                R.drawable.likenotif,
            "Lina Bosquet",
            "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women2,
                R.drawable.massagenotif,
                "Lina Bosquet",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women,
                R.drawable.massagenotif,
                "Nina Hadid",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women,
                R.drawable.likenotif,
                "Nina Hadid",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women2,
                R.drawable.likenotif,
                "Lina Bosquet",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women2,
                R.drawable.massagenotif,
                "Lina Bosquet",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women,
                R.drawable.massagenotif,
                "Nina Hadid",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women,
                R.drawable.likenotif,
                "Nina Hadid",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )
        data.add(
            ModelNotifTeacher(

                R.drawable.women,
                R.drawable.likenotif,
                "Nina Hadid",
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet, consectetur ")
        )

        val adapterRvNotif = AdapterRecycleNotifTeacher(this,data)
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = adapterRvNotif
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