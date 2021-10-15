package com.example.bibleapp.data.net

import com.example.bibleapp.core.Abstract
import com.example.bibleapp.core.Book
import com.google.gson.annotations.SerializedName


data class BookCloudModel(
    @SerializedName("id")
    private val id: Int,
    @SerializedName("name")
    private val name: String
) : Abstract.Object<Book, BookCloudToDataMapper>() {
    override fun map(mapper: BookCloudToDataMapper): Book {
        return mapper.map(id, name)
    }
}
