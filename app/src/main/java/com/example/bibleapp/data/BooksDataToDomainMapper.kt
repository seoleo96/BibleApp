package com.example.bibleapp.data

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.core.Book
import com.example.bibleapp.data.net.BookCloudModel
import com.example.bibleapp.domain.BookDomain
import java.lang.Exception

interface BooksDataToDomainMapper : Abstract.Mapper{

    fun map(list: List<Book>) : BookDomain

    fun map(e : Exception) : BookDomain


}