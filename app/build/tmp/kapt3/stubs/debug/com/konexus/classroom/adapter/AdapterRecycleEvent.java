package com.konexus.classroom.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.konexus.classroom.R;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0003J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0003R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecycleEvent;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/konexus/classroom/adapter/AdapterRecycleEvent$ViewHolder;", "con", "Landroid/content/Context;", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onClick", "Lcom/konexus/classroom/adapter/ViewOnClick;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/konexus/classroom/adapter/ViewOnClick;)V", "getCon", "()Landroid/content/Context;", "getOnClick", "()Lcom/konexus/classroom/adapter/ViewOnClick;", "pos", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setBG", "hol", "setBGAll", "ViewHolder", "app_debug"})
public final class AdapterRecycleEvent extends androidx.recyclerview.widget.RecyclerView.Adapter<com.konexus.classroom.adapter.AdapterRecycleEvent.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context con = null;
    private final java.util.ArrayList<java.lang.String> data = null;
    @org.jetbrains.annotations.NotNull()
    private final com.konexus.classroom.adapter.ViewOnClick onClick = null;
    private int pos = 0;
    
    public AdapterRecycleEvent(@org.jetbrains.annotations.NotNull()
    android.content.Context con, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> data, @org.jetbrains.annotations.NotNull()
    com.konexus.classroom.adapter.ViewOnClick onClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getCon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.konexus.classroom.adapter.ViewOnClick getOnClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.konexus.classroom.adapter.AdapterRecycleEvent.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.konexus.classroom.adapter.AdapterRecycleEvent.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    private final void setBG(int position, com.konexus.classroom.adapter.AdapterRecycleEvent.ViewHolder hol) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    private final void setBGAll(com.konexus.classroom.adapter.AdapterRecycleEvent.ViewHolder hol) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecycleEvent$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "rel", "Landroid/widget/RelativeLayout;", "getRel", "()Landroid/widget/RelativeLayout;", "txevent", "Landroid/widget/TextView;", "getTxevent", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txevent = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout rel = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxevent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getRel() {
            return null;
        }
    }
}