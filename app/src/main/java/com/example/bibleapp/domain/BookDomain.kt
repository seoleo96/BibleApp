package com.example.bibleapp.domain

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.data.net.BookCloudModel
import com.example.bibleapp.presentation.BookUi
import java.lang.Exception

sealed class BookDomain : Abstract.Object<BookUi, Abstract.Mapper.Empty>() {

    class Success : BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }
    }

    class Fail : BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }
    }
}