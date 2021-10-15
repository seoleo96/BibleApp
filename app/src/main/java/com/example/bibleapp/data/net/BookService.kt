package com.example.bibleapp.data.net

import retrofit2.http.GET

interface BookService {

    @GET("books")
    suspend fun fetchBook() : List<BookCloudModel>
}