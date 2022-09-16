package com.konexus.classroom.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.konexus.classroom.R;
import com.konexus.classroom.adapter.AdapterRecycleEvent;
import com.konexus.classroom.adapter.AdapterVPEvent;
import com.konexus.classroom.adapter.ViewOnClick;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/konexus/classroom/activity/EventActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/konexus/classroom/adapter/ViewOnClick;", "()V", "adapterViewP", "Lcom/konexus/classroom/adapter/AdapterVPEvent;", "listVPevent2", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listVPeventAll", "listVPeventLomba1", "dataInit", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "posisi", "app_debug"})
public final class EventActivity extends androidx.appcompat.app.AppCompatActivity implements com.konexus.classroom.adapter.ViewOnClick {
    private java.util.ArrayList<java.lang.Integer> listVPeventLomba1;
    private java.util.ArrayList<java.lang.Integer> listVPevent2;
    private java.util.ArrayList<java.lang.Integer> listVPeventAll;
    private com.konexus.classroom.adapter.AdapterVPEvent adapterViewP;
    private java.util.HashMap _$_findViewCache;
    
    public EventActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(int posisi) {
    }
    
    private final void dataInit() {
    }
}