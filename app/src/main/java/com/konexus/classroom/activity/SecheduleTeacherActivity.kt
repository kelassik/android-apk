package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVAbsent
import com.konexus.classroom.adapter.AdapterRVAbsentTeacher
import com.konexus.classroom.adapter.AdapterRVTeacherSchedule
import com.konexus.classroom.adapter.AdapterRecyclerViewScedule
import com.konexus.classroom.modeldata.*

class SecheduleTeacherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sechedule_teacher)
        setSupportActionBar(findViewById(R.id.tbboard))

        val actionbar = supportActionBar
        actionbar!!.title = "Schedule Teacher"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val relat : RelativeLayout = findViewById(R.id.rel1)
        val relat2 : RelativeLayout = findViewById(R.id.rel2)

        val recHari : RecyclerView = findViewById(R.id.rv_scedule)
        val recAbsent : RecyclerView = findViewById(R.id.rv_absent)
        var listSceduleTime : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleTime.add(
            ModelScheduleTeacher("07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15")
        )

        var listSceduleMon : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleMon.add(
            ModelScheduleTeacher("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8")
        )

        var listSceduleTue : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleTue.add(
            ModelScheduleTeacher("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8")
        )

        var listSceduleWed : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleWed.add(
            ModelScheduleTeacher("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8")
        )

        var listSceduleThu : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleThu.add(
            ModelScheduleTeacher("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8")
        )

        var listSceduleFri : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleFri.add(
            ModelScheduleTeacher("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8")
        )

        var listSceduleSat : ArrayList<ModelScheduleTeacher> = ArrayList()
        listSceduleSat.add(
            ModelScheduleTeacher("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8")
        )

        var listHari : ArrayList<ModelHariTeacher> = ArrayList()
        listHari.add(ModelHariTeacher("Time",listSceduleTime))
        listHari.add(ModelHariTeacher("Mon",listSceduleMon))
        listHari.add(ModelHariTeacher("Tue",listSceduleTue))
        listHari.add(ModelHariTeacher("Wed",listSceduleWed))
        listHari.add(ModelHariTeacher("Thu",listSceduleThu))
        listHari.add(ModelHariTeacher("Fri",listSceduleFri))
        listHari.add(ModelHariTeacher("Sat",listSceduleSat))

        val adapterHari = AdapterRVTeacherSchedule(this,listHari)
        recHari.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL,false)
        recHari.adapter = adapterHari

        var listAbsent : ArrayList<ModelAbsentTeacher> = ArrayList()
        listAbsent.add(ModelAbsentTeacher("Yopa Bagus Suryono",R.drawable.verification))
        listAbsent.add(ModelAbsentTeacher("Yahya Agung",R.drawable.verification))
        listAbsent.add(ModelAbsentTeacher("Lukman Hakim",R.drawable.verification))
        listAbsent.add(ModelAbsentTeacher("Saiful Purnama",R.drawable.verification))
        val adapterAbsent = AdapterRVAbsentTeacher(this, listAbsent)
        recAbsent.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        recAbsent.adapter = adapterAbsent

        relat.setOnClickListener {

            val intent = Intent(this, AssigmentActivityTeacher::class.java)
            startActivity(intent)
            finish()
        }
        relat2.setOnClickListener {

            val intent = Intent(this, DiscussActivityTeacher::class.java)
            startActivity(intent)
            finish()
        }
    }


    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("THIS",this.localClassName)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
