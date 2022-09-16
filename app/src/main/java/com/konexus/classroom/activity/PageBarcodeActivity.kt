package com.konexus.classroom.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import com.konexus.classroom.R

class PageBarcodeActivity : AppCompatActivity(R.layout.page_barcode) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.tbcode))

        val actionbar = supportActionBar
        actionbar!!.title = "Scan Barcode"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var click : Boolean = false

        val imgChange : AppCompatImageButton = findViewById(R.id.img_change_code)
        val imgCodeSet : ImageView = findViewById(R.id.imgbarcode)



        imgChange.setOnClickListener(View.OnClickListener {
            click = !click

            if (!click){
                imgChange.setImageResource(R.drawable.kodebatang1)
                imgCodeSet.setImageResource(R.drawable.barcode2)
            }else{
                imgChange.setImageResource(R.drawable.barcode2)
                imgCodeSet.setImageResource(R.drawable.kodebatang1)
            }
        })
    }

        override fun onSupportNavigateUp(): Boolean {
            finish()
            return true

    }
}