package com.konexus.classroom.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.konexus.classroom.R;
import com.konexus.classroom.activity.AssigmentActivity;
import com.konexus.classroom.activity.TaskHistoryActivity;
import com.konexus.classroom.modeldata.ModelDataTask;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecyclerViewTask;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/konexus/classroom/adapter/AdapterRecyclerViewTask$ViewHolder;", "con", "Landroid/content/Context;", "data", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelDataTask;", "Lkotlin/collections/ArrayList;", "activity", "Lcom/konexus/classroom/activity/TaskHistoryActivity;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/konexus/classroom/activity/TaskHistoryActivity;)V", "getActivity", "()Lcom/konexus/classroom/activity/TaskHistoryActivity;", "getCon", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdapterRecyclerViewTask extends androidx.recyclerview.widget.RecyclerView.Adapter<com.konexus.classroom.adapter.AdapterRecyclerViewTask.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context con = null;
    private java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataTask> data;
    @org.jetbrains.annotations.NotNull()
    private final com.konexus.classroom.activity.TaskHistoryActivity activity = null;
    
    public AdapterRecyclerViewTask(@org.jetbrains.annotations.NotNull()
    android.content.Context con, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataTask> data, @org.jetbrains.annotations.NotNull()
    com.konexus.classroom.activity.TaskHistoryActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getCon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.konexus.classroom.activity.TaskHistoryActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.konexus.classroom.adapter.AdapterRecyclerViewTask.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.konexus.classroom.adapter.AdapterRecyclerViewTask.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecyclerViewTask$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "txCal", "Landroid/widget/TextView;", "getTxCal", "()Landroid/widget/TextView;", "txJudul", "getTxJudul", "txTime", "getTxTime", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txJudul = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txCal = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txTime = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxJudul() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxCal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
    }
}