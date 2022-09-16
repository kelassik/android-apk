package com.konexus.classroom.activity

import android.Manifest
import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.*
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.storage.FirebaseStorage
import com.konexus.classroom.R
import kotlinx.android.synthetic.main.activity_upload_materi.*
import java.io.InputStream

class UploadMateriActivity : AppCompatActivity() {

    private var WRITE_EXTERNAL_STORAGE_PERMISSION_CODE: Int = 1
    private var READ_EXTERNAL_STORAGE_PERMISSION_CODE: Int = 2
    private var CAMERA_PERMISSION_CODE: Int = 3

    private lateinit var btnGaleryUpload : ImageButton
    private lateinit var btnCameraUpload : ImageButton
    private lateinit var btnWordUpload : ImageButton
    private lateinit var btnPdfUpload : ImageButton
    private lateinit var btnSubmit : AppCompatButton
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var progressDialog: ProgressDialog
    private lateinit var imageView: ImageView
    private lateinit var editTextSubject: EditText
    private lateinit var editTextClass: EditText
    var subjectMateri = ""
    var classMateri = ""
    private var pdfUri: Uri? = null
    private val TAG = "PDF_ADD_TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_materi)
        setSupportActionBar(findViewById(R.id.tbuploadmateri))


        val actionbar = supportActionBar
        actionbar!!.title = "Upload Materi"
        actionbar.setDisplayHomeAsUpEnabled(true)

        init()

        checkPermission()

        btnGaleryUpload.setOnClickListener {
            openGallery()

        }
        btnCameraUpload.setOnClickListener {
            openCamera()
        }
        btnPdfUpload.setOnClickListener {
            openPDF()
        }
        btnWordUpload.setOnClickListener {
            openDOCX()
        }
        btnSubmit.setOnClickListener{
            validatedata()

        }

    }

    private fun init() {
        btnGaleryUpload =findViewById(R.id.imggalerymateri)
        btnCameraUpload = findViewById(R.id.imgcameramateri)
        btnPdfUpload = findViewById(R.id.imgfilepdf)
        btnWordUpload = findViewById(R.id.imgfileword)
        btnSubmit = findViewById(R.id.btnsubmitmateri)
        imageView = findViewById(R.id.imgresultmateri)
        editTextSubject = findViewById(R.id.edsubject)
        editTextClass = findViewById(R.id.edKelas)
        firebaseAuth = FirebaseAuth.getInstance()
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("harap tunggu")
        progressDialog.setCanceledOnTouchOutside(false)
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

            thumb.let {
                Glide.with(this)
                    .load(it)
                    .into(imageView)
            }
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

            thumb.let {
                Glide.with(this)
                    .load(it)
                    .into(imageView)
            }
        }
    }

    fun openPDF() {
        Log.d(TAG, "pdfPickIntent: mulai ambil pdf")
        val pdfIntent = Intent()
        pdfIntent.type = "application/pdf"
        pdfIntent.action = Intent.ACTION_GET_CONTENT
        resultLauncherPdf.launch(pdfIntent)

    }
    val resultLauncherPdf = registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
        ActivityResultCallback<ActivityResult> { result ->
            if (result.resultCode == RESULT_OK) {
                Log.d(TAG, "PDF berhasil diambil")
                pdfUri = result.data!!.data
            }else{
                Log.d(TAG, "PDF gagal diambil")
                Toast.makeText(this, "Dibatalkan", Toast.LENGTH_SHORT).show()
            }
        })


    private fun openDOCX() {
        Log.d(TAG, "docxPickIntent: mulai ambil DOCX")
        val docxIntent = Intent()
        docxIntent.type = "application/docx"
        docxIntent.action = Intent.ACTION_GET_CONTENT
        resultLauncherDocx.launch(docxIntent)
    }
    val resultLauncherDocx = registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
        ActivityResultCallback<ActivityResult> { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                Log.d(TAG, "Docx berhasil diambil")
                pdfUri = result.data!!.data
            }else{
                Log.d(TAG, "Docx gagal diambil")
                Toast.makeText(this, "Dibatalkan", Toast.LENGTH_SHORT).show()
            }
        })

    private fun validatedata() {
        subjectMateri = editTextSubject.text.toString()
        classMateri = editTextClass.text.toString()
        if(subjectMateri.isEmpty()){
            Toast.makeText(this, "input subject", Toast.LENGTH_SHORT).show()
        }
        else if  (classMateri.isEmpty()){
            Toast.makeText(this, "input Kelas", Toast.LENGTH_SHORT).show()
        }
        else if (pdfUri == null){
            Toast.makeText(this, "input File PDF", Toast.LENGTH_SHORT).show()
        }
        else {
            uploadStorage()
        }

    }
    private fun uploadStorage(){
        Log.d(TAG, "uploaf file pdf ke storage ...")
        progressDialog.setMessage("Upload file pdf . . .")
        val timestamp = System.currentTimeMillis()
        val filePathandName = "Materi/$timestamp"
        val storageReference = FirebaseStorage.getInstance().getReference(filePathandName)
        storageReference.putFile(pdfUri!!)
            .addOnSuccessListener { taskSnapshot ->
                Log.d(TAG, "upload : pdf sedang di upload sekarang . . .")
                val uriTask: Task<Uri> = taskSnapshot.storage.downloadUrl
                while (!uriTask.isSuccessful);
                    val uploadpdfUrl = "${uriTask.result}"

                uploadpdftodb(uploadpdfUrl, timestamp)

            }
            .addOnFailureListener { e->
                Log.d(TAG, "upload : gagal upload file ke ${e.message}")
                progressDialog.dismiss()
                Toast.makeText(this, "gagal upload File PDF ke penyimpanan ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }
    private fun uploadpdftodb(uploadpdfUrl: String, timestamp: Long){

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

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, AssigmentActivityTeacher::class.java)
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this, AssigmentActivityTeacher::class.java)
        startActivity(intent)
        finish()
        return true

//    fun clickTake(view: View) {
//        val takePictOptions = arrayOf<String>("Camera", "Gallery")
//        AlertDialog.Builder(this)
//            .setTitle("Ambil gambar melalui")
//            .setItems(takePictOptions) { _, which-> when (which) {
//                0 -> openCamera()
//                1 -> openGallery()
//            } }
//            .create()
//            .show()
    }
}