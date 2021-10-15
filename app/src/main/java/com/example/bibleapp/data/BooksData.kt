package com.example.bibleapp.data

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.core.Book
import com.example.bibleapp.domain.BookDomain
import java.lang.Exception

sealed class BooksData : Abstract.Object<BookDomain, BooksDataToDomainMapper>(){


    class Success(private val list: List<Book>) : BooksData() {
        override fun map(mapper: BooksDataToDomainMapper): BookDomain {
            return mapper.map(list)
        }
    }

    class Fail(private val e: Exception) : BooksData(){
        override fun map(mapper: BooksDataToDomainMapper): BookDomain {
            return mapper.map(e)
        }
    }

}