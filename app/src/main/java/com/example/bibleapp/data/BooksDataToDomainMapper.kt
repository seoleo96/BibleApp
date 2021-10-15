package com.example.bibleapp.data

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.data.net.BookCloudModel
import com.example.bibleapp.domain.BookDomain
import java.lang.Exception

interface BooksDataToDomainMapper : Abstract.Mapper{

    fun map(list: List<BookCloudModel>) : BookDomain

    fun map(e : Exception) : BookDomain

    class Base : BooksDataToDomainMapper{
        override fun map(list: List<BookCloudModel>): BookDomain {
            return BookDomain.Success()
        }

        override fun map(e: Exception): BookDomain {
            return BookDomain.Fail()
        }
    }

}