package com.example.bibleapp.data.net

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.core.Book

interface BookCloudToDataMapper : Abstract.Mapper {

    fun map(id: Int, name: String): Book

    class Base : BookCloudToDataMapper {
        override fun map(id: Int, name: String) = Book(id, name)
    }
}