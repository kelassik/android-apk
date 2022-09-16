package com.konexus.classroom.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.konexus.classroom.R;
import com.konexus.classroom.adapter.AdapterRCTaskList2;
import com.konexus.classroom.modeldata.ModelDataTaskList2;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/konexus/classroom/activity/TaskListActivity2;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "listTask2", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelDataTaskList2;", "Lkotlin/collections/ArrayList;", "taskListcomplete", "Landroidx/recyclerview/widget/RecyclerView;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "app_debug"})
public final class TaskListActivity2 extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataTaskList2> listTask2;
    private androidx.recyclerview.widget.RecyclerView taskListcomplete;
    private java.util.HashMap _$_findViewCache;
    
    public TaskListActivity2() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}