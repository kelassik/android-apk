package com.konexus.classroom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import com.konexus.classroom.R;
import com.konexus.classroom.control.JoinDialogSekolah;
import com.konexus.classroom.modeldata.ModelDataRecycleClass;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecyclerViewClass;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/konexus/classroom/adapter/AdapterRecyclerViewClass$ViewHolder;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "data", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelDataRecycleClass;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "dialog", "Lcom/konexus/classroom/control/JoinDialogSekolah;", "getSupportFragment", "()Landroidx/fragment/app/FragmentManager;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdapterRecyclerViewClass extends androidx.recyclerview.widget.RecyclerView.Adapter<com.konexus.classroom.adapter.AdapterRecyclerViewClass.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentManager supportFragment = null;
    private final java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataRecycleClass> data = null;
    private final com.konexus.classroom.control.JoinDialogSekolah dialog = null;
    
    public AdapterRecyclerViewClass(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.konexus.classroom.modeldata.ModelDataRecycleClass> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getSupportFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.konexus.classroom.adapter.AdapterRecyclerViewClass.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.konexus.classroom.adapter.AdapterRecyclerViewClass.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecyclerViewClass$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "btnJoin", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnJoin", "()Landroidx/appcompat/widget/AppCompatButton;", "txClassName", "Landroid/widget/TextView;", "getTxClassName", "()Landroid/widget/TextView;", "txClassType", "getTxClassType", "txStudentSize", "getTxStudentSize", "txTeacherName", "getTxTeacherName", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txClassName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txClassType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txStudentSize = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txTeacherName = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatButton btnJoin = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxClassName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxClassType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxStudentSize() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxTeacherName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatButton getBtnJoin() {
            return null;
        }
    }
}