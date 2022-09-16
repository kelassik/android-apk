package com.konexus.classroom.service

import com.konexus.classroom.modeldata.ModelResultTask
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndPoint {

    @GET("sampledata.php")
    fun getdata(@Query("NIS")num : Int?): Call<ArrayList<ModelResultTask>>
}