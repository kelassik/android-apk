package com.konexus.classroom.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiServices {

    private const val BASE_URL = "https://sampledatakelas.000webhostapp.com/"

    val instance : ApiEndPoint by lazy {
        val okHttpClient = OkHttpClient.Builder()
            .callTimeout(5, TimeUnit.MINUTES)
            .connectTimeout(5, TimeUnit.MINUTES)
            .readTimeout(5, TimeUnit.MINUTES)
            .writeTimeout(5, TimeUnit.MINUTES)
            .build()
        val retrovit : Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrovit.create(ApiEndPoint::class.java)

    }
}