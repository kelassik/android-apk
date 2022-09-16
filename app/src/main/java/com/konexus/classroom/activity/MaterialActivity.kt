package com.konexus.classroom.activity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRecycleMateri
import com.konexus.classroom.modeldata.ModelDataMateri
import com.konexus.classroom.modeldata.ModelSubMaterial

class MaterialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)
        setSupportActionBar(findViewById(R.id.tb_material))

        val actionbar = supportActionBar
        actionbar!!.title = "Material"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var rvList : RecyclerView = findViewById(R.id.recymateri)
        var data: ArrayList<ModelDataMateri> = ArrayList()
        var dataSub : ArrayList<ModelSubMaterial>? = ArrayList()
        dataSub?.add(
            ModelSubMaterial(
                "Statistika",
                R.drawable.ic_baseline_download,
                "https//"
            )
        )
        data.add(
            ModelDataMateri(
            "Teacher",
            R.drawable.no_image, "Statistika",
                R.drawable.ic_baseline_access_time,
                "10/Aug/2021",
                dataSub, false
            )
        )
        data.add(
            ModelDataMateri(
                "Teacher",
                R.drawable.no_image, "Aljabar",
                R.drawable.ic_baseline_access_time,
                "",
                null,false
            )
        )
        data.add(
            ModelDataMateri(
                "Teacher",
                R.drawable.no_image, "",
                R.drawable.ic_baseline_access_time,
                "",
                null, false
            )
        )

        val adapter = AdapterRecycleMateri(this,data)
        rvList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvList.adapter = adapter
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