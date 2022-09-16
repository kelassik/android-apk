package com.konexus.classroom.service;

import com.konexus.classroom.modeldata.ModelResultTask;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/konexus/classroom/service/ApiEndPoint;", "", "getdata", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/konexus/classroom/modeldata/ModelResultTask;", "Lkotlin/collections/ArrayList;", "num", "", "(Ljava/lang/Integer;)Lretrofit2/Call;", "app_debug"})
public abstract interface ApiEndPoint {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "sampledata.php")
    public abstract retrofit2.Call<java.util.ArrayList<com.konexus.classroom.modeldata.ModelResultTask>> getdata(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "NIS")
    java.lang.Integer num);
}