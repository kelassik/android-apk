package com.konexus.classroom.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.konexus.classroom.R;
import com.konexus.classroom.modeldata.ModelScedule;
import com.konexus.classroom.modeldata.ModelScheduleTeacher;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u001e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/konexus/classroom/adapter/AdapteritemScheduleteacherRV;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/konexus/classroom/adapter/AdapteritemScheduleteacherRV$ViewHolder;", "context", "Landroid/content/Context;", "data", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelScheduleTeacher;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showDialog", "view", "Landroid/view/View;", "ind", "ViewHolder", "app_debug"})
public final class AdapteritemScheduleteacherRV extends androidx.recyclerview.widget.RecyclerView.Adapter<com.konexus.classroom.adapter.AdapteritemScheduleteacherRV.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.konexus.classroom.modeldata.ModelScheduleTeacher> data = null;
    
    public AdapteritemScheduleteacherRV(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.konexus.classroom.modeldata.ModelScheduleTeacher> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.konexus.classroom.adapter.AdapteritemScheduleteacherRV.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.konexus.classroom.adapter.AdapteritemScheduleteacherRV.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, int ind) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/konexus/classroom/adapter/AdapteritemScheduleteacherRV$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "lyout", "Landroid/widget/LinearLayout;", "getLyout", "()Landroid/widget/LinearLayout;", "txMapel1", "Landroid/widget/TextView;", "getTxMapel1", "()Landroid/widget/TextView;", "txMapel2", "getTxMapel2", "txMapel3", "getTxMapel3", "txMapel4", "getTxMapel4", "txMapel5", "getTxMapel5", "txMapel6", "getTxMapel6", "txMapel7", "getTxMapel7", "txMapel8", "getTxMapel8", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel1 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel2 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel3 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel4 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel5 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel6 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel7 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txMapel8 = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout lyout = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxMapel8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLyout() {
            return null;
        }
    }
}