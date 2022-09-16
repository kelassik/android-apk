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
import android.view.View;
import android.widget.*;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.konexus.classroom.R;
import com.konexus.classroom.adapter.AdapterRecyclerViewDiscussion;
import com.konexus.classroom.modeldata.ModelDataDiscussion;
import java.io.InputStream;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0016J\u0012\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J-\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00042\u000e\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.H\u0016\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/konexus/classroom/activity/DiscussionBoardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CAMERA_PERMISSION_CODE", "", "READ_EXTERNAL_STORAGE_PERMISSION_CODE", "WRITE_EXTERNAL_STORAGE_PERMISSION_CODE", "btnUpload", "Landroid/widget/Button;", "imgCmra", "Landroid/widget/ImageView;", "imgGaleri", "imgResul", "listDiscussion", "Landroidx/recyclerview/widget/RecyclerView;", "listdis", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelDataDiscussion;", "Lkotlin/collections/ArrayList;", "postEditText", "Landroid/widget/EditText;", "resultLauncherCamera", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getResultLauncherCamera", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultLauncherCamera", "(Landroidx/activity/result/ActivityResultLauncher;)V", "resultLauncherGallery", "thumb", "Landroid/graphics/Bitmap;", "checkPermission", "", "clearView", "init", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSupportNavigateUp", "", "openCamera", "openGallery", "app_debug"})
public final class DiscussionBoardActivity extends androidx.appcompat.app.AppCompatActivity {
    private int WRITE_EXTERNAL_STORAGE_PERMISSION_CODE = 1;
    private int READ_EXTERNAL_STORAGE_PERMISSION_CODE = 2;
    private int CAMERA_PERMISSION_CODE = 3;
    private java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataDiscussion> listdis;
    private android.graphics.Bitmap thumb;
    private android.widget.ImageView imgCmra;
    private android.widget.ImageView imgGaleri;
    private androidx.recyclerview.widget.RecyclerView listDiscussion;
    private android.widget.EditText postEditText;
    private android.widget.Button btnUpload;
    private android.widget.ImageView imgResul;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherCamera;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncherGallery;
    private java.util.HashMap _$_findViewCache;
    
    public DiscussionBoardActivity() {
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
    
    private final void openCamera() {
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
    
    private final void clearView() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}