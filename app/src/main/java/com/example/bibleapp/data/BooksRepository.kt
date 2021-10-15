package com.example.bibleapp.data


interface BooksRepository {

    suspend fun fetchBooks(): BooksData

    class Base(
        private val booksCloudDataSource: BooksCloudDataSource,
        private val booksCloudMapper: BooksCloudMapper
    ) : BooksRepository {
        override suspend fun fetchBooks() = try {
            val cloudBooksList = booksCloudDataSource.fetchBooks()
            BooksData.Success(booksCloudMapper.map(cloudBooksList))
        } catch (e: Exception) {
            BooksData.Fail(e)
        }
    }
}
