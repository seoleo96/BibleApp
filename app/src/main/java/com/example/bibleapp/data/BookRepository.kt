package com.example.bibleapp.data


interface BookRepository {

    suspend fun fetchBooks(): BookData

    class Base(private val booksCloudDataSource: BooksCloudDataSource) : BookRepository {
        override suspend fun fetchBooks() = try {
            BookData.Success(booksCloudDataSource.fetchBooks())
        } catch (e: Exception) {
            BookData.Fail(e)
        }
    }
}
