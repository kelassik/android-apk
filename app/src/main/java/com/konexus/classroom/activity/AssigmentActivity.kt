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
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import com.konexus.classroom.R
import com.konexus.classroom.modeldata.ModelResultTask
import com.konexus.classroom.service.ApiServices
import retrofit2.Call
import retrofit2.Callback
import java.io.InputStream


class AssigmentActivity : AppCompatActivity() {

    private var WRITE_EXTERNAL_STORAGE_PERMISSION_CODE: Int = 1
    private var READ_EXTERNAL_STORAGE_PERMISSION_CODE: Int = 2
    private var CAMERA_PERMISSION_CODE: Int = 3

    private lateinit var image : ImageView
    private lateinit var nis : TextView
    private lateinit var nama : TextView
    private lateinit var kelas : TextView
    private lateinit var soal : TextView
    private lateinit var btnAss : Button
    private val dataList = ArrayList<ModelResultTask>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assigment)
        setSupportActionBar(findViewById(R.id.tbasigmt))


        val actionbar = supportActionBar
        actionbar!!.title = "Assigment"
        actionbar.setDisplayHomeAsUpEnabled(true)

        init()
        checkPermission()

        btnAss.setOnClickListener {
            clickTake(it)

        }

    }

    private fun init() {
        image = findViewById(R.id.tesimage)
        nis = findViewById(R.id.txnis2)
        nama = findViewById(R.id.txname2)
        kelas = findViewById(R.id.txkelas2)
        soal = findViewById(R.id.txsoal)
        btnAss = findViewById(R.id.btnasig)
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

    var resultLauncherCamera = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            val thumb = data!!.extras?.get("data") as Bitmap

//            thumb.let {
//                Glide.with(this)
//                    .load(it)
//                    .into(ivResult)
//            }
        }
    }
    private var resultLauncherGallery = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            //the image URI
            val imageUri = data!!.data!!
            val thumb = if (Build.VERSION.SDK_INT >= 29){
                // To handle deprication use
                val inputStream: InputStream = contentResolver.openInputStream(imageUri)!!
                BitmapFactory.decodeStream(inputStream)
            } else{
                // Use older version
                MediaStore.Images.Media.getBitmap(contentResolver, imageUri)
            }

//            thumb.let {
//                Glide.with(this)
//                    .load(it)
//                    .into(ivResult)
//            }
        }
    }

    private fun openGallery() {
        val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        resultLauncherGallery.launch(galleryIntent)
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

    fun clickTake(view: View) {
        val takePictOptions = arrayOf<String>("Camera", "Gallery")
        AlertDialog.Builder(this)
            .setTitle("Ambil gambar melalui")
            .setItems(takePictOptions) { _, which-> when (which) {
                0 -> openCamera()
                1 -> openGallery()
            } }
            .create()
            .show()
    }

    override fun onStart() {
        super.onStart()
        var pos = intent.extras?.getInt("POSISI")
        Log.e("POSISI",""+pos.toString())
        ambilSoal(pos)
    }

    private fun ambilSoal(nomer : Int?){
        ApiServices.instance.getdata(nomer).enqueue(object : Callback<ArrayList<ModelResultTask>>{
            override fun onResponse(
                call: Call<ArrayList<ModelResultTask>>,
                response: retrofit2.Response<ArrayList<ModelResultTask>>
            ) {
                Log.e("DATA",""+response.body()?.toString())
                response.body()?.let { dataList.addAll(it)}
                nis.text = dataList.get(0).NIS
                nama.text = dataList.get(0).Nama
                kelas.text = dataList.get(0).Kelas
                soal.text = dataList.get(0).Soal
                Log.e("DATA SOAL",""+dataList.toString())
                Log.e("CODE",""+response.code().toString())
            }

            override fun onFailure(call: Call<ArrayList<ModelResultTask>>, t: Throwable) {
                Toast.makeText(this@AssigmentActivity, ""+t.toString(), Toast.LENGTH_SHORT).show()
                Log.e("onFailure",""+t.toString())
            }
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, TaskHistoryActivity::class.java)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}