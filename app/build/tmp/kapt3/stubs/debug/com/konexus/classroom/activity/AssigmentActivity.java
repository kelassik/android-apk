package com.konexus.classroom.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import com.konexus.classroom.R;
import com.konexus.classroom.modeldata.ModelResultTask;
import com.konexus.classroom.service.ApiServices;
import retrofit2.Call;
import retrofit2.Callback;
import java.io.InputStream;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001dH\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0016J\u0012\u0010&\u001a\u00020\u001d2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J-\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u00042\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,2\u0006\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u001dH\u0014J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/konexus/classroom/activity/AssigmentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CAMERA_PERMISSION_CODE", "", "READ_EXTERNAL_STORAGE_PERMISSION_CODE", "WRITE_EXTERNAL_STORAGE_PERMISSION_CODE", "btnAss", "Landroid/widget/Button;", "dataList", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelResultTask;", "image", "Landroid/widget/ImageView;", "kelas", "Landroid/widget/TextView;", "nama", "nis", "resultLauncherCamera", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getResultLauncherCamera", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultLauncherCamera", "(Landroidx/activity/result/ActivityResultLauncher;)V", "resultLauncherGallery", "soal", "ambilSoal", "", "nomer", "(Ljava/lang/Integer;)V", "checkPermission", "clickTake", "view", "Landroid/view/View;", "init", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onSupportNavigateUp", "", "openCamera", "openGallery", "app_debug"})
public final class AssigmentActivity extends androidx.appcompat.app.AppCompatActivity {
    private int WRITE_EXTERNAL_STORAGE_PERMISSION_CODE = 1;
    private int READ_EXTERNAL_STORAGE_PERMISSION_CODE = 2;
    private int CAMERA_PERMISSION_CODE = 3;
    private android.widget.ImageView image;
    private android.widget.TextView nis;
    private android.widget.TextView nama;
    private android.widget.TextView kelas;
    private android.widget.TextView soal;
    private android.widget.Button btnAss;
    private final java.util.ArrayList<com.konexus.classroom.modeldata.ModelResultTask> dataList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherCamera;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherGallery;
    private java.util.HashMap _$_findViewCache;
    
    public AssigmentActivity() {
        super();
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
    
    private final void openGallery() {
    }
    
    private final void openCamera() {
    }
    
    public final void clickTake(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void ambilSoal(java.lang.Integer nomer) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}