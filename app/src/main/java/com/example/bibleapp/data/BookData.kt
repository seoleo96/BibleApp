package com.example.bibleapp.data

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.data.net.BookCloudModel
import com.example.bibleapp.domain.BookDomain
import java.lang.Exception

sealed class BookData : Abstract.Object<BookDomain, BooksDataToDomainMapper>(){


    class Success(private val list: List<BookCloudModel>) : BookData() {
        override fun map(mapper: BooksDataToDomainMapper): BookDomain {
            return mapper.map(list)
        }
    }

    class Fail(private val e: Exception) : BookData(){
        override fun map(mapper: BooksDataToDomainMapper): BookDomain {
            return mapper.map(e)
        }
    }

}