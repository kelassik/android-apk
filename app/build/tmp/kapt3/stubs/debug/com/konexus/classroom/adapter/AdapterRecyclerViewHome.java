package com.konexus.classroom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.konexus.classroom.R;
import com.konexus.classroom.control.RVDialogMenuHome;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecyclerViewHome;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/konexus/classroom/adapter/AdapterRecyclerViewHome$ViewHolder;", "supportFragmentManeger", "Landroidx/fragment/app/FragmentManager;", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "dialog", "Lcom/konexus/classroom/control/RVDialogMenuHome;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdapterRecyclerViewHome extends androidx.recyclerview.widget.RecyclerView.Adapter<com.konexus.classroom.adapter.AdapterRecyclerViewHome.ViewHolder> {
    private final androidx.fragment.app.FragmentManager supportFragmentManeger = null;
    private final java.util.ArrayList<java.lang.Integer> data = null;
    private final com.konexus.classroom.control.RVDialogMenuHome dialog = null;
    
    public AdapterRecyclerViewHome(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragmentManeger, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.konexus.classroom.adapter.AdapterRecyclerViewHome.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.konexus.classroom.adapter.AdapterRecyclerViewHome.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/konexus/classroom/adapter/AdapterRecyclerViewHome$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "crv", "Landroidx/cardview/widget/CardView;", "getCrv", "()Landroidx/cardview/widget/CardView;", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView img = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView crv = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCrv() {
            return null;
        }
    }
}