package com.example.bibleapp.core

import android.app.Application
import com.example.bibleapp.data.net.BookService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BibleApp : Application(){

    private companion object{
        const val BASE_URL = "https://bible-go-api.rkeplin.com/v1/"
    }

    lateinit var service: BookService

    override fun onCreate() {
        super.onCreate()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        service = retrofit.create(BookService::class.java)
    }

}