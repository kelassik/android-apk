package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRVMaterialTeacher
import com.konexus.classroom.adapter.AdapterRecycleMateri
import com.konexus.classroom.modeldata.ModelDataMateri
import com.konexus.classroom.modeldata.ModelMaterialTeacher
import com.konexus.classroom.modeldata.ModelSubMaterial
import com.konexus.classroom.modeldata.ModelSubMaterialTeacher

class MaterialActivityTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_teacher)
        setSupportActionBar(findViewById(R.id.tb_material))

        val actionbar = supportActionBar
        actionbar!!.title = "Material"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var rvListMaterial : RecyclerView = findViewById(R.id.recymaterialTeacher)
        var data: ArrayList<ModelMaterialTeacher> = ArrayList()
        var dataSub : ArrayList<ModelSubMaterialTeacher>? = ArrayList()
        dataSub?.add(
            ModelSubMaterialTeacher(
                "Statistika",
                R.drawable.ic_baseline_download,
                "https//",
            "Statistika",
                R.drawable.eye
            )
        )
        data.add(
            ModelMaterialTeacher(
                "Teacher",
                R.drawable.pixabay, "Statistika",
                R.drawable.ic_baseline_access_time,
                "10/Aug/2021",
                dataSub, false
            )
        )
        data.add(
            ModelMaterialTeacher(
                "Teacher",
                R.drawable.pixabay, "Bilangan",
                R.drawable.ic_baseline_access_time,
                "",
                dataSub,false
            )
        )
        data.add(
            ModelMaterialTeacher(
                "Teacher",
                R.drawable.pixabay, "Aljabar",
                R.drawable.ic_baseline_access_time,
                "",
                dataSub, false
            )
        )

        val adapter = AdapterRVMaterialTeacher(this,data)
        rvListMaterial.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvListMaterial.adapter = adapter
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