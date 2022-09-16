package com.konexus.classroom.activity

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.konexus.classroom.R
import com.konexus.classroom.adapter.AdapterRecyclerViewDiscussion
import com.konexus.classroom.modeldata.ModelDataDiscussion
import java.io.InputStream

class DiscussionBoardActivity : AppCompatActivity() {

    private var WRITE_EXTERNAL_STORAGE_PERMISSION_CODE: Int = 1
    private var READ_EXTERNAL_STORAGE_PERMISSION_CODE: Int = 2
    private var CAMERA_PERMISSION_CODE: Int = 3

    private var listdis: ArrayList<ModelDataDiscussion> = ArrayList()
    private var thumb : Bitmap? = null

    private lateinit var imgCmra : ImageView
    private lateinit var imgGaleri : ImageView
    private lateinit var listDiscussion : RecyclerView
    private lateinit var postEditText : EditText
    private lateinit var btnUpload : Button
    private lateinit var imgResul : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discussion_board)
        setSupportActionBar(findViewById(R.id.tbdisboard))

        val actionbar = supportActionBar
        actionbar!!.title = "Discussion Board"
        actionbar.setDisplayHomeAsUpEnabled(true)

        init()
        checkPermission()

        listdis.add(ModelDataDiscussion("IPA XII","4HOUR","TEMA IPA",thumb))
        listdis.add(ModelDataDiscussion("XII IPS","2Hour","TEMA IPS",thumb))

        var adapterRecyc = AdapterRecyclerViewDiscussion(this, listdis)
        listDiscussion.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        listDiscussion.adapter = adapterRecyc

        btnUpload.setOnClickListener {

            listdis.add(
                ModelDataDiscussion(
                    "IPA XII",
                    "4HOUR",
                    postEditText.text.toString(),
                    thumb
                )
            )
            adapterRecyc.notifyDataSetChanged()
            clearView()
        }

        imgCmra.setOnClickListener {
            openCamera()
        }

        imgGaleri.setOnClickListener {
            openGallery()
        }

    }

    private fun init() {
        imgCmra  = findViewById(R.id.imgcamera)
        imgGaleri  = findViewById(R.id.imggalery)
        listDiscussion = findViewById(R.id.rv_itemdis)
        postEditText = findViewById(R.id.edtext1)
        btnUpload = findViewById(R.id.upitemdis)
        imgResul = findViewById(R.id.imgresult)
    }

    private fun checkPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            when (PackageManager.PERMISSION_DENIED) {
                checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) -> {
                    requestPermissions(
                        arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                        WRITE_EXTERNAL_STORAGE_PERMISSION_CODE
                    )
                }
                checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) -> {
                    requestPermissions(
                        arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                        READ_EXTERNAL_STORAGE_PERMISSION_CODE
                    )
                }
                checkSelfPermission(Manifest.permission.CAMERA) -> {
                    requestPermissions(
                        arrayOf(Manifest.permission.CAMERA),
                        CAMERA_PERMISSION_CODE
                    )
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            WRITE_EXTERNAL_STORAGE_PERMISSION_CODE -> if (grantResults.isNotEmpty()) {
                if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                    Toast.makeText(this, "Anda perlu memberikan semua izin untuk menggunakan aplikasi ini.", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
            READ_EXTERNAL_STORAGE_PERMISSION_CODE -> if (grantResults.isNotEmpty()) {
                if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                    Toast.makeText(this, "Anda perlu memberikan semua izin untuk menggunakan aplikasi ini.", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
            CAMERA_PERMISSION_CODE -> if (grantResults.isNotEmpty()) {
                if (grantResults[0] == PackageManager.PERMISSION_DENIED){
                    Toast.makeText(this, "Anda perlu memberikan semua izin untuk menggunakan aplikasi ini.", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }
    }

    private fun openCamera() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
                requestPermissions(arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_CODE)
            } else {
                Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
                    takePictureIntent.resolveActivity(packageManager)?.also {
                        resultLauncherCamera.launch(takePictureIntent)
                    }
                }
            }
        } else {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
                takePictureIntent.resolveActivity(packageManager)?.also {
                    resultLauncherCamera.launch(takePictureIntent)
                }
            }
        }
    }

    var resultLauncherCamera = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            thumb = data!!.extras?.get("data") as Bitmap

            imgResul.layoutParams.width = 150
            imgResul.layoutParams.height = 150
            thumb.let {
                Glide.with(this)
                    .load(it)
                    .into(imgResul)
            }
        }
    }

    private fun openGallery() {
        val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        resultLauncherGallery.launch(galleryIntent)
    }

    private var resultLauncherGallery = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            //the image URI
            val imageUri = data!!.data!!
            thumb = if (Build.VERSION.SDK_INT >= 29){
                // To handle deprication use
                val inputStream: InputStream = contentResolver.openInputStream(imageUri)!!
                BitmapFactory.decodeStream(inputStream)
            } else{
                // Use older version
                MediaStore.Images.Media.getBitmap(contentResolver, imageUri)
            }

            imgResul.layoutParams.width = 150
            imgResul.layoutParams.height = 150
            thumb.let {
                Glide.with(this)
                    .load(it)
                    .into(imgResul)
            }
        }
    }

    private fun clearView(){
        postEditText.text = null
        thumb = null
        imgResul.layoutParams.width = 0
        imgResul.layoutParams.height = 0
        thumb.let {
            Glide.with(this)
                .load(it)
                .into(imgResul)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
