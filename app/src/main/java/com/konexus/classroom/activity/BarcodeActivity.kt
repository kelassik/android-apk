package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.konexus.classroom.R
import com.konexus.classroom.control.JoinDialogSekolah

class BarcodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcode)

        val btnjoin = findViewById<Button>(R.id.btn_join)
        val relcode = findViewById<ConstraintLayout>(R.id.cons_barcode)

        btnjoin.setOnClickListener(){

            val dialog = JoinDialogSekolah()
            dialog!!.show(this.supportFragmentManager,"Your Class")
            dialog.activity?.window?.setBackgroundDrawableResource(android.R.color.transparent)

        }
        relcode.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@BarcodeActivity,PageBarcodeActivity::class.java))
        })
    }
}