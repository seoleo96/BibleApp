package com.example.bibleapp.data.net

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.data.BookData

interface BookCloudToDataMapper : Abstract.Mapper {

    fun map(id: Int, name: String): BookData

//    class Base : BookCloudToDataMapper{
//        override fun map(id: Int, name: String): BookData {
//            return BookData(id,name)
//        }
//    }


}