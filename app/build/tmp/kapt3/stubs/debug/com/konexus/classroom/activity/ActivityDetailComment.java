package com.konexus.classroom.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.konexus.classroom.R;
import com.konexus.classroom.adapter.AdapterRCDetailComment;
import com.konexus.classroom.modeldata.ModelDataDetailComment;
import com.mikhaellopez.circularimageview.CircularImageView;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/konexus/classroom/activity/ActivityDetailComment;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnCmmnt", "Landroidx/appcompat/widget/AppCompatImageButton;", "edCmmnt", "Landroid/widget/EditText;", "imgProfil", "Lcom/mikhaellopez/circularimageview/CircularImageView;", "listDiscussion", "Landroidx/recyclerview/widget/RecyclerView;", "listdis", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelDataDetailComment;", "Lkotlin/collections/ArrayList;", "thumb", "Landroid/graphics/Bitmap;", "txName", "Landroid/widget/TextView;", "txPost", "txTime", "txTitle", "init", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "app_debug"})
public final class ActivityDetailComment extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataDetailComment> listdis;
    private android.graphics.Bitmap thumb;
    private com.mikhaellopez.circularimageview.CircularImageView imgProfil;
    private android.widget.TextView txName;
    private android.widget.TextView txTime;
    private android.widget.TextView txPost;
    private android.widget.TextView txTitle;
    private androidx.appcompat.widget.AppCompatImageButton btnCmmnt;
    private android.widget.EditText edCmmnt;
    private androidx.recyclerview.widget.RecyclerView listDiscussion;
    private java.util.HashMap _$_findViewCache;
    
    public ActivityDetailComment() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}