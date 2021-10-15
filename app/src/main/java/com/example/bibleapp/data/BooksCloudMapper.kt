package com.example.bibleapp.data

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.core.Book
import com.example.bibleapp.data.net.BookCloudModel
import com.example.bibleapp.data.net.BookCloudToDataMapper

interface BooksCloudMapper : Abstract.Mapper {

    fun map(cloudList: List<BookCloudModel>): List<Book>

    class Base(private val bookCloudMapper: BookCloudToDataMapper) : BooksCloudMapper {
        override fun map(cloudList: List<BookCloudModel>) = cloudList.map {
            it.map(bookCloudMapper)
        }
    }
}
