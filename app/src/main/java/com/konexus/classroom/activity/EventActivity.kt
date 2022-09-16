package com.konexus.classroom.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRecycleEvent
import com.konexus.classroom.adapter.AdapterVPEvent
import com.konexus.classroom.adapter.ViewOnClick

class EventActivity : AppCompatActivity(),ViewOnClick {

    private lateinit var listVPeventLomba1 : ArrayList<Int>
    private lateinit var listVPevent2 : ArrayList<Int>
    private lateinit var listVPeventAll : ArrayList<Int>
    private lateinit var adapterViewP : AdapterVPEvent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        setSupportActionBar(findViewById(R.id.tb_event))

        val actionbar = supportActionBar
        actionbar!!.title = "Event"
        actionbar.setDisplayHomeAsUpEnabled(true)
        var data: ArrayList<String> = ArrayList()
        data.add("All Event")
        data.add("Lomba 1")
        data.add("Lomba 2")

        dataInit()

        val recycler = findViewById<RecyclerView>(R.id.rc_event)
        val adapter = AdapterRecycleEvent(this,data,this)
        recycler.layoutManager = GridLayoutManager(this, 1, RecyclerView.HORIZONTAL, false)
        recycler.adapter = adapter

        var viewPager : ViewPager = findViewById(R.id.vp_event)

        adapterViewP = AdapterVPEvent(this, listVPeventAll)
        viewPager.adapter = adapterViewP

    }

    override fun onItemClick(posisi: Int) {
        Log.e("POSISI",""+posisi.toString())
        adapterViewP.data.clear()
        dataInit()

        if(posisi == 3){
            adapterViewP.data.addAll(listVPevent2)

        }else if(posisi == 2){
            adapterViewP.data.addAll(listVPeventLomba1)
        }else{
            adapterViewP.data.addAll(listVPeventAll)

        }
        adapterViewP.notifyDataSetChanged()
    }

    private fun dataInit(){
        listVPeventLomba1 = ArrayList()
        listVPeventLomba1.add(R.drawable.even)
        listVPeventLomba1.add(R.drawable.even2)

        listVPevent2 = ArrayList()
        listVPevent2.add(R.drawable.even3)
        listVPevent2.add(R.drawable.even4)

        listVPeventAll = ArrayList()
        listVPeventAll.add(R.drawable.even)
        listVPeventAll.add(R.drawable.even2)
        listVPeventAll.add(R.drawable.even3)
        listVPeventAll.add(R.drawable.even4)
    }


}