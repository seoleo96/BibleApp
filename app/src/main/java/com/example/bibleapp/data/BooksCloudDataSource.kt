package com.example.bibleapp.data

import com.example.bibleapp.data.net.BookCloudModel
import com.example.bibleapp.data.net.BookService

interface BooksCloudDataSource {

    suspend fun fetchBooks() : List<BookCloudModel>

    class Base(private val bookService: BookService) : BooksCloudDataSource{
        override suspend fun fetchBooks(): List<BookCloudModel> {
            return bookService.fetchBook()
        }
    }
}