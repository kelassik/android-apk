package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVAbsent
import com.konexus.classroom.adapter.AdapterRecyclerViewScedule
import com.konexus.classroom.fragment.HomeFragment
import com.konexus.classroom.modeldata.ModelAbsent
import com.konexus.classroom.modeldata.ModelHari
import com.konexus.classroom.modeldata.ModelScedule

class ScheduleBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_board)
        setSupportActionBar(findViewById(R.id.tbboard))

        val actionbar = supportActionBar
        actionbar!!.title = "Schedule"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val recHari : RecyclerView = findViewById(R.id.rv_scedule)
        val recAbsent : RecyclerView = findViewById(R.id.rv_absent)
        var listSceduleTime : ArrayList<ModelScedule> = ArrayList()
        listSceduleTime.add(ModelScedule("07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15",
            "07:00-08:15"))

        var listSceduleMon : ArrayList<ModelScedule> = ArrayList()
        listSceduleMon.add(ModelScedule("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8"))

        var listSceduleTue : ArrayList<ModelScedule> = ArrayList()
        listSceduleTue.add(ModelScedule("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8"))

        var listSceduleWed : ArrayList<ModelScedule> = ArrayList()
        listSceduleWed.add(ModelScedule("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8"))

        var listSceduleThu : ArrayList<ModelScedule> = ArrayList()
        listSceduleThu.add(ModelScedule("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8"))

        var listSceduleFri : ArrayList<ModelScedule> = ArrayList()
        listSceduleFri.add(ModelScedule("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8"))

        var listSceduleSat : ArrayList<ModelScedule> = ArrayList()
        listSceduleSat.add(ModelScedule("Sport1",
            "Sport2",
            "Sport3",
            "Sport4",
            "Sport5",
            "Sport6",
            "Sport7",
            "Sport8"))

        var listHari : ArrayList<ModelHari> = ArrayList()
        listHari.add(ModelHari("Time",listSceduleTime))
        listHari.add(ModelHari("Mon",listSceduleMon))
        listHari.add(ModelHari("Tue",listSceduleTue))
        listHari.add(ModelHari("Wed",listSceduleWed))
        listHari.add(ModelHari("Thu",listSceduleThu))
        listHari.add(ModelHari("Fri",listSceduleFri))
        listHari.add(ModelHari("Sat",listSceduleSat))

        val adapterHari = AdapterRecyclerViewScedule(this,listHari)
        recHari.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL,false)
        recHari.adapter = adapterHari

        var listAbsent : ArrayList<ModelAbsent> = ArrayList()
        listAbsent.add(ModelAbsent("Yopa Bagus Suryono",R.drawable.no_image))
        listAbsent.add(ModelAbsent("Yahya Agung",R.drawable.no_image))
        listAbsent.add(ModelAbsent("Lukman Hakim",R.drawable.no_image))
        listAbsent.add(ModelAbsent("Saiful Purnama",R.drawable.no_image))
        val adapterAbsent = AdapterRVAbsent(listAbsent)
        recAbsent.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        recAbsent.adapter = adapterAbsent
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