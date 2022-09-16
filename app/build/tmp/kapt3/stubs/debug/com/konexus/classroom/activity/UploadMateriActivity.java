package com.konexus.classroom.activity;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.*;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatButton;
import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.storage.FirebaseStorage;
import com.konexus.classroom.R;
import kotlinx.android.synthetic.main.activity_upload_materi.*;
import java.io.InputStream;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\b\u00103\u001a\u000201H\u0016J\u0012\u00104\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000106H\u0014J-\u00107\u001a\u0002012\u0006\u00108\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070:2\u0006\u0010;\u001a\u00020<H\u0016\u00a2\u0006\u0002\u0010=J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u000201H\u0002J\b\u0010A\u001a\u000201H\u0002J\b\u0010B\u001a\u000201H\u0002J\u0006\u0010C\u001a\u000201J\b\u0010D\u001a\u000201H\u0002J\u0018\u0010E\u001a\u0002012\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u000201H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001f\u0010(\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u001c\u0010*\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010+\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u001a\u0010-\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014\u00a8\u0006J"}, d2 = {"Lcom/konexus/classroom/activity/UploadMateriActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CAMERA_PERMISSION_CODE", "", "READ_EXTERNAL_STORAGE_PERMISSION_CODE", "TAG", "", "WRITE_EXTERNAL_STORAGE_PERMISSION_CODE", "btnCameraUpload", "Landroid/widget/ImageButton;", "btnGaleryUpload", "btnPdfUpload", "btnSubmit", "Landroidx/appcompat/widget/AppCompatButton;", "btnWordUpload", "classMateri", "getClassMateri", "()Ljava/lang/String;", "setClassMateri", "(Ljava/lang/String;)V", "editTextClass", "Landroid/widget/EditText;", "editTextSubject", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "imageView", "Landroid/widget/ImageView;", "pdfUri", "Landroid/net/Uri;", "progressDialog", "Landroid/app/ProgressDialog;", "resultLauncherCamera", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getResultLauncherCamera", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultLauncherCamera", "(Landroidx/activity/result/ActivityResultLauncher;)V", "resultLauncherDocx", "getResultLauncherDocx", "resultLauncherGallery", "resultLauncherPdf", "getResultLauncherPdf", "subjectMateri", "getSubjectMateri", "setSubjectMateri", "checkPermission", "", "init", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSupportNavigateUp", "", "openCamera", "openDOCX", "openGallery", "openPDF", "uploadStorage", "uploadpdftodb", "uploadpdfUrl", "timestamp", "", "validatedata", "app_debug"})
public final class UploadMateriActivity extends androidx.appcompat.app.AppCompatActivity {
    private int WRITE_EXTERNAL_STORAGE_PERMISSION_CODE = 1;
    private int READ_EXTERNAL_STORAGE_PERMISSION_CODE = 2;
    private int CAMERA_PERMISSION_CODE = 3;
    private android.widget.ImageButton btnGaleryUpload;
    private android.widget.ImageButton btnCameraUpload;
    private android.widget.ImageButton btnWordUpload;
    private android.widget.ImageButton btnPdfUpload;
    private androidx.appcompat.widget.AppCompatButton btnSubmit;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    private android.app.ProgressDialog progressDialog;
    private android.widget.ImageView imageView;
    private android.widget.EditText editTextSubject;
    private android.widget.EditText editTextClass;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subjectMateri = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String classMateri = "";
    private android.net.Uri pdfUri;
    private final java.lang.String TAG = "PDF_ADD_TAG";
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherCamera;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherGallery;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherPdf = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherDocx = null;
    private java.util.HashMap _$_findViewCache;
    
    public UploadMateriActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubjectMateri() {
        return null;
    }
    
    public final void setSubjectMateri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClassMateri() {
        return null;
    }
    
    public final void setClassMateri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncherCamera() {
        return null;
    }
    
    public final void setResultLauncherCamera(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    public final void openPDF() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncherPdf() {
        return null;
    }
    
    private final void openDOCX() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncherDocx() {
        return null;
    }
    
    private final void validatedata() {
    }
    
    private final void uploadStorage() {
    }
    
    private final void uploadpdftodb(java.lang.String uploadpdfUrl, long timestamp) {
    }
    
    private final void openGallery() {
    }
    
    private final void openCamera() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}